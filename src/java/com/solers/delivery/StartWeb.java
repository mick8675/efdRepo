package com.solers.delivery;

import java.io.IOException;
import java.io.PrintStream;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.solers.delivery.security.SecurityProviderUtil;
import com.solers.util.LoggingOutputStream;
import java.util.Arrays;
import static javafx.application.Platform.exit;
import javax.net.ssl.SSLContext;

public final class StartWeb 
{

    private static final Logger log = Logger.getLogger(StartWeb.class);

    private ConfigurableApplicationContext ctx;
    
    public void start() 
    {
       /*try{
        SSLContext sslContext;
        sslContext = SSLContext.getDefault();
        System.out.println(Arrays.toString(sslContext.getSupportedSSLParameters().getProtocols()));
        //outputs: [TLSv1.3, TLSv1.2, TLSv1.1, TLSv1, SSLv3, SSLv2Hello]
        }
        catch(Exception e){
            e.printStackTrace();
        }*/
        
        System.setOut(new PrintStream(new LoggingOutputStream(log, Level.INFO), true));
        System.setErr(new PrintStream(new LoggingOutputStream(log, Level.ERROR), true));
        
        ctx = new ClassPathXmlApplicationContext(new String[] { "./config.xml", "./web-container.xml" });
        ctx.registerShutdownHook();
        startupComplete();
    }
    
    public void startupComplete() 
    {
        log.info("WebUI started");
    }

    public void stop() 
    {
        if (ctx != null) 
        {
            ctx.close();
        }
    }

    public static void main(String[] args) throws IOException 
    {
        SecurityProviderUtil.init();
        StartWeb app = new StartWeb();
        app.start();
    }
}

