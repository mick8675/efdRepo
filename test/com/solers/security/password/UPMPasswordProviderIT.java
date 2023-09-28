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
public class UPMPasswordProviderIT {
    
    public UPMPasswordProviderIT() {
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
     * Test of getPassword method, of class UPMPasswordProvider.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String key = "";
        UPMPasswordProvider instance = null;
        String expResult = "";
        String result = instance.getPassword(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class UPMPasswordProvider.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String key = "";
        String password = "";
        UPMPasswordProvider instance = null;
        instance.setPassword(key, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class UPMPasswordProvider.
     */
    @Test
    public void testInitialize_0args() {
        System.out.println("initialize");
        UPMPasswordProvider instance = null;
        instance.initialize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class UPMPasswordProvider.
     */
    @Test
    public void testInitialize_charArr() throws Exception {
        System.out.println("initialize");
        char[] password = null;
        UPMPasswordProvider instance = null;
        instance.initialize(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
