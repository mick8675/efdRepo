/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.consumer;

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
public class SynchronizationStateIT {
    
    public SynchronizationStateIT() {
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
     * Test of values method, of class SynchronizationState.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        SynchronizationState[] expResult = null;
        SynchronizationState[] result = SynchronizationState.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class SynchronizationState.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        SynchronizationState expResult = null;
        SynchronizationState result = SynchronizationState.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isProgressAvailable method, of class SynchronizationState.
     */
    @Test
    public void testIsProgressAvailable() {
        System.out.println("isProgressAvailable");
        SynchronizationState instance = null;
        boolean expResult = false;
        boolean result = instance.isProgressAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
