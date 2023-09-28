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
public class HTTPParametersIT {
    
    public HTTPParametersIT() {
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
     * Test of values method, of class HTTPParameters.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        HTTPParameters[] expResult = null;
        HTTPParameters[] result = HTTPParameters.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class HTTPParameters.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        HTTPParameters expResult = null;
        HTTPParameters result = HTTPParameters.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parameterName method, of class HTTPParameters.
     */
    @Test
    public void testParameterName() {
        System.out.println("parameterName");
        HTTPParameters instance = null;
        String expResult = "";
        String result = instance.parameterName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
