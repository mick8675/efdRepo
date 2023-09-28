/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.scheduler;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.quartz.JobExecutionContext;
import org.quartz.Trigger;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class ScheduledJobMonitorIT {
    
    public ScheduledJobMonitorIT() {
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
     * Test of getName method, of class ScheduledJobMonitor.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ScheduledJobMonitor instance = new ScheduledJobMonitor();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of triggerFired method, of class ScheduledJobMonitor.
     */
    @Test
    public void testTriggerFired() {
        System.out.println("triggerFired");
        Trigger trigger = null;
        JobExecutionContext context = null;
        ScheduledJobMonitor instance = new ScheduledJobMonitor();
        instance.triggerFired(trigger, context);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of triggerFiredTest method, of class ScheduledJobMonitor.
     */
    @Test
    public void testTriggerFiredTest() {
        System.out.println("triggerFiredTest");
        Trigger trigger = null;
        JobExecutionContext context = null;
        ScheduledJobMonitor instance = new ScheduledJobMonitor();
        instance.triggerFiredTest(trigger, context);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of triggerComplete method, of class ScheduledJobMonitor.
     */
    @Test
    public void testTriggerComplete() {
        System.out.println("triggerComplete");
        Trigger trigger = null;
        JobExecutionContext context = null;
        int triggerInstructionCode = 0;
        ScheduledJobMonitor instance = new ScheduledJobMonitor();
        instance.triggerComplete(trigger, context, triggerInstructionCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
