/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security.password;

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
public class DefaultPasswordProviderIT {
    
    public DefaultPasswordProviderIT() {
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
     * Test of initialize method, of class DefaultPasswordProvider.
     */
    @Test
    public void testInitialize_0args() {
        System.out.println("initialize");
        DefaultPasswordProvider instance = null;
        instance.initialize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class DefaultPasswordProvider.
     */
    @Test
    public void testInitialize_charArr() {
        System.out.println("initialize");
        char[] password = null;
        DefaultPasswordProvider instance = null;
        instance.initialize(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class DefaultPasswordProvider.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String type = "";
        DefaultPasswordProvider instance = null;
        String expResult = "";
        String result = instance.getPassword(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class DefaultPasswordProvider.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String key = "";
        String value = "";
        DefaultPasswordProvider instance = null;
        instance.setPassword(key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperty method, of class DefaultPasswordProvider.
     */
    @Test
    public void testGetProperty() {
        System.out.println("getProperty");
        String key = "";
        DefaultPasswordProvider instance = null;
        String expResult = "";
        String result = instance.getProperty(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProperty method, of class DefaultPasswordProvider.
     */
    @Test
    public void testSetProperty() {
        System.out.println("setProperty");
        String key = "";
        String value = "";
        DefaultPasswordProvider instance = null;
        instance.setProperty(key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeProperty method, of class DefaultPasswordProvider.
     */
    @Test
    public void testRemoveProperty() {
        System.out.println("removeProperty");
        String key = "";
        DefaultPasswordProvider instance = null;
        instance.removeProperty(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of b64encode method, of class DefaultPasswordProvider.
     */
    @Test
    public void testB64encode() {
        System.out.println("b64encode");
        byte[] bytes = null;
        DefaultPasswordProvider instance = null;
        byte[] expResult = null;
        byte[] result = instance.b64encode(bytes);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of b64decode method, of class DefaultPasswordProvider.
     */
    @Test
    public void testB64decode() {
        System.out.println("b64decode");
        byte[] bytes = null;
        DefaultPasswordProvider instance = null;
        byte[] expResult = null;
        byte[] result = instance.b64decode(bytes);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
