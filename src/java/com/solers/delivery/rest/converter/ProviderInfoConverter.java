package com.solers.delivery.rest.converter;

import java.util.Set;

import com.solers.delivery.inventory.plugin.provider.ProviderInfo;
import com.solers.delivery.inventory.plugin.provider.StandardProviderInfo;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.javabean.JavaBeanConverter;

public class ProviderInfoConverter extends Converter {
    @Override
    protected XStream initialize(XStream stream) {
        stream.setMode(XStream.NO_REFERENCES);
        stream.alias("plugins", Set.class);
        stream.alias("plugin", ProviderInfo.class);
        stream.alias("plugin", StandardProviderInfo.class);
        
        stream.registerConverter(new JavaBeanConverter(stream.getMapper()), XStream.PRIORITY_VERY_LOW);
        return stream;
    }
}
