/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.reports;

import java.util.Date;
import java.util.List;
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
public class HistoryResourceIT {
    
    public HistoryResourceIT() {
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
     * Test of init method, of class HistoryResource.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Context context = null;
        Request request = null;
        Response response = null;
        HistoryResource instance = null;
        instance.init(context, request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of represent method, of class HistoryResource.
     */
    @Test
    public void testRepresent() {
        System.out.println("represent");
        Variant variant = null;
        HistoryResource instance = null;
        Representation expResult = null;
        Representation result = instance.represent(variant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of data method, of class HistoryResource.
     */
    @Test
    public void testData() {
        System.out.println("data");
        Date startTime = null;
        Date endTime = null;
        int max = 0;
        boolean showAll = false;
        HistoryResource instance = null;
        List expResult = null;
        List result = instance.data(startTime, endTime, max, showAll);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class HistoryResource.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        String key = "";
        HistoryResource instance = null;
        Date expResult = null;
        Date result = instance.getDate(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getString method, of class HistoryResource.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        String key = "";
        HistoryResource instance = null;
        String expResult = "";
        String result = instance.getString(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInt method, of class HistoryResource.
     */
    @Test
    public void testGetInt() {
        System.out.println("getInt");
        String key = "";
        HistoryResource instance = null;
        int expResult = 0;
        int result = instance.getInt(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoolean method, of class HistoryResource.
     */
    @Test
    public void testGetBoolean() {
        System.out.println("getBoolean");
        String key = "";
        boolean defaultValue = false;
        HistoryResource instance = null;
        boolean expResult = false;
        boolean result = instance.getBoolean(key, defaultValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkMax method, of class HistoryResource.
     */
    @Test
    public void testCheckMax() {
        System.out.println("checkMax");
        int max = 0;
        HistoryResource instance = null;
        boolean expResult = false;
        boolean result = instance.checkMax(max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
