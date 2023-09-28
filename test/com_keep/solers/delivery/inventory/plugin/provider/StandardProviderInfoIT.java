/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.plugin.provider;

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
public class StandardProviderInfoIT {
    
    public StandardProviderInfoIT() {
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
     * Test of getName method, of class StandardProviderInfo.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        StandardProviderInfo instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVendor method, of class StandardProviderInfo.
     */
    @Test
    public void testGetVendor() {
        System.out.println("getVendor");
        StandardProviderInfo instance = null;
        String expResult = "";
        String result = instance.getVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVersion method, of class StandardProviderInfo.
     */
    @Test
    public void testGetVersion() {
        System.out.println("getVersion");
        StandardProviderInfo instance = null;
        String expResult = "";
        String result = instance.getVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeveloper method, of class StandardProviderInfo.
     */
    @Test
    public void testGetDeveloper() {
        System.out.println("getDeveloper");
        StandardProviderInfo instance = null;
        String expResult = "";
        String result = instance.getDeveloper();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
