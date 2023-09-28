package com.solers.delivery.rest.connectors;

import org.restlet.Context;
import org.restlet.util.ClientList;
import org.springframework.beans.factory.FactoryBean;

public class ClientListFactoryBean implements FactoryBean<ClientList> 
{

    private Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public ClientList getObject() throws Exception {
        return new ClientList(context);
    }

    @Override
    public Class<?> getObjectType() {
        return ClientList.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
