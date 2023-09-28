/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.status;

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
public class SynchronizationResultIT {
    
    public SynchronizationResultIT() {
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
     * Test of values method, of class SynchronizationResult.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        SynchronizationResult[] expResult = null;
        SynchronizationResult[] result = SynchronizationResult.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class SynchronizationResult.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        SynchronizationResult expResult = null;
        SynchronizationResult result = SynchronizationResult.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isModified method, of class SynchronizationResult.
     */
    @Test
    public void testIsModified() {
        System.out.println("isModified");
        SynchronizationResult instance = null;
        boolean expResult = false;
        boolean result = instance.isModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWarning method, of class SynchronizationResult.
     */
    @Test
    public void testIsWarning() {
        System.out.println("isWarning");
        SynchronizationResult instance = null;
        boolean expResult = false;
        boolean result = instance.isWarning();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFailure method, of class SynchronizationResult.
     */
    @Test
    public void testIsFailure() {
        System.out.println("isFailure");
        SynchronizationResult instance = null;
        boolean expResult = false;
        boolean result = instance.isFailure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class SynchronizationResult.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        SynchronizationResult instance = null;
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOriginalLabel method, of class SynchronizationResult.
     */
    @Test
    public void testGetOriginalLabel() {
        System.out.println("getOriginalLabel");
        SynchronizationResult instance = null;
        String expResult = "";
        String result = instance.getOriginalLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SynchronizationResult.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SynchronizationResult instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
