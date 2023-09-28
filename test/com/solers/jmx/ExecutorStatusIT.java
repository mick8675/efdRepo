/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.jmx;

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
public class ExecutorStatusIT {
    
    public ExecutorStatusIT() {
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
     * Test of getPercentFull method, of class ExecutorStatus.
     */
    @Test
    public void testGetPercentFull() {
        System.out.println("getPercentFull");
        ExecutorStatus instance = new ExecutorStatusImpl();
        double expResult = 0.0;
        double result = instance.getPercentFull();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProcessedTasks method, of class ExecutorStatus.
     */
    @Test
    public void testGetProcessedTasks() {
        System.out.println("getProcessedTasks");
        ExecutorStatus instance = new ExecutorStatusImpl();
        long expResult = 0L;
        long result = instance.getProcessedTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWaitingTasks method, of class ExecutorStatus.
     */
    @Test
    public void testGetWaitingTasks() {
        System.out.println("getWaitingTasks");
        ExecutorStatus instance = new ExecutorStatusImpl();
        long expResult = 0L;
        long result = instance.getWaitingTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActiveTasks method, of class ExecutorStatus.
     */
    @Test
    public void testGetActiveTasks() {
        System.out.println("getActiveTasks");
        ExecutorStatus instance = new ExecutorStatusImpl();
        long expResult = 0L;
        long result = instance.getActiveTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThroughput method, of class ExecutorStatus.
     */
    @Test
    public void testGetThroughput() {
        System.out.println("getThroughput");
        ExecutorStatus instance = new ExecutorStatusImpl();
        double expResult = 0.0;
        double result = instance.getThroughput();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQueueSize method, of class ExecutorStatus.
     */
    @Test
    public void testGetQueueSize() {
        System.out.println("getQueueSize");
        ExecutorStatus instance = new ExecutorStatusImpl();
        long expResult = 0L;
        long result = instance.getQueueSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoolSize method, of class ExecutorStatus.
     */
    @Test
    public void testGetPoolSize() {
        System.out.println("getPoolSize");
        ExecutorStatus instance = new ExecutorStatusImpl();
        long expResult = 0L;
        long result = instance.getPoolSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ExecutorStatusImpl implements ExecutorStatus {

        public double getPercentFull() {
            return 0.0;
        }

        public long getProcessedTasks() {
            return 0L;
        }

        public long getWaitingTasks() {
            return 0L;
        }

        public long getActiveTasks() {
            return 0L;
        }

        public double getThroughput() {
            return 0.0;
        }

        public long getQueueSize() {
            return 0L;
        }

        public long getPoolSize() {
            return 0L;
        }
    }
    
}
