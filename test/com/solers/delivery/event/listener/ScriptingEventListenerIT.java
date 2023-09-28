/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.event.listener;

import com.solers.delivery.event.ContentEvent;
import com.solers.delivery.event.GBSUpdateCompleteEvent;
import com.solers.delivery.event.PendingGBSUpdateEvent;
import com.solers.delivery.event.SynchronizationEvent;
import com.solers.delivery.scripting.service.EventService;
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
public class ScriptingEventListenerIT {
    
    public ScriptingEventListenerIT() {
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
     * Test of setEventService method, of class ScriptingEventListener.
     */
    @Test
    public void testSetEventService() {
        System.out.println("setEventService");
        EventService service = null;
        ScriptingEventListener instance = null;
        instance.setEventService(service);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consumerSynchronizationCompleted method, of class ScriptingEventListener.
     */
    @Test
    public void testConsumerSynchronizationCompleted() {
        System.out.println("consumerSynchronizationCompleted");
        SynchronizationEvent event = null;
        ScriptingEventListener instance = null;
        instance.consumerSynchronizationCompleted(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consumerSynchronizationStarted method, of class ScriptingEventListener.
     */
    @Test
    public void testConsumerSynchronizationStarted() {
        System.out.println("consumerSynchronizationStarted");
        SynchronizationEvent event = null;
        ScriptingEventListener instance = null;
        instance.consumerSynchronizationStarted(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gbsUpdateComplete method, of class ScriptingEventListener.
     */
    @Test
    public void testGbsUpdateComplete() {
        System.out.println("gbsUpdateComplete");
        GBSUpdateCompleteEvent event = null;
        ScriptingEventListener instance = null;
        instance.gbsUpdateComplete(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of received method, of class ScriptingEventListener.
     */
    @Test
    public void testReceived_ContentEvent() {
        System.out.println("received");
        ContentEvent event = null;
        ScriptingEventListener instance = null;
        instance.received(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of received method, of class ScriptingEventListener.
     */
    @Test
    public void testReceived_PendingGBSUpdateEvent() {
        System.out.println("received");
        PendingGBSUpdateEvent event = null;
        ScriptingEventListener instance = null;
        instance.received(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supplied method, of class ScriptingEventListener.
     */
    @Test
    public void testSupplied() {
        System.out.println("supplied");
        ContentEvent event = null;
        ScriptingEventListener instance = null;
        instance.supplied(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supplierSynchronizationCompleted method, of class ScriptingEventListener.
     */
    @Test
    public void testSupplierSynchronizationCompleted() {
        System.out.println("supplierSynchronizationCompleted");
        SynchronizationEvent event = null;
        ScriptingEventListener instance = null;
        instance.supplierSynchronizationCompleted(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supplierSynchronizationStarted method, of class ScriptingEventListener.
     */
    @Test
    public void testSupplierSynchronizationStarted() {
        System.out.println("supplierSynchronizationStarted");
        SynchronizationEvent event = null;
        ScriptingEventListener instance = null;
        instance.supplierSynchronizationStarted(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
