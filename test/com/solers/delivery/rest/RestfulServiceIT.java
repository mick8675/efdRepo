/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest;

import java.util.Properties;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.restlet.data.MediaType;
import org.restlet.data.Reference;
import org.restlet.data.Request;
import org.restlet.data.Response;
import org.restlet.resource.Representation;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class RestfulServiceIT {
    
    public RestfulServiceIT() {
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
     * Test of setConnectionParameters method, of class RestfulService.
     */
    @Test
    public void testSetConnectionParameters() {
        System.out.println("setConnectionParameters");
        Properties properties = null;
        RestfulService instance = null;
        instance.setConnectionParameters(properties);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class RestfulService.
     */
    @Test
    public void testPut_3args() {
        System.out.println("put");
        String data = "";
        MediaType mediaType = null;
        Object[] uriParts = null;
        RestfulService instance = null;
        Response expResult = null;
        Response result = instance.put(data, mediaType, uriParts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class RestfulService.
     */
    @Test
    public void testPut_Representation_ObjectArr() {
        System.out.println("put");
        Representation entity = null;
        Object[] uriParts = null;
        RestfulService instance = null;
        Response expResult = null;
        Response result = instance.put(entity, uriParts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class RestfulService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Object[] uriParts = null;
        RestfulService instance = null;
        Response expResult = null;
        Response result = instance.delete(uriParts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class RestfulService.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object[] uriParts = null;
        RestfulService instance = null;
        Response expResult = null;
        Response result = instance.get(uriParts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toEntity method, of class RestfulService.
     */
    @Test
    public void testToEntity() {
        System.out.println("toEntity");
        String data = "";
        MediaType mediaType = null;
        RestfulService instance = null;
        Representation expResult = null;
        Representation result = instance.toEntity(data, mediaType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of uri method, of class RestfulService.
     */
    @Test
    public void testUri() {
        System.out.println("uri");
        Object[] args = null;
        RestfulService instance = null;
        Reference expResult = null;
        Reference result = instance.uri(args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handle method, of class RestfulService.
     */
    @Test
    public void testHandle() {
        System.out.println("handle");
        Request request = null;
        RestfulService instance = null;
        Response expResult = null;
        Response result = instance.handle(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
