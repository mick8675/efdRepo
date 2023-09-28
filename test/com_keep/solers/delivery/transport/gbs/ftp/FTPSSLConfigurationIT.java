/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs.ftp;

import javax.net.ssl.SSLContext;
import org.apache.ftpserver.ssl.ClientAuth;
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
public class FTPSSLConfigurationIT {
    
    public FTPSSLConfigurationIT() {
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
     * Test of getSSLContext method, of class FTPSSLConfiguration.
     */
    @Test
    public void testGetSSLContext_0args() throws Exception {
        System.out.println("getSSLContext");
        FTPSSLConfiguration instance = new FTPSSLConfiguration();
        SSLContext expResult = null;
        SSLContext result = instance.getSSLContext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSSLContext method, of class FTPSSLConfiguration.
     */
    @Test
    public void testGetSSLContext_String() throws Exception {
        System.out.println("getSSLContext");
        String protocol = "";
        FTPSSLConfiguration instance = new FTPSSLConfiguration();
        SSLContext expResult = null;
        SSLContext result = instance.getSSLContext(protocol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnabledCipherSuites method, of class FTPSSLConfiguration.
     */
    @Test
    public void testGetEnabledCipherSuites() {
        System.out.println("getEnabledCipherSuites");
        FTPSSLConfiguration instance = new FTPSSLConfiguration();
        String[] expResult = null;
        String[] result = instance.getEnabledCipherSuites();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientAuth method, of class FTPSSLConfiguration.
     */
    @Test
    public void testGetClientAuth() {
        System.out.println("getClientAuth");
        FTPSSLConfiguration instance = new FTPSSLConfiguration();
        ClientAuth expResult = null;
        ClientAuth result = instance.getClientAuth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
