/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.restlet.data.Request;
import org.restlet.data.Response;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class AcegiGuardIT {
    
    public AcegiGuardIT() {
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
     * Test of setIgnored method, of class AcegiGuard.
     */
    @Test
    public void testSetIgnored() {
        System.out.println("setIgnored");
        List<String> values = null;
        AcegiGuard instance = null;
        instance.setIgnored(values);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkSecret method, of class AcegiGuard.
     */
    @Test
    public void testCheckSecret() {
        System.out.println("checkSecret");
        Request request = null;
        Response response = null;
        String identifier = "";
        char[] secret = null;
        AcegiGuard instance = null;
        boolean expResult = false;
        boolean result = instance.checkSecret(request, response, identifier, secret);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticate method, of class AcegiGuard.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        Request request = null;
        Response response = null;
        AcegiGuard instance = null;
        int expResult = 0;
        int result = instance.authenticate(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
