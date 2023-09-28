package com.solers.security.jetty;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.apache.commons.httpclient.HttpVersion;
import org.apache.log4j.Logger;
import org.eclipse.jetty.server.HttpConfiguration;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.SslConnectionFactory;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.springframework.stereotype.Component;

@Component
public class SSLConnector extends ServerConnector 
{
    private final SSLServerSocketFactory factory;
    private String server;
    private boolean statsOn;
    private boolean needClientAuth;
    private HttpConfiguration httpConfiguration;
    private int port;
    private int sessionTimeout;
    private static final Logger log = Logger.getLogger(SSLConnector.class);
    //default constructor 
    /*public SSLConnector(Server server) throws Exception 
    {
        this(server);
    }*/
    
    public SSLConnector(Server server, SslContextFactory sslContextFactory, int port) throws Exception 
    {   
        super(server);
        log.debug("\n\n~~~~~~~~~\nSSLConnector.java: sslContextFactory dump:\n"+sslContextFactory.dump()+"\n~~~~~~~~~~\n\n");
        SslConnectionFactory sslConnectionFactory = new SslConnectionFactory(sslContextFactory, sslContextFactory.getProtocol());//HttpVersion.HTTP_1_1.toString()
        
        addConnectionFactory(sslConnectionFactory);

        factory = sslConnectionFactory.getSslContextFactory().getSslContext().getServerSocketFactory();
        setPort(port); // Explicitly set the port
        
    }
    
    //with HttpConfiguration
    public SSLConnector(Server server, SslContextFactory sslContextFactory, int port, HttpConfiguration httpConfiguration) throws Exception 
    {
        
        super(server);
        //System.out.print(Arrays.toString(SSLSocketFactory.getSupportedProtocols()));
        log.debug("\n\n~~~~~~~~~\nSSLConnector.java: sslContextFactory dump:\n" + sslContextFactory.dump() + "\n~~~~~~~~~~\n\n");
        SslConnectionFactory sslConnectionFactory = new SslConnectionFactory(sslContextFactory, sslContextFactory.getProtocol());

        // Set the HttpConfiguration for the SSL connector
        HttpConnectionFactory httpConnectionFactory = new HttpConnectionFactory(httpConfiguration);

        addConnectionFactory(sslConnectionFactory);
        addConnectionFactory(httpConnectionFactory);

        factory = sslConnectionFactory.getSslContextFactory().getSslContext().getServerSocketFactory();
        setPort(port);
}

    @PostConstruct
    public void init() {
        this.getServer().addConnector(this);
    }

       
    protected SSLServerSocketFactory createFactory() throws Exception {
        return factory;
    }

    public void setHttpConfiguration(HttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public void setStatsOn(boolean statsOn) {
        this.statsOn = statsOn;
    }

    public void setNeedClientAuth(boolean needClientAuth) {
        this.needClientAuth = needClientAuth;
    }
    
    public void setPort(int port){
        this.port=port;
        
        
    }
    
    public void setSessionTimeout(int sessionTimeout) {
        // Set the session timeout value to the internal field or perform any necessary logic
        this.sessionTimeout = sessionTimeout;
    }
}




/*old code

package com.solers.security.jetty;

import javax.net.ssl.SSLContext;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.util.ssl.SslContextFactory;

public class SSLConnector extends SslSocketConnector 
{

    private final SSLServerSocketFactory factory;
    
    public SSLConnector() throws Exception {
        factory = SSLContext.getDefault().getServerSocketFactory();
    }
 
    @Override
    protected SSLServerSocketFactory createFactory() throws Exception {
        return factory;
    }
}
*/

/*keep, 
package com.solers.security.jetty;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

import org.restlet.Server;
import org.restlet.data.Protocol;

//import org.mortbay.jetty.security.SslSocketConnector;

//import org.eclipse.jetty.server.ssl.SslSocketConnector;



public class SSLConnector extends Server {

    private final SSLServerSocketFactory factory;
    private String host;
    private int port;
    private boolean statsOn;
    private boolean needClientAuth;
    
    public SSLConnector() throws Exception {
        super(Protocol.HTTPS);
        factory = SSLContext.getDefault().getServerSocketFactory();
    }

    //@Override
    protected SSLServerSocketFactory createFactory() throws Exception {
        return factory;
    }

    public static void main(String[] args) throws Exception {
        SSLConnector connector = new SSLConnector();
        connector.start();
        System.out.println("Server started on port: " + connector.getPort());
        //keep for testing
    }
    
    public void setHost(String host) 
    {
        this.host = host;
    }
    
    public void setPort(int port){
        this.port=port;
    }
    
    public void setStatsOn(boolean statsOn) {
        this.statsOn = statsOn;
    }
    
    public void setNeedClientAuth(boolean needClientAuth) {
        this.needClientAuth = needClientAuth;
    }
}

*/

/*old code
package com.solers.security.jetty;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

import org.mortbay.jetty.security.SslSocketConnector;

public class SSLConnector extends SslSocketConnector {

    private final SSLServerSocketFactory factory;
    
    public SSLConnector() throws Exception {
        factory = SSLContext.getDefault().getServerSocketFactory();
    }
 
    @Override
    protected SSLServerSocketFactory createFactory() throws Exception {
        return factory;
    }
}
*/