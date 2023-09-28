/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.scheduler;

import com.solers.delivery.domain.ScheduleExpression;
import java.util.Date;
import java.util.Set;
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
public class ScheduleUtilIT {
    
    public ScheduleUtilIT() {
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
     * Test of getNextFireDate method, of class ScheduleUtil.
     */
    @Test
    public void testGetNextFireDate_Set() {
        System.out.println("getNextFireDate");
        Set<ScheduleExpression> expressions = null;
        Date expResult = null;
        Date result = ScheduleUtil.getNextFireDate(expressions);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextFireDate method, of class ScheduleUtil.
     */
    @Test
    public void testGetNextFireDate_ScheduleExpression() {
        System.out.println("getNextFireDate");
        ScheduleExpression expr = null;
        Date expResult = null;
        Date result = ScheduleUtil.getNextFireDate(expr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeToNextFire method, of class ScheduleUtil.
     */
    @Test
    public void testGetTimeToNextFire() {
        System.out.println("getTimeToNextFire");
        long lastRuntime = 0L;
        long remaining = 0L;
        Set<ScheduleExpression> expressions = null;
        long expResult = 0L;
        long result = ScheduleUtil.getTimeToNextFire(lastRuntime, remaining, expressions);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class ScheduleUtil.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        long duration = 0L;
        Date expResult = null;
        Date result = ScheduleUtil.getStartDate(duration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDurationKey method, of class ScheduleUtil.
     */
    @Test
    public void testGetDurationKey() {
        System.out.println("getDurationKey");
        String triggerName = "";
        String expResult = "";
        String result = ScheduleUtil.getDurationKey(triggerName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
