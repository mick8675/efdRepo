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
public class ContentSetResourceIT {
    
    public ContentSetResourceIT() {
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
     * Test of allowDelete method, of class ContentSetResource.
     */
    @Test
    public void testAllowDelete() {
        System.out.println("allowDelete");
        ContentSetResource instance = null;
        boolean expResult = false;
        boolean result = instance.allowDelete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class ContentSetResource.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Context context = null;
        Request request = null;
        Response response = null;
        ContentSetResource instance = null;
        instance.init(context, request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of represent method, of class ContentSetResource.
     */
    @Test
    public void testRepresent() {
        System.out.println("represent");
        Variant variant = null;
        ContentSetResource instance = null;
        Representation expResult = null;
        Representation result = instance.represent(variant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeRepresentation method, of class ContentSetResource.
     */
    @Test
    public void testStoreRepresentation() {
        System.out.println("storeRepresentation");
        Representation entity = null;
        ContentSetResource instance = null;
        instance.storeRepresentation(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeRepresentations method, of class ContentSetResource.
     */
    @Test
    public void testRemoveRepresentations() {
        System.out.println("removeRepresentations");
        ContentSetResource instance = null;
        instance.removeRepresentations();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shouldSave method, of class ContentSetResource.
     */
    @Test
    public void testShouldSave() {
        System.out.println("shouldSave");
        ContentSet cs = null;
        ContentSetResource instance = null;
        boolean expResult = false;
        boolean result = instance.shouldSave(cs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
