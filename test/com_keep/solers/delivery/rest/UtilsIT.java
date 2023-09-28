/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.restlet.data.MediaType;
import org.restlet.data.Request;
import org.restlet.data.Response;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class UtilsIT {
    
    public UtilsIT() {
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
     * Test of checkForException method, of class Utils.
     */
    @Test
    public void testCheckForException() {
        System.out.println("checkForException");
        Response response = null;
        Utils.checkForException(response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendValidationError method, of class Utils.
     */
    @Test
    public void testSendValidationError() {
        System.out.println("sendValidationError");
        Request request = null;
        Response response = null;
        Exception ex = null;
        Utils.sendValidationError(request, response, ex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setException method, of class Utils.
     */
    @Test
    public void testSetException() {
        System.out.println("setException");
        Request request = null;
        Response response = null;
        Exception ex = null;
        Utils.setException(request, response, ex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendEmptyResponse method, of class Utils.
     */
    @Test
    public void testSendEmptyResponse() {
        System.out.println("sendEmptyResponse");
        Response response = null;
        Utils.sendEmptyResponse(response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findId method, of class Utils.
     */
    @Test
    public void testFindId_3args() {
        System.out.println("findId");
        Request request = null;
        Response response = null;
        boolean required = false;
        long expResult = 0L;
        long result = Utils.findId(request, response, required);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertLong method, of class Utils.
     */
    @Test
    public void testConvertLong() {
        System.out.println("convertLong");
        String value = "";
        Response response = null;
        Long expResult = null;
        Long result = Utils.convertLong(value, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findId method, of class Utils.
     */
    @Test
    public void testFindId_Request_Response() {
        System.out.println("findId");
        Request request = null;
        Response response = null;
        long expResult = 0L;
        long result = Utils.findId(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findString method, of class Utils.
     */
    @Test
    public void testFindString() {
        System.out.println("findString");
        Request request = null;
        Response response = null;
        String key = "";
        String expResult = "";
        String result = Utils.findString(request, response, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findType method, of class Utils.
     */
    @Test
    public void testFindType() {
        System.out.println("findType");
        Request request = null;
        MediaType defaultType = null;
        MediaType expResult = null;
        MediaType result = Utils.findType(request, defaultType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
