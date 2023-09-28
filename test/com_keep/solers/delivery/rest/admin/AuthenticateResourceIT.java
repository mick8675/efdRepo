/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.admin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.restlet.Context;
import org.restlet.data.Request;
import org.restlet.data.Response;
import org.restlet.resource.Representation;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class AuthenticateResourceIT {
    
    public AuthenticateResourceIT() {
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
     * Test of init method, of class AuthenticateResource.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Context context = null;
        Request request = null;
        Response response = null;
        AuthenticateResource instance = null;
        instance.init(context, request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allowPut method, of class AuthenticateResource.
     */
    @Test
    public void testAllowPut() {
        System.out.println("allowPut");
        AuthenticateResource instance = null;
        boolean expResult = false;
        boolean result = instance.allowPut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allowGet method, of class AuthenticateResource.
     */
    @Test
    public void testAllowGet() {
        System.out.println("allowGet");
        AuthenticateResource instance = null;
        boolean expResult = false;
        boolean result = instance.allowGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeRepresentation method, of class AuthenticateResource.
     */
    @Test
    public void testStoreRepresentation() {
        System.out.println("storeRepresentation");
        Representation entity = null;
        AuthenticateResource instance = null;
        instance.storeRepresentation(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
