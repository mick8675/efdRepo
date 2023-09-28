package com.solers.security.password;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.FieldRetrievingFactoryBean;



public class PasswordFactoryBean implements FactoryBean {

    private PasswordProvider provider;
    private String key;
    
    public void setKey(String key) {
        this.key = key;
    }
    
    @SuppressWarnings("unchecked")
    public void setEnumKey(String arg) {
        String className = arg.substring(0, arg.lastIndexOf('.'));
        String enumName = arg.substring(arg.lastIndexOf('.')+1, arg.length());
        try {
            Class clazz = Class.forName(className);
            Enum enumValue = Enum.valueOf(clazz, enumName);
            setKey(enumValue.toString());
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void setFieldKey(String arg) {
        FieldRetrievingFactoryBean bean = new FieldRetrievingFactoryBean();
        bean.setStaticField(arg);
        try {
            bean.afterPropertiesSet();
            setKey((String) bean.getObject());
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void setProvider(PasswordProvider provider) {
        this.provider = provider;
    }
    
    @Override
    public Object getObject() throws Exception {
        return provider.getPassword(key);
    }

    @Override
    public Class<?> getObjectType() {
        return String.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

}
