package com.solers.security.jetty;

import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;


public class CustomServerConnector extends ServerConnector {

    public CustomServerConnector(Server server, HttpConnectionFactory httpConnectionFactory) {
        super(server, httpConnectionFactory);
    }

    

}
