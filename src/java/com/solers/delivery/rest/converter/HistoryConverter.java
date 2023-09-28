package com.solers.delivery.rest.converter;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.restlet.representation.Representation;

import com.solers.delivery.reports.history.ReportDetail;
import com.solers.delivery.reports.history.Synchronization;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;
import com.thoughtworks.xstream.converters.javabean.JavaBeanConverter;


public final class HistoryConverter extends Converter {
    
    @SuppressWarnings("unchecked")
    public <T> List<T> fromList(Representation r) throws IOException, Exception {
        return (List<T>) convert(r);
    }
    
    protected XStream initialize(XStream stream) {
        stream.setMode(XStream.NO_REFERENCES);
        
        stream.alias("list", List.class);
        stream.aliasType("list", List.class);
        stream.alias("detail", ReportDetail.class);
        stream.alias("synchronization", Synchronization.class);
        
        stream.omitField(ReportDetail.class, "transferred");
        stream.omitField(Synchronization.class, "endDate");
        
        CollectionConverter converter = new CollectionConverter(stream.getMapper()) {
            @Override
            @SuppressWarnings("unchecked")
            public boolean canConvert(Class type) {
                return Collection.class.isAssignableFrom(type);
            }
            
        };
        
        stream.registerConverter(converter);
        stream.registerConverter(new JavaBeanConverter(stream.getMapper()), XStream.PRIORITY_VERY_LOW);
        return stream;
    }
}
