/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.content;

import com.solers.delivery.domain.ContentSet;
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
public class ListingResourceIT {
    
    public ListingResourceIT() {
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
     * Test of init method, of class ListingResource.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Context context = null;
        Request request = null;
        Response response = null;
        ListingResource instance = null;
        instance.init(context, request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of represent method, of class ListingResource.
     */
    @Test
    public void testRepresent() {
        System.out.println("represent");
        Variant variant = null;
        ListingResource instance = null;
        Representation expResult = null;
        Representation result = instance.represent(variant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allowPut method, of class ListingResource.
     */
    @Test
    public void testAllowPut() {
        System.out.println("allowPut");
        ListingResource instance = null;
        boolean expResult = false;
        boolean result = instance.allowPut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeRepresentation method, of class ListingResource.
     */
    @Test
    public void testStoreRepresentation() {
        System.out.println("storeRepresentation");
        Representation entity = null;
        ListingResource instance = null;
        instance.storeRepresentation(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convert method, of class ListingResource.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        Representation entity = null;
        ListingResource instance = null;
        ContentSet expResult = null;
        ContentSet result = instance.convert(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shouldSave method, of class ListingResource.
     */
    @Test
    public void testShouldSave() {
        System.out.println("shouldSave");
        ContentSet cs = null;
        ListingResource instance = null;
        boolean expResult = false;
        boolean result = instance.shouldSave(cs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
