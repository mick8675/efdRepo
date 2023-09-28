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
import org.quartz.TriggerListener;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class QuartzSchedulerIT {
    
    public QuartzSchedulerIT() {
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
     * Test of start method, of class QuartzScheduler.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        QuartzScheduler instance = null;
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class QuartzScheduler.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        QuartzScheduler instance = null;
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTriggerListener method, of class QuartzScheduler.
     */
    @Test
    public void testAddTriggerListener() throws Exception {
        System.out.println("addTriggerListener");
        TriggerListener listener = null;
        QuartzScheduler instance = null;
        instance.addTriggerListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTriggerListener method, of class QuartzScheduler.
     */
    @Test
    public void testGetTriggerListener() throws Exception {
        System.out.println("getTriggerListener");
        String name = "";
        QuartzScheduler instance = null;
        TriggerListener expResult = null;
        TriggerListener result = instance.getTriggerListener(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
