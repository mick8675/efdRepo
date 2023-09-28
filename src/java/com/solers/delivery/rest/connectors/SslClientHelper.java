package com.solers.delivery.rest.connectors;

import java.io.IOException;
import java.security.GeneralSecurityException;

import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

import org.restlet.Client;
//import org.restlet.engine.http.StreamClientHelper;
import org.restlet.engine.connector.HttpClientHelper;
//import org.restlet.engine.connector.StreamClientHelper;

public class SslClientHelper extends HttpClientHelper 
{
    
    public SslClientHelper() 
    {
        this(null);
    }
    
    
    public SslClientHelper(Client client) 
    {
        super(client);
    }

    protected SocketFactory createSecureSocketFactory() throws IOException, GeneralSecurityException 
    {
        return SSLContext.getDefault().getSocketFactory();
    }
    
    
    
}
