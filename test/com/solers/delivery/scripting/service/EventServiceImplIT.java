/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting.service;

import com.solers.delivery.event.DeliveryEvent;
import com.solers.delivery.scripting.event.EventQueue;
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
public class EventServiceImplIT {
    
    public EventServiceImplIT() {
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
     * Test of setEventQueue method, of class EventServiceImpl.
     */
    @Test
    public void testSetEventQueue() {
        System.out.println("setEventQueue");
        EventQueue queue = null;
        EventServiceImpl instance = new EventServiceImpl();
        instance.setEventQueue(queue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ready method, of class EventServiceImpl.
     */
    @Test
    public void testReady() {
        System.out.println("ready");
        EventServiceImpl instance = new EventServiceImpl();
        boolean expResult = false;
        boolean result = instance.ready();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completedConsumer method, of class EventServiceImpl.
     */
    @Test
    public void testCompletedConsumer() {
        System.out.println("completedConsumer");
        DeliveryEvent event = null;
        EventServiceImpl instance = new EventServiceImpl();
        instance.completedConsumer(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completedSupplier method, of class EventServiceImpl.
     */
    @Test
    public void testCompletedSupplier() {
        System.out.println("completedSupplier");
        DeliveryEvent event = null;
        EventServiceImpl instance = new EventServiceImpl();
        instance.completedSupplier(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receivedContent method, of class EventServiceImpl.
     */
    @Test
    public void testReceivedContent() {
        System.out.println("receivedContent");
        DeliveryEvent event = null;
        EventServiceImpl instance = new EventServiceImpl();
        instance.receivedContent(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startedConsumer method, of class EventServiceImpl.
     */
    @Test
    public void testStartedConsumer() {
        System.out.println("startedConsumer");
        DeliveryEvent event = null;
        EventServiceImpl instance = new EventServiceImpl();
        instance.startedConsumer(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startedSupplier method, of class EventServiceImpl.
     */
    @Test
    public void testStartedSupplier() {
        System.out.println("startedSupplier");
        DeliveryEvent event = null;
        EventServiceImpl instance = new EventServiceImpl();
        instance.startedSupplier(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suppliedContent method, of class EventServiceImpl.
     */
    @Test
    public void testSuppliedContent() {
        System.out.println("suppliedContent");
        DeliveryEvent event = null;
        EventServiceImpl instance = new EventServiceImpl();
        instance.suppliedContent(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
