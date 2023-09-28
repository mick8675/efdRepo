/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.event.listener;

import com.solers.delivery.event.ContentEvent;
import com.solers.delivery.event.GBSUpdateCompleteEvent;
import com.solers.delivery.event.PendingGBSUpdateEvent;
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
public class EventLoggerIT {
    
    public EventLoggerIT() {
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
     * Test of consumerSynchronizationCompleted method, of class EventLogger.
     */
    @Test
    public void testConsumerSynchronizationCompleted() {
        System.out.println("consumerSynchronizationCompleted");
        SynchronizationEvent event = null;
        EventLogger instance = new EventLogger();
        instance.consumerSynchronizationCompleted(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consumerSynchronizationStarted method, of class EventLogger.
     */
    @Test
    public void testConsumerSynchronizationStarted() {
        System.out.println("consumerSynchronizationStarted");
        SynchronizationEvent event = null;
        EventLogger instance = new EventLogger();
        instance.consumerSynchronizationStarted(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of received method, of class EventLogger.
     */
    @Test
    public void testReceived_ContentEvent() {
        System.out.println("received");
        ContentEvent event = null;
        EventLogger instance = new EventLogger();
        instance.received(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of received method, of class EventLogger.
     */
    @Test
    public void testReceived_PendingGBSUpdateEvent() {
        System.out.println("received");
        PendingGBSUpdateEvent event = null;
        EventLogger instance = new EventLogger();
        instance.received(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supplied method, of class EventLogger.
     */
    @Test
    public void testSupplied() {
        System.out.println("supplied");
        ContentEvent event = null;
        EventLogger instance = new EventLogger();
        instance.supplied(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supplierSynchronizationCompleted method, of class EventLogger.
     */
    @Test
    public void testSupplierSynchronizationCompleted() {
        System.out.println("supplierSynchronizationCompleted");
        SynchronizationEvent event = null;
        EventLogger instance = new EventLogger();
        instance.supplierSynchronizationCompleted(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supplierSynchronizationStarted method, of class EventLogger.
     */
    @Test
    public void testSupplierSynchronizationStarted() {
        System.out.println("supplierSynchronizationStarted");
        SynchronizationEvent event = null;
        EventLogger instance = new EventLogger();
        instance.supplierSynchronizationStarted(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gbsUpdateComplete method, of class EventLogger.
     */
    @Test
    public void testGbsUpdateComplete() {
        System.out.println("gbsUpdateComplete");
        GBSUpdateCompleteEvent event = null;
        EventLogger instance = new EventLogger();
        instance.gbsUpdateComplete(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
