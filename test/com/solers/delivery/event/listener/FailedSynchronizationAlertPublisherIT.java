/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.event.listener;

import com.solers.delivery.event.SynchronizationEvent;
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
public class FailedSynchronizationAlertPublisherIT {
    
    public FailedSynchronizationAlertPublisherIT() {
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
     * Test of consumerSynchronizationCompleted method, of class FailedSynchronizationAlertPublisher.
     */
    @Test
    public void testConsumerSynchronizationCompleted() {
        System.out.println("consumerSynchronizationCompleted");
        SynchronizationEvent event = null;
        FailedSynchronizationAlertPublisher instance = null;
        instance.consumerSynchronizationCompleted(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supplierSynchronizationCompleted method, of class FailedSynchronizationAlertPublisher.
     */
    @Test
    public void testSupplierSynchronizationCompleted() {
        System.out.println("supplierSynchronizationCompleted");
        SynchronizationEvent event = null;
        FailedSynchronizationAlertPublisher instance = null;
        instance.supplierSynchronizationCompleted(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
