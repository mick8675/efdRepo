/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting;

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
public class ExecutionStatusIT {
    
    public ExecutionStatusIT() {
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
     * Test of getStatus method, of class ExecutionStatus.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        ExecutionStatus instance = null;
        ExecutionStatus.StatusType expResult = null;
        ExecutionStatus.StatusType result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getError method, of class ExecutionStatus.
     */
    @Test
    public void testGetError() {
        System.out.println("getError");
        ExecutionStatus instance = null;
        String expResult = "";
        String result = instance.getError();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getException method, of class ExecutionStatus.
     */
    @Test
    public void testGetException() {
        System.out.println("getException");
        ExecutionStatus instance = null;
        Throwable expResult = null;
        Throwable result = instance.getException();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCompleted method, of class ExecutionStatus.
     */
    @Test
    public void testIsCompleted() {
        System.out.println("isCompleted");
        ExecutionStatus instance = null;
        boolean expResult = false;
        boolean result = instance.isCompleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ExecutionStatus.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ExecutionStatus instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
