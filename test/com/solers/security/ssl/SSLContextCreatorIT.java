/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security.ssl;

import java.io.InputStream;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
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
public class SSLContextCreatorIT {
    
    public SSLContextCreatorIT() {
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
     * Test of init method, of class SSLContextCreator.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        SSLContextCreator instance = null;
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTruststore method, of class SSLContextCreator.
     */
    @Test
    public void testGetTruststore() throws Exception {
        System.out.println("getTruststore");
        SSLContextCreator instance = null;
        InputStream expResult = null;
        InputStream result = instance.getTruststore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKeystore method, of class SSLContextCreator.
     */
    @Test
    public void testGetKeystore() throws Exception {
        System.out.println("getKeystore");
        SSLContextCreator instance = null;
        InputStream expResult = null;
        InputStream result = instance.getKeystore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrustManagers method, of class SSLContextCreator.
     */
    @Test
    public void testGetTrustManagers() {
        System.out.println("getTrustManagers");
        String truststorePassword = "";
        SSLContextCreator instance = null;
        TrustManager[] expResult = null;
        TrustManager[] result = instance.getTrustManagers(truststorePassword);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKeyManagers method, of class SSLContextCreator.
     */
    @Test
    public void testGetKeyManagers() {
        System.out.println("getKeyManagers");
        String keyPassword = "";
        String keystorePassword = "";
        SSLContextCreator instance = null;
        KeyManager[] expResult = null;
        KeyManager[] result = instance.getKeyManagers(keyPassword, keystorePassword);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
