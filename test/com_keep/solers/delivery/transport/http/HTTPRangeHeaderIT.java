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
public class HTTPRangeHeaderIT {
    
    public HTTPRangeHeaderIT() {
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
     * Test of toString method, of class HTTPRangeHeader.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HTTPRangeHeader instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parse method, of class HTTPRangeHeader.
     */
    @Test
    public void testParse() {
        System.out.println("parse");
        String header = "";
        HTTPRangeHeader expResult = null;
        HTTPRangeHeader result = HTTPRangeHeader.parse(header);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstPos method, of class HTTPRangeHeader.
     */
    @Test
    public void testGetFirstPos() {
        System.out.println("getFirstPos");
        HTTPRangeHeader instance = null;
        long expResult = 0L;
        long result = instance.getFirstPos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstPos method, of class HTTPRangeHeader.
     */
    @Test
    public void testSetFirstPos() {
        System.out.println("setFirstPos");
        long firstPos = 0L;
        HTTPRangeHeader instance = null;
        instance.setFirstPos(firstPos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
