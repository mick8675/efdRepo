package com.solers.delivery.rest.converter;

import java.util.Set;

import com.solers.delivery.inventory.plugin.provider.InventoryParameter;
import com.solers.delivery.inventory.plugin.provider.Parameter;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.javabean.JavaBeanConverter;

public class ParameterConverter extends Converter {
    @Override
    protected XStream initialize(XStream stream) {
        stream.setMode(XStream.NO_REFERENCES);
        stream.alias("parameters", Set.class);
        stream.alias("parameter", Parameter.class);
        stream.alias("parameter", InventoryParameter.class);
        
        stream.omitField(InventoryParameter.class, "allowToString");
        
        stream.registerConverter(new JavaBeanConverter(stream.getMapper()), XStream.PRIORITY_VERY_LOW);
        return stream;
    }
}
