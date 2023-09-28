package com.solers.delivery.rest.converter;

import java.util.List;

import org.restlet.representation.Representation;

import com.solers.delivery.domain.AllowedHost;
import com.solers.delivery.domain.ConsumerContentSet;
import com.solers.delivery.domain.ContentSet;
import com.solers.delivery.domain.FileFilter;
import com.solers.delivery.domain.FtpConnection;
import com.solers.delivery.domain.ResourceParameter;
import com.solers.delivery.domain.ScheduleExpression;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.javabean.JavaBeanConverter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContentSetConverter extends Converter {
   
    @SuppressWarnings("unchecked")
    public <T extends ContentSet> T from(Representation r) {        
        try {
            return (T) convert(r);
        } catch (IOException ex) {
            Logger.getLogger(ContentSetConverter.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    public <T extends ContentSet> List<T> fromList(Representation r) {
        try {
            return (List<T>) convert(r);
        } catch (IOException ex) {
            Logger.getLogger(ContentSetConverter.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    @Override
    protected XStream initialize(XStream stream) {
        stream.setMode(XStream.NO_REFERENCES);
        stream.alias("sets", List.class);
        stream.alias("supplierContentSet", ContentSet.class);
        stream.alias("consumerContentSet", ConsumerContentSet.class);
        stream.alias("filter", FileFilter.class);
        stream.alias("ftpConnection", FtpConnection.class);
        stream.alias("allowedHost", AllowedHost.class);
        stream.alias("parameter", ResourceParameter.class);
        stream.alias("scheduleExpression", ScheduleExpression.class);
        
        stream.omitField(ContentSet.class, "fileFilters");
        stream.omitField(ContentSet.class, "resourceParameters");
        stream.omitField(ContentSet.class, "resourceParametersAsMap");
        stream.omitField(ContentSet.class, "aliases");
        stream.omitField(ContentSet.class, "expressions");
        
        stream.omitField(ConsumerContentSet.class, "fileFilters");
        stream.omitField(ConsumerContentSet.class, "aliases");
        stream.omitField(ConsumerContentSet.class, "allowedHosts");
        stream.omitField(ConsumerContentSet.class, "resourceParameters");
        stream.omitField(ConsumerContentSet.class, "resourceParametersAsMap");
        stream.omitField(ConsumerContentSet.class, "expressions");
        
        //stream.omitField(FileFilter.class, "id");        
        //stream.omitField(FtpConnection.class, "id");
        stream.omitField(FtpConnection.class, "plainPassword");
        stream.omitField(ResourceParameter.class, "id");
        stream.omitField(ResourceParameter.class, "persistedValue");
       
        stream.registerConverter(new JavaBeanConverter(stream.getMapper()), XStream.PRIORITY_VERY_LOW);
        
        return stream;
    }
}
