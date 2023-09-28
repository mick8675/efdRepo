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

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class CronTriggerIT {
    
    public CronTriggerIT() {
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
     * Test of setCronExpression method, of class CronTrigger.
     */
    @Test
    public void testSetCronExpression() {
        System.out.println("setCronExpression");
        String expression = "";
        CronTrigger instance = new CronTrigger();
        instance.setCronExpression(expression);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isExecutionCompleted method, of class CronTrigger.
     */
    @Test
    public void testIsExecutionCompleted() {
        System.out.println("isExecutionCompleted");
        CronTrigger instance = new CronTrigger();
        boolean expResult = false;
        boolean result = instance.isExecutionCompleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
