/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client.retry;

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
public class RetryPolicyLinearTimeIT {
    
    public RetryPolicyLinearTimeIT() {
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
     * Test of init method, of class RetryPolicyLinearTime.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        RetryPolicyLinearTime instance = new RetryPolicyLinearTime();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaxTotalRetryTime method, of class RetryPolicyLinearTime.
     */
    @Test
    public void testSetMaxTotalRetryTime() {
        System.out.println("setMaxTotalRetryTime");
        int maxTotalRetryTime = 0;
        RetryPolicyLinearTime instance = new RetryPolicyLinearTime();
        instance.setMaxTotalRetryTime(maxTotalRetryTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaxTotalRetryTimeUnit method, of class RetryPolicyLinearTime.
     */
    @Test
    public void testSetMaxTotalRetryTimeUnit() {
        System.out.println("setMaxTotalRetryTimeUnit");
        TimeUnit maxTotalRetryTimeUnit = null;
        RetryPolicyLinearTime instance = new RetryPolicyLinearTime();
        instance.setMaxTotalRetryTimeUnit(maxTotalRetryTimeUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disable method, of class RetryPolicyLinearTime.
     */
    @Test
    public void testDisable() {
        System.out.println("disable");
        RetryPolicyLinearTime instance = new RetryPolicyLinearTime();
        instance.disable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnabled method, of class RetryPolicyLinearTime.
     */
    @Test
    public void testIsEnabled() {
        System.out.println("isEnabled");
        RetryPolicyLinearTime instance = new RetryPolicyLinearTime();
        boolean expResult = false;
        boolean result = instance.isEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class RetryPolicyLinearTime.
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        RetryPolicyLinearTime instance = new RetryPolicyLinearTime();
        instance.execute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRetryCount method, of class RetryPolicyLinearTime.
     */
    @Test
    public void testGetRetryCount() {
        System.out.println("getRetryCount");
        RetryPolicyLinearTime instance = new RetryPolicyLinearTime();
        int expResult = 0;
        int result = instance.getRetryCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
