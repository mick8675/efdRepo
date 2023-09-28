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
import org.restlet.resource.Variant;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class AlertResourceIT {
    
    public AlertResourceIT() {
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
     * Test of allowDelete method, of class AlertResource.
     */
    @Test
    public void testAllowDelete() {
        System.out.println("allowDelete");
        AlertResource instance = null;
        boolean expResult = false;
        boolean result = instance.allowDelete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allowPut method, of class AlertResource.
     */
    @Test
    public void testAllowPut() {
        System.out.println("allowPut");
        AlertResource instance = null;
        boolean expResult = false;
        boolean result = instance.allowPut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class AlertResource.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Context context = null;
        Request request = null;
        Response response = null;
        AlertResource instance = null;
        instance.init(context, request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeRepresentations method, of class AlertResource.
     */
    @Test
    public void testRemoveRepresentations() throws Exception {
        System.out.println("removeRepresentations");
        AlertResource instance = null;
        instance.removeRepresentations();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeRepresentation method, of class AlertResource.
     */
    @Test
    public void testStoreRepresentation() throws Exception {
        System.out.println("storeRepresentation");
        Representation entity = null;
        AlertResource instance = null;
        instance.storeRepresentation(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of represent method, of class AlertResource.
     */
    @Test
    public void testRepresent() throws Exception {
        System.out.println("represent");
        Variant variant = null;
        AlertResource instance = null;
        Representation expResult = null;
        Representation result = instance.represent(variant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
