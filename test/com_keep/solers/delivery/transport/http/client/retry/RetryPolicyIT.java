/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client.retry;

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
public class RetryPolicyIT {
    
    public RetryPolicyIT() {
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
     * Test of disable method, of class RetryPolicy.
     */
    @Test
    public void testDisable() {
        System.out.println("disable");
        RetryPolicy instance = new RetryPolicyImpl();
        instance.disable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnabled method, of class RetryPolicy.
     */
    @Test
    public void testIsEnabled() {
        System.out.println("isEnabled");
        RetryPolicy instance = new RetryPolicyImpl();
        boolean expResult = false;
        boolean result = instance.isEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class RetryPolicy.
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        RetryPolicy instance = new RetryPolicyImpl();
        instance.execute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRetryCount method, of class RetryPolicy.
     */
    @Test
    public void testGetRetryCount() {
        System.out.println("getRetryCount");
        RetryPolicy instance = new RetryPolicyImpl();
        int expResult = 0;
        int result = instance.getRetryCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RetryPolicyImpl implements RetryPolicy {

        public void disable() {
        }

        public boolean isEnabled() {
            return false;
        }

        public void execute() throws InterruptedException {
        }

        public int getRetryCount() {
            return 0;
        }
    }

    public class RetryPolicyImpl implements RetryPolicy {

        public void disable() {
        }

        public boolean isEnabled() {
            return false;
        }

        public void execute() throws InterruptedException {
        }

        public int getRetryCount() {
            return 0;
        }
    }
    
}
