package com.solers.delivery.security;


import org.springframework.beans.factory.FactoryBean;

import java.security.SecureRandom;

public class PRNGFactoryBean implements FactoryBean<SecureRandom> {

    @Override
    public SecureRandom getObject() throws Exception {
        return com.solers.delivery.security.SecurityProviderUtil.getPRNG();
    }

    @Override
    public Class<?> getObjectType() {
        return SecureRandom.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}

