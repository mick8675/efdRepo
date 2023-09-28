package com.solers.delivery.rest.converter;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
//import org.restlet.engine.variant.Variant;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import java.io.IOException;
import org.restlet.representation.Variant;

public class Converter {
    
    private static final Logger log = Logger.getLogger(Converter.class);
    
    private final Map<String, XStream> streams;

    public Converter() {
        this.streams = new HashMap<String, XStream>();
        registerStream(MediaType.TEXT_XML, initialize(new XStream()));
        registerStream(MediaType.APPLICATION_JSON, initialize(new XStream(new JettisonMappedXmlDriver())));
    }
    
    public void registerStream(MediaType mediaType, XStream stream) {
        streams.put(mediaType.getName(), stream);
    }
    
    public Representation to(Variant variant, Object arg) {
        return to(variant.getMediaType(), arg);
    }
    
    public Representation to(MediaType mediaType, Object arg) {
        XStream stream = getStream(mediaType);
        return new StringRepresentation(toString(stream, arg), mediaType);
    }
    
    protected XStream getStream(MediaType mediaType) {
        XStream stream = streams.get(mediaType.getName());
        if (stream == null) {
            throw new StreamNotFoundException(mediaType + " does not have a registered stream");
        }
        return stream;
    }
    
    public Object convert(Representation r) throws IOException {
        if (r == null) {
            return null;
        }     
        try {
            XStream stream = getStream(r.getMediaType());
            try (InputStream inputStream = getInputStream(r)) {
                return stream.fromXML(inputStream); 
            }
        } catch (StreamNotFoundException ex) {
            log.error("Couldn't find stream: " + ex.getMessage());
            throw new ConverterException("Conversion error. HTTP Response Body: " + r.getText(), ex);
        } catch (Exception ex) {
            log.error("Conversion error: " + ex.getMessage(), ex);
            throw new ConverterException(ex);
        } finally {
            r.release();
        }
    }
    
    protected XStream initialize(XStream stream) {
        return stream;
    }
    
    protected InputStream getInputStream(Representation r) throws Exception {
        return r.getStream();
    }
    
    protected String toString(XStream stream, Object arg) {
        return stream.toXML(arg);
    }
    
    public static class StreamNotFoundException extends RuntimeException {
        
        private static final long serialVersionUID = 1L;

        private StreamNotFoundException(String message) {
            super(message);
        }
    }
}


/*package com.solers.delivery.rest.converter;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.representation.Variant;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;


public class Converter {
    
    private static final Logger log = Logger.getLogger(Converter.class);
    
    private final Map<String, XStream> streams;

    public Converter() {
        this.streams = new HashMap<String, XStream>();
        registerStream(MediaType.TEXT_XML, initialize(new XStream()));
        registerStream(MediaType.APPLICATION_JSON, initialize(new XStream(new JettisonMappedXmlDriver())));
    }
    
    public void registerStream(MediaType mediaType, XStream stream) {
        streams.put(mediaType.getName(), stream);
    }
    
    public Representation to(Variant variant, Object arg) {
        return to(variant.getMediaType(), arg);
    }
    
    public Representation to(MediaType mediaType, Object arg) {
        XStream stream = getStream(mediaType);
        return new StringRepresentation(toString(stream, arg), mediaType);
    }
    
    protected XStream getStream(MediaType mediaType) {
        XStream stream = streams.get(mediaType.getName());
        if (stream == null) {
            throw new StreamNotFoundException(mediaType+" does not have a registered stream");
        }
        return stream;
    }
    
    public Object convert(Representation r) {
        if (r == null) {
            return null;
        }     
        try {
            XStream stream = getStream(r.getMediaType());
            try (InputStream inputStream = getInputStream(r)) {
                return stream.fromXML(inputStream); 
            }
        } catch (StreamNotFoundException ex) {
            log.error("Couldn't find stream: "+ex.getMessage());
            try {
                throw new ConverterException("Conversion error.  HTTP Response Body: "+r.getText(), ex);
            } catch (IOException io) {
                throw new ConverterException("Could not read response body", io);
            }
        } catch (IOException ex) {
            log.error("Conversion error: "+ex.getMessage(), ex);
            throw new ConverterException(ex);
        } finally {
            r.release();
        }
    }
    
        
    
    protected XStream initialize(XStream stream) {
        return stream;
    }
    
    protected InputStream getInputStream(Representation r) throws IOException {
        return r.getStream();
    }
    
    protected String toString(XStream stream, Object arg) {
        return stream.toXML(arg);
    }
    
    public static class StreamNotFoundException extends RuntimeException {
        
        private static final long serialVersionUID = 1L;

        private StreamNotFoundException(String message) {
            super(message);
        }
        
    }
}
*/