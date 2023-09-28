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

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class RestfulAuthenticationDetailsIT {
    
    public RestfulAuthenticationDetailsIT() {
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
     * Test of getRemoteAddress method, of class RestfulAuthenticationDetails.
     */
    @Test
    public void testGetRemoteAddress() {
        System.out.println("getRemoteAddress");
        RestfulAuthenticationDetails instance = new RestfulAuthenticationDetails();
        String expResult = "";
        String result = instance.getRemoteAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRemoteAddress method, of class RestfulAuthenticationDetails.
     */
    @Test
    public void testSetRemoteAddress() {
        System.out.println("setRemoteAddress");
        String remoteAddress = "";
        RestfulAuthenticationDetails instance = new RestfulAuthenticationDetails();
        instance.setRemoteAddress(remoteAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionId method, of class RestfulAuthenticationDetails.
     */
    @Test
    public void testGetSessionId() {
        System.out.println("getSessionId");
        RestfulAuthenticationDetails instance = new RestfulAuthenticationDetails();
        String expResult = "";
        String result = instance.getSessionId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionId method, of class RestfulAuthenticationDetails.
     */
    @Test
    public void testSetSessionId() {
        System.out.println("setSessionId");
        String sessionId = "";
        RestfulAuthenticationDetails instance = new RestfulAuthenticationDetails();
        instance.setSessionId(sessionId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class RestfulAuthenticationDetails.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        RestfulAuthenticationDetails instance = new RestfulAuthenticationDetails();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class RestfulAuthenticationDetails.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        RestfulAuthenticationDetails instance = new RestfulAuthenticationDetails();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class RestfulAuthenticationDetails.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RestfulAuthenticationDetails instance = new RestfulAuthenticationDetails();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
