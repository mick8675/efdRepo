package com.solers.delivery.rest.connectors;

import org.eclipse.jetty.server.AbstractConnectionFactory;
import org.eclipse.jetty.server.HttpConfiguration;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.SslConnectionFactory;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.springframework.stereotype.Component;

@Component
public class JettySslHelper extends ServerConnector {

   /* public JettySslHelper(Server server, SslContextFactory sslContextFactory) {
        super(server, new AbstractConnectionFactory[]{
                new SslConnectionFactory(sslContextFactory, "HTTP/1.1"),
                new HttpConnectionFactory(new HttpConfiguration())
        });
    }*/

    
     public JettySslHelper(Server server, SslContextFactory sslContextFactory) {
        super(server, new SslConnectionFactory(sslContextFactory, "HTTP/1.1"),
                new HttpConnectionFactory(new HttpConfiguration()));
    }
     
    public ServerConnector newServerConnector(Server server, AbstractConnectionFactory[] factories,
                                              HttpConfiguration config) {
        return new JettySslHelper(server, (SslContextFactory) ((SslConnectionFactory) factories[0]).getSslContextFactory());
    }
}




//old code, upgrading jetty to 9.4.51
/*package com.solers.delivery.rest.connectors;

import org.mortbay.jetty.AbstractConnector;

import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.ext.jetty.JettyServerHelper;

import com.solers.security.jetty.SSLConnector; 


public class JettySslHelper extends JettyServerHelper {
    
    public JettySslHelper() {
        this(null);
    }
    
    public JettySslHelper(Server server) {
        super(server);
        getProtocols().add(Protocol.HTTPS);
    }
    
    @Override
    protected AbstractConnector createConnector() {
        try {
            return new SSLConnector();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
*/