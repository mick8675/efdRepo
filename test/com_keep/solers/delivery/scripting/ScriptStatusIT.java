/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting;

import java.util.concurrent.Future;
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
public class ScriptStatusIT {
    
    public ScriptStatusIT() {
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
     * Test of setStatus method, of class ScriptStatus.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        ExecutionStatus status = null;
        ScriptStatus instance = null;
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class ScriptStatus.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        ScriptStatus instance = null;
        ExecutionStatus.StatusType expResult = null;
        ExecutionStatus.StatusType result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErrorMessage method, of class ScriptStatus.
     */
    @Test
    public void testGetErrorMessage() {
        System.out.println("getErrorMessage");
        ScriptStatus instance = null;
        String expResult = "";
        String result = instance.getErrorMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getException method, of class ScriptStatus.
     */
    @Test
    public void testGetException() {
        System.out.println("getException");
        ScriptStatus instance = null;
        Throwable expResult = null;
        Throwable result = instance.getException();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScheduledTask method, of class ScriptStatus.
     */
    @Test
    public void testGetScheduledTask() {
        System.out.println("getScheduledTask");
        ScriptStatus instance = null;
        Future expResult = null;
        Future result = instance.getScheduledTask();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScheduledTask method, of class ScriptStatus.
     */
    @Test
    public void testSetScheduledTask() {
        System.out.println("setScheduledTask");
        Future task = null;
        ScriptStatus instance = null;
        Future expResult = null;
        Future result = instance.setScheduledTask(task);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDone method, of class ScriptStatus.
     */
    @Test
    public void testIsDone() {
        System.out.println("isDone");
        ScriptStatus instance = null;
        boolean expResult = false;
        boolean result = instance.isDone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ScriptStatus.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ScriptStatus instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
