/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util;

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
public class StopWatchIT {
    
    public StopWatchIT() {
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
     * Test of start method, of class StopWatch.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        StopWatch instance = new StopWatch();
        StopWatch expResult = null;
        StopWatch result = instance.start();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class StopWatch.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        StopWatch instance = new StopWatch();
        StopWatch expResult = null;
        StopWatch result = instance.stop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElapsedTime method, of class StopWatch.
     */
    @Test
    public void testGetElapsedTime() {
        System.out.println("getElapsedTime");
        StopWatch instance = new StopWatch();
        long expResult = 0L;
        long result = instance.getElapsedTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartTime method, of class StopWatch.
     */
    @Test
    public void testGetStartTime() {
        System.out.println("getStartTime");
        StopWatch instance = new StopWatch();
        long expResult = 0L;
        long result = instance.getStartTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStarted method, of class StopWatch.
     */
    @Test
    public void testIsStarted() {
        System.out.println("isStarted");
        StopWatch instance = new StopWatch();
        boolean expResult = false;
        boolean result = instance.isStarted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
