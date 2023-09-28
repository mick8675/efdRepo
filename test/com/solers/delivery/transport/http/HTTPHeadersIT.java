/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class HTTPHeadersIT {
    
    public HTTPHeadersIT() {
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
     * Test of values method, of class HTTPHeaders.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        HTTPHeaders[] expResult = null;
        HTTPHeaders[] result = HTTPHeaders.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class HTTPHeaders.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        HTTPHeaders expResult = null;
        HTTPHeaders result = HTTPHeaders.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of headerName method, of class HTTPHeaders.
     */
    @Test
    public void testHeaderName() {
        System.out.println("headerName");
        HTTPHeaders instance = null;
        String expResult = "";
        String result = instance.headerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of defaultValue method, of class HTTPHeaders.
     */
    @Test
    public void testDefaultValue() {
        System.out.println("defaultValue");
        HTTPHeaders instance = null;
        String expResult = "";
        String result = instance.defaultValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
