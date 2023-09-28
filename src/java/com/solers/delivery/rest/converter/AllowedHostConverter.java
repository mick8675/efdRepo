package com.solers.delivery.rest.converter;

import org.restlet.representation.Representation;

import com.solers.delivery.domain.AllowedHost;
import com.thoughtworks.xstream.XStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AllowedHostConverter extends Converter {

    public AllowedHost convertAllowedHost(Representation r) {
        try {
            return (AllowedHost) super.convert(r);
        } catch (IOException ex) {
            Logger.getLogger(AllowedHostConverter.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    protected XStream initialize(XStream stream) {
        stream.setMode(XStream.NO_REFERENCES);
        stream.alias("allowedHost", AllowedHost.class);
        return stream;
    }

}


/*package com.solers.delivery.rest.converter;

import org.restlet.representation.Representation;

import com.solers.delivery.domain.AllowedHost;
import com.thoughtworks.xstream.XStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.restlet.representation.StringRepresentation;

public class AllowedHostConverter extends Converter {

    private final XStream xstream;

    public AllowedHostConverter() {
        xstream = initialize(new XStream());
    }

    public AllowedHost convertAllowedHost(Representation r) //throws IOException 
    {
        try 
        {
            return (AllowedHost) xstream.fromXML(r.getText());
        } 
        catch (IOException ex) {
            Logger.getLogger(AllowedHostConverter.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public Representation toRepresentation(AllowedHost host) {
        String xml = xstream.toXML(host);
        return new StringRepresentation(xml);
    }

    protected XStream initialize(XStream stream) {
        stream.setMode(XStream.NO_REFERENCES);
        stream.alias("allowedHost", AllowedHost.class);
        return stream;
    }
}
*/

/* old code below


package com.solers.delivery.rest.converter;

import org.restlet.representation.Representation;

import com.solers.delivery.domain.AllowedHost;
import com.thoughtworks.xstream.XStream;

public class AllowedHostConverter extends Converter {

    public AllowedHost convertAllowedHost(Representation r) {
        return (AllowedHost) super.convert(r);
    }
    
    @Override
    protected XStream initialize(XStream stream) {
        stream.setMode(XStream.NO_REFERENCES);
        stream.alias("allowedHost", AllowedHost.class);
        return stream;
    }

}
*/