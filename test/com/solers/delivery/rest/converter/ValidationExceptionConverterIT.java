/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.converter;

import com.thoughtworks.xstream.XStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.restlet.resource.Representation;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class ValidationExceptionConverterIT {
    
    public ValidationExceptionConverterIT() {
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
     * Test of from method, of class ValidationExceptionConverter.
     */
    @Test
    public void testFrom() {
        System.out.println("from");
        Representation r = null;
        ValidationExceptionConverter instance = new ValidationExceptionConverter();
        RuntimeException expResult = null;
        RuntimeException result = instance.from(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class ValidationExceptionConverter.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        XStream stream = null;
        ValidationExceptionConverter instance = new ValidationExceptionConverter();
        XStream expResult = null;
        XStream result = instance.initialize(stream);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
