/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.jmx;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
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
public class MonitoredExecutorServiceIT {
    
    public MonitoredExecutorServiceIT() {
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
     * Test of getName method, of class MonitoredExecutorService.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        MonitoredExecutorService instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoolSize method, of class MonitoredExecutorService.
     */
    @Test
    public void testGetPoolSize() {
        System.out.println("getPoolSize");
        MonitoredExecutorService instance = null;
        long expResult = 0L;
        long result = instance.getPoolSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQueueSize method, of class MonitoredExecutorService.
     */
    @Test
    public void testGetQueueSize() {
        System.out.println("getQueueSize");
        MonitoredExecutorService instance = null;
        long expResult = 0L;
        long result = instance.getQueueSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPercentFull method, of class MonitoredExecutorService.
     */
    @Test
    public void testGetPercentFull() {
        System.out.println("getPercentFull");
        MonitoredExecutorService instance = null;
        double expResult = 0.0;
        double result = instance.getPercentFull();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProcessedTasks method, of class MonitoredExecutorService.
     */
    @Test
    public void testGetProcessedTasks() {
        System.out.println("getProcessedTasks");
        MonitoredExecutorService instance = null;
        long expResult = 0L;
        long result = instance.getProcessedTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActiveTasks method, of class MonitoredExecutorService.
     */
    @Test
    public void testGetActiveTasks() {
        System.out.println("getActiveTasks");
        MonitoredExecutorService instance = null;
        long expResult = 0L;
        long result = instance.getActiveTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThroughput method, of class MonitoredExecutorService.
     */
    @Test
    public void testGetThroughput() {
        System.out.println("getThroughput");
        MonitoredExecutorService instance = null;
        double expResult = 0.0;
        double result = instance.getThroughput();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWaitingTasks method, of class MonitoredExecutorService.
     */
    @Test
    public void testGetWaitingTasks() {
        System.out.println("getWaitingTasks");
        MonitoredExecutorService instance = null;
        long expResult = 0L;
        long result = instance.getWaitingTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of awaitTermination method, of class MonitoredExecutorService.
     */
    @Test
    public void testAwaitTermination() throws Exception {
        System.out.println("awaitTermination");
        long timeout = 0L;
        TimeUnit unit = null;
        MonitoredExecutorService instance = null;
        boolean expResult = false;
        boolean result = instance.awaitTermination(timeout, unit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class MonitoredExecutorService.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        Runnable command = null;
        MonitoredExecutorService instance = null;
        instance.execute(command);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invokeAll method, of class MonitoredExecutorService.
     */
    @Test
    public void testInvokeAll_3args() throws Exception {
        System.out.println("invokeAll");
        Collection<? extends Callable<Object>> tasks = null;
        long timeout = 0L;
        TimeUnit unit = null;
        MonitoredExecutorService instance = null;
        List<Future<Object>> expResult = null;
        List<Future<Object>> result = instance.invokeAll(tasks, timeout, unit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invokeAll method, of class MonitoredExecutorService.
     */
    @Test
    public void testInvokeAll_Collection() throws Exception {
        System.out.println("invokeAll");
        Collection<? extends Callable<Object>> tasks = null;
        MonitoredExecutorService instance = null;
        List<Future<Object>> expResult = null;
        List<Future<Object>> result = instance.invokeAll(tasks);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invokeAny method, of class MonitoredE
     * @throws java.lang.ExceptionxecutorService.
     */
    @Test
    public void testInvokeAny_3args() throws Exception {
        System.out.println("invokeAny");
        Collection<? extends Callable<Object>> tasks = null;
        long timeout = 0L;
        TimeUnit unit = null;
        MonitoredExecutorService instance = null;
        Object expResult = null;
        Object result = instance.invokeAny(tasks, timeout, unit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invokeAny method, of class MonitoredExecutorService.
     */
    @Test
    public void testInvokeAny_Collection() throws Exception {
        System.out.println("invokeAny");
        Collection<? extends Callable<Object>> tasks = null;
        MonitoredExecutorService instance = null;
        Object expResult = null;
        Object result = instance.invokeAny(tasks);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShutdown method, of class MonitoredExecutorService.
     */
    @Test
    public void testIsShutdown() {
        System.out.println("isShutdown");
        MonitoredExecutorService instance = null;
        boolean expResult = false;
        boolean result = instance.isShutdown();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTerminated method, of class MonitoredExecutorService.
     */
    @Test
    public void testIsTerminated() {
        System.out.println("isTerminated");
        MonitoredExecutorService instance = null;
        boolean expResult = false;
        boolean result = instance.isTerminated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shutdown method, of class MonitoredExecutorService.
     */
    @Test
    public void testShutdown() {
        System.out.println("shutdown");
        MonitoredExecutorService instance = null;
        instance.shutdown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shutdownNow method, of class MonitoredExecutorService.
     */
    @Test
    public void testShutdownNow() {
        System.out.println("shutdownNow");
        MonitoredExecutorService instance = null;
        List<Runnable> expResult = null;
        List<Runnable> result = instance.shutdownNow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submit method, of class MonitoredExecutorService.
     */
    @Test
    public void testSubmit_Callable() {
        System.out.println("submit");
        MonitoredExecutorService instance = null;
        Future expResult = null;
        Future result = instance.submit(null,null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submit method, of class MonitoredExecutorService.
     */
    @Test
    public void testSubmit_Runnable_GenericType() {
        System.out.println("submit");
        Runnable task = null;
        Object result_2 = null;
        MonitoredExecutorService instance = null;
        Future expResult = null;
        Future result = instance.submit(task, result_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submit method, of class MonitoredExecutorService.
     */
    @Test
    public void testSubmit_Runnable() {
        System.out.println("submit");
        Runnable task = null;
        MonitoredExecutorService instance = null;
        Future expResult = null;
        Future result = instance.submit(task);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalize method, of class MonitoredExecutorService.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        MonitoredExecutorService instance = null;
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
