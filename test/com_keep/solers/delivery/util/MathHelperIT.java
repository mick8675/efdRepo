/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.util;

import java.math.BigDecimal;
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
public class MathHelperIT {
    
    public MathHelperIT() {
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
     * Test of percentComplete method, of class MathHelper.
     */
    @Test
    public void testPercentComplete_long_long() {
        System.out.println("percentComplete");
        long completed = 0L;
        long total = 0L;
        double expResult = 0.0;
        double result = MathHelper.percentComplete(completed, total);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of percentComplete method, of class MathHelper.
     */
    @Test
    public void testPercentComplete_BigDecimal_BigDecimal() {
        System.out.println("percentComplete");
        BigDecimal completed = null;
        BigDecimal total = null;
        double expResult = 0.0;
        double result = MathHelper.percentComplete(completed, total);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remainingTime method, of class MathHelper.
     */
    @Test
    public void testRemainingTime() {
        System.out.println("remainingTime");
        long elapsedTime = 0L;
        long processed = 0L;
        long remaining = 0L;
        long expResult = 0L;
        long result = MathHelper.remainingTime(elapsedTime, processed, remaining);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
