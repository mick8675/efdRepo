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
public class HTTPStatusCodesIT {
    
    public HTTPStatusCodesIT() {
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
     * Test of values method, of class HTTPStatusCodes.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        HTTPStatusCodes[] expResult = null;
        HTTPStatusCodes[] result = HTTPStatusCodes.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class HTTPStatusCodes.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        HTTPStatusCodes expResult = null;
        HTTPStatusCodes result = HTTPStatusCodes.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of code method, of class HTTPStatusCodes.
     */
    @Test
    public void testCode() {
        System.out.println("code");
        HTTPStatusCodes instance = null;
        int expResult = 0;
        int result = instance.code();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of message method, of class HTTPStatusCodes.
     */
    @Test
    public void testMessage() {
        System.out.println("message");
        HTTPStatusCodes instance = null;
        String expResult = "";
        String result = instance.message();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromCode method, of class HTTPStatusCodes.
     */
    @Test
    public void testFromCode() {
        System.out.println("fromCode");
        int code = 0;
        HTTPStatusCodes expResult = null;
        HTTPStatusCodes result = HTTPStatusCodes.fromCode(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
