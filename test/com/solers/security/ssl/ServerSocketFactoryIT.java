/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security.ssl;

import java.net.InetAddress;
import java.net.ServerSocket;
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
public class ServerSocketFactoryIT {
    
    public ServerSocketFactoryIT() {
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
     * Test of getDefaultCipherSuites method, of class ServerSocketFactory.
     */
    @Test
    public void testGetDefaultCipherSuites() {
        System.out.println("getDefaultCipherSuites");
        ServerSocketFactory instance = null;
        String[] expResult = null;
        String[] result = instance.getDefaultCipherSuites();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupportedCipherSuites method, of class ServerSocketFactory.
     */
    @Test
    public void testGetSupportedCipherSuites() {
        System.out.println("getSupportedCipherSuites");
        ServerSocketFactory instance = null;
        String[] expResult = null;
        String[] result = instance.getSupportedCipherSuites();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createServerSocket method, of class ServerSocketFactory.
     */
    @Test
    public void testCreateServerSocket_int() throws Exception {
        System.out.println("createServerSocket");
        int port = 0;
        ServerSocketFactory instance = null;
        ServerSocket expResult = null;
        ServerSocket result = instance.createServerSocket(port);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createServerSocket method, of class ServerSocketFactory.
     */
    @Test
    public void testCreateServerSocket_int_int() throws Exception {
        System.out.println("createServerSocket");
        int port = 0;
        int backlog = 0;
        ServerSocketFactory instance = null;
        ServerSocket expResult = null;
        ServerSocket result = instance.createServerSocket(port, backlog);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createServerSocket method, of class ServerSocketFactory.
     */
    @Test
    public void testCreateServerSocket_3args() throws Exception {
        System.out.println("createServerSocket");
        int port = 0;
        int backlog = 0;
        InetAddress ifAddress = null;
        ServerSocketFactory instance = null;
        ServerSocket expResult = null;
        ServerSocket result = instance.createServerSocket(port, backlog, ifAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
