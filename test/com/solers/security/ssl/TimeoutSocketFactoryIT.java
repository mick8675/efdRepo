/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class TimeoutSocketFactoryIT {
    
    public TimeoutSocketFactoryIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createSocket method, of class TimeoutSocketFactory.
     */
    @Test
    public void testCreateSocket() throws Exception {
        System.out.println("createSocket");
        String host = "";
        int port = 0;
        InetAddress localAddress = null;
        int localPort = 0;
        int timeout = 0;
        TimeoutSocketFactory instance = new TimeoutSocketFactoryImpl();
        Socket expResult = null;
        Socket result = instance.createSocket(host, port, localAddress, localPort, timeout);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TimeoutSocketFactoryImpl implements TimeoutSocketFactory {

        public Socket createSocket(String host, int port, InetAddress localAddress, int localPort, int timeout) throws IOException {
            return null;
        }
    }
    
}
