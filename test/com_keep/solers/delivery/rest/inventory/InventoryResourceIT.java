/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.inventory;

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
public class InventoryResourceIT {
    
    public InventoryResourceIT() {
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
     * Test of allowGet method, of class InventoryResource.
     */
    @Test
    public void testAllowGet() {
        System.out.println("allowGet");
        InventoryResource instance = new InventoryResource();
        boolean expResult = false;
        boolean result = instance.allowGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allowPost method, of class InventoryResource.
     */
    @Test
    public void testAllowPost() {
        System.out.println("allowPost");
        InventoryResource instance = new InventoryResource();
        boolean expResult = false;
        boolean result = instance.allowPost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allowPut method, of class InventoryResource.
     */
    @Test
    public void testAllowPut() {
        System.out.println("allowPut");
        InventoryResource instance = new InventoryResource();
        boolean expResult = false;
        boolean result = instance.allowPut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class InventoryResource.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Context context = null;
        Request request = null;
        Response response = null;
        InventoryResource instance = new InventoryResource();
        instance.init(context, request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handlePut method, of class InventoryResource.
     */
    @Test
    public void testHandlePut() {
        System.out.println("handlePut");
        InventoryResource instance = new InventoryResource();
        instance.handlePut();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of represent method, of class InventoryResource.
     */
    @Test
    public void testRepresent() {
        System.out.println("represent");
        Variant variant = null;
        InventoryResource instance = new InventoryResource();
        Representation expResult = null;
        Representation result = instance.represent(variant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
