package com.solers.delivery.rest;

import java.util.List;

import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.ext.jetty.internal.JettyHandler;


public class RestletJettyHandler extends JettyHandler 
{
    
    public RestletJettyHandler(Application application) {
        super(createServer(application), true);
    }
    
    @Override
    protected void doStart() throws Exception {
        
    }

    @Override
    protected void doStop() throws Exception {
        
    }

    private static Server createServer(Application application) {
        Component component = new Component();
        application.setContext(component.getContext().createChildContext());
        component.getDefaultHost().attach(application);
        return new Server(component.getContext().createChildContext(), (List<Protocol>) null, null, Protocol.UNKNOWN_PORT, component);
    }
    
}
