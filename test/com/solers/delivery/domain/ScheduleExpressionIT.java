/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain;

import com.solers.util.unit.TimeIntervalUnit;
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
public class ScheduleExpressionIT {
    
    public ScheduleExpressionIT() {
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
     * Test of getId method, of class ScheduleExpression.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ScheduleExpression instance = new ScheduleExpression();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ScheduleExpression.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        ScheduleExpression instance = new ScheduleExpression();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCronExpression method, of class ScheduleExpression.
     */
    @Test
    public void testGetCronExpression() {
        System.out.println("getCronExpression");
        ScheduleExpression instance = new ScheduleExpression();
        String expResult = "";
        String result = instance.getCronExpression();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCronExpression method, of class ScheduleExpression.
     */
    @Test
    public void testSetCronExpression() {
        System.out.println("setCronExpression");
        String expression = "";
        ScheduleExpression instance = new ScheduleExpression();
        instance.setCronExpression(expression);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class ScheduleExpression.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        ScheduleExpression instance = new ScheduleExpression();
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class ScheduleExpression.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        int duration = 0;
        ScheduleExpression instance = new ScheduleExpression();
        instance.setDuration(duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDurationUnit method, of class ScheduleExpression.
     */
    @Test
    public void testGetDurationUnit() {
        System.out.println("getDurationUnit");
        ScheduleExpression instance = new ScheduleExpression();
        TimeIntervalUnit expResult = null;
        TimeIntervalUnit result = instance.getDurationUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDurationUnit method, of class ScheduleExpression.
     */
    @Test
    public void testSetDurationUnit() {
        System.out.println("setDurationUnit");
        TimeIntervalUnit durationUnit = null;
        ScheduleExpression instance = new ScheduleExpression();
        instance.setDurationUnit(durationUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ScheduleExpression.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ScheduleExpression instance = new ScheduleExpression();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class ScheduleExpression.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        ScheduleExpression instance = new ScheduleExpression();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ScheduleExpression.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ScheduleExpression instance = new ScheduleExpression();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
