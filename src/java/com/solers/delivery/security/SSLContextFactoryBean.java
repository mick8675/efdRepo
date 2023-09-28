package com.solers.delivery.security;

import org.springframework.beans.factory.FactoryBean;

import javax.net.ssl.SSLContext;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.springframework.stereotype.Component;

@Component
public class SSLContextFactoryBean implements FactoryBean<SSLContext> 
{

    @Override
    public SSLContext getObject() throws Exception {
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, null, SecurityProviderUtil.getPRNG());
        return sslContext;
    }

    @Override
    public Class<?> getObjectType() {
        return SSLContext.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
