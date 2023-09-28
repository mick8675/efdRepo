/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security.ssl;

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
public class ClientSocketFactoryIT {
    
    public ClientSocketFactoryIT() {
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
     * Test of createSocket method, of class ClientSocketFactory.
     */
    @Test
    public void testCreateSocket_5args() throws Exception {
        System.out.println("createSocket");
        String host = "";
        int port = 0;
        InetAddress localAddress = null;
        int localPort = 0;
        int timeout = 0;
        ClientSocketFactory instance = null;
        Socket expResult = null;
        Socket result = instance.createSocket(host, port, localAddress, localPort, timeout);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSocket method, of class ClientSocketFactory.
     */
    @Test
    public void testCreateSocket_4args_1() throws Exception {
        System.out.println("createSocket");
        String host = "";
        int port = 0;
        InetAddress clientHost = null;
        int clientPort = 0;
        ClientSocketFactory instance = null;
        Socket expResult = null;
        Socket result = instance.createSocket(host, port, clientHost, clientPort);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSocket method, of class ClientSocketFactory.
     */
    @Test
    public void testCreateSocket_String_int() throws Exception {
        System.out.println("createSocket");
        String host = "";
        int port = 0;
        ClientSocketFactory instance = null;
        Socket expResult = null;
        Socket result = instance.createSocket(host, port);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSocket method, of class ClientSocketFactory.
     */
    @Test
    public void testCreateSocket_InetAddress_int() throws Exception {
        System.out.println("createSocket");
        InetAddress host = null;
        int port = 0;
        ClientSocketFactory instance = null;
        Socket expResult = null;
        Socket result = instance.createSocket(host, port);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSocket method, of class ClientSocketFactory.
     */
    @Test
    public void testCreateSocket_4args_2() throws Exception {
        System.out.println("createSocket");
        InetAddress address = null;
        int port = 0;
        InetAddress localAddress = null;
        int localPort = 0;
        ClientSocketFactory instance = null;
        Socket expResult = null;
        Socket result = instance.createSocket(address, port, localAddress, localPort);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSocket method, of class ClientSocketFactory.
     */
    @Test
    public void testCreateSocket_4args_3() throws Exception {
        System.out.println("createSocket");
        Socket s = null;
        String host = "";
        int port = 0;
        boolean autoClose = false;
        ClientSocketFactory instance = null;
        Socket expResult = null;
        Socket result = instance.createSocket(s, host, port, autoClose);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSocket method, of class ClientSocketFactory.
     */
    @Test
    public void testCreateSocket_0args() throws Exception {
        System.out.println("createSocket");
        ClientSocketFactory instance = null;
        Socket expResult = null;
        Socket result = instance.createSocket();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefaultCipherSuites method, of class ClientSocketFactory.
     */
    @Test
    public void testGetDefaultCipherSuites() {
        System.out.println("getDefaultCipherSuites");
        ClientSocketFactory instance = null;
        String[] expResult = null;
        String[] result = instance.getDefaultCipherSuites();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupportedCipherSuites method, of class ClientSocketFactory.
     */
    @Test
    public void testGetSupportedCipherSuites() {
        System.out.println("getSupportedCipherSuites");
        ClientSocketFactory instance = null;
        String[] expResult = null;
        String[] result = instance.getSupportedCipherSuites();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
