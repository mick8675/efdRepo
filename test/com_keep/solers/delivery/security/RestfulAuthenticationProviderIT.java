/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.security;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.core.Authentication;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class RestfulAuthenticationProviderIT {
    
    public RestfulAuthenticationProviderIT() {
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
     * Test of authenticate method, of class RestfulAuthenticationProvider.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        Authentication authentication = null;
        RestfulAuthenticationProvider instance = null;
        Authentication expResult = null;
        Authentication result = instance.authenticate(authentication);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supports method, of class RestfulAuthenticationProvider.
     */
    @Test
    public void testSupports() {
        System.out.println("supports");
        Class authentication = null;
        RestfulAuthenticationProvider instance = null;
        boolean expResult = false;
        boolean result = instance.supports(authentication);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
