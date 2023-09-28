/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.security;

import java.security.Provider;
import java.security.SecureRandom;
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
public class SecurityProviderUtilIT {
    
    public SecurityProviderUtilIT() {
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
     * Test of init method, of class SecurityProviderUtil.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        String expResult = "";
        String result = SecurityProviderUtil.init();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProvider method, of class SecurityProviderUtil.
     */
    @Test
    public void testGetProvider() {
        System.out.println("getProvider");
        Provider expResult = null;
        Provider result = SecurityProviderUtil.getProvider();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inFIPSMode method, of class SecurityProviderUtil.
     */
    @Test
    public void testInFIPSMode() {
        System.out.println("inFIPSMode");
        boolean expResult = false;
        boolean result = SecurityProviderUtil.inFIPSMode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPRNG method, of class SecurityProviderUtil.
     */
    @Test
    public void testGetPRNG() {
        System.out.println("getPRNG");
        SecureRandom expResult = null;
        SecureRandom result = SecurityProviderUtil.getPRNG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFipsProvider method, of class SecurityProviderUtil.
     */
    @Test
    public void testRemoveFipsProvider() {
        System.out.println("removeFipsProvider");
        SecurityProviderUtil.removeFipsProvider();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
