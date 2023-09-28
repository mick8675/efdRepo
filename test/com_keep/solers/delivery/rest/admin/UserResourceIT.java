/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.admin;

import com.solers.delivery.domain.User;
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
public class UserResourceIT {
    
    public UserResourceIT() {
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
     * Test of allowDelete method, of class UserResource.
     */
    @Test
    public void testAllowDelete() {
        System.out.println("allowDelete");
        UserResource instance = null;
        boolean expResult = false;
        boolean result = instance.allowDelete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allowPut method, of class UserResource.
     */
    @Test
    public void testAllowPut() {
        System.out.println("allowPut");
        UserResource instance = null;
        boolean expResult = false;
        boolean result = instance.allowPut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class UserResource.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Context context = null;
        Request request = null;
        Response response = null;
        UserResource instance = null;
        instance.init(context, request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of represent method, of class UserResource.
     */
    @Test
    public void testRepresent() {
        System.out.println("represent");
        Variant variant = null;
        UserResource instance = null;
        Representation expResult = null;
        Representation result = instance.represent(variant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeRepresentations method, of class UserResource.
     */
    @Test
    public void testRemoveRepresentations() {
        System.out.println("removeRepresentations");
        UserResource instance = null;
        instance.removeRepresentations();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeRepresentation method, of class UserResource.
     */
    @Test
    public void testStoreRepresentation() {
        System.out.println("storeRepresentation");
        Representation entity = null;
        UserResource instance = null;
        instance.storeRepresentation(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convert method, of class UserResource.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        Representation entity = null;
        UserResource instance = null;
        User expResult = null;
        User result = instance.convert(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shouldSave method, of class UserResource.
     */
    @Test
    public void testShouldSave() {
        System.out.println("shouldSave");
        User user = null;
        UserResource instance = null;
        boolean expResult = false;
        boolean result = instance.shouldSave(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
