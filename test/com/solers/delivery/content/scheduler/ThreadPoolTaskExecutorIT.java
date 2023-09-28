/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.scheduler;

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
public class ThreadPoolTaskExecutorIT {
    
    public ThreadPoolTaskExecutorIT() {
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
     * Test of execute method, of class ThreadPoolTaskExecutor.
     */
    @Test
    public void testExecute_Runnable() {
        System.out.println("execute");
        Runnable task = null;
        ThreadPoolTaskExecutor instance = new ThreadPoolTaskExecutor();
        instance.execute(task);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prefersShortLivedTasks method, of class ThreadPoolTaskExecutor.
     */
    @Test
    public void testPrefersShortLivedTasks() {
        System.out.println("prefersShortLivedTasks");
        ThreadPoolTaskExecutor instance = new ThreadPoolTaskExecutor();
        boolean expResult = false;
        boolean result = instance.prefersShortLivedTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of schedulerShutdown method, of class ThreadPoolTaskExecutor.
     */
    @Test
    public void testSchedulerShutdown() {
        System.out.println("schedulerShutdown");
        ThreadPoolTaskExecutor instance = new ThreadPoolTaskExecutor();
        instance.schedulerShutdown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jobUnscheduled method, of class ThreadPoolTaskExecutor.
     */
    @Test
    public void testJobUnscheduled() {
        System.out.println("jobUnscheduled");
        String triggerName = "";
        String triggerGroup = "";
        ThreadPoolTaskExecutor instance = new ThreadPoolTaskExecutor();
        instance.jobUnscheduled(triggerName, triggerGroup);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submit method, of class ThreadPoolTaskExecutor.
     */
    @Test
    public void testSubmit_Callable() 
    {
        System.out.println("submit");
        ThreadPoolTaskExecutor instance = new ThreadPoolTaskExecutor();
        Future expResult = null;
        Future result;
        result = instance.submit(() -> null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submit method, of class ThreadPoolTaskExecutor.
     */
    @Test
    public void testSubmit_Runnable() {
        System.out.println("submit");
        Runnable r = null;
        ThreadPoolTaskExecutor instance = new ThreadPoolTaskExecutor();
        Future expResult = null;
        Future result = instance.submit(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class ThreadPoolTaskExecutor.
     */
    @Test
    public void testExecute_Runnable_long() {
        System.out.println("execute");
        Runnable r = null;
        long l = 0L;
        ThreadPoolTaskExecutor instance = new ThreadPoolTaskExecutor();
        instance.execute(r, l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
