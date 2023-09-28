/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.zip.util;

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
public class FilteredEnumeratorIT {
    
    public FilteredEnumeratorIT() {
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
     * Test of hasMoreElements method, of class FilteredEnumerator.
     */
    @Test
    public void testHasMoreElements() {
        System.out.println("hasMoreElements");
        FilteredEnumerator instance = null;
        boolean expResult = false;
        boolean result = instance.hasMoreElements();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextElement method, of class FilteredEnumerator.
     */
    @Test
    public void testNextElement() {
        System.out.println("nextElement");
        FilteredEnumerator instance = null;
        Object expResult = null;
        Object result = instance.nextElement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
