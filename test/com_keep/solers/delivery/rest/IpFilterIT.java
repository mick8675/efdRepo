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
import org.restlet.data.Request;
import org.restlet.data.Response;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class IpFilterIT {
    
    public IpFilterIT() {
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
     * Test of beforeHandle method, of class IpFilter.
     */
    @Test
    public void testBeforeHandle() {
        System.out.println("beforeHandle");
        Request request = null;
        Response response = null;
        IpFilter instance = null;
        int expResult = 0;
        int result = instance.beforeHandle(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
