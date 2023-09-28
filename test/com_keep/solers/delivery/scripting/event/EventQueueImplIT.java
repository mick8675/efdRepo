/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting.event;

import com.solers.delivery.event.DeliveryEvent;
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
public class EventQueueImplIT {
    
    public EventQueueImplIT() {
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
     * Test of receivedEvent method, of class EventQueueImpl.
     */
    @Test
    public void testReceivedEvent() {
        System.out.println("receivedEvent");
        DeliveryEvent event = null;
        EventType eventType = null;
        EventQueueImpl instance = null;
        instance.receivedEvent(event, eventType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of waitForEvents method, of class EventQueueImpl.
     */
    @Test
    public void testWaitForEvents() {
        System.out.println("waitForEvents");
        long timeoutMillis = 0L;
        EventQueueImpl instance = null;
        instance.waitForEvents(timeoutMillis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasConsumers method, of class EventQueueImpl.
     */
    @Test
    public void testHasConsumers() {
        System.out.println("hasConsumers");
        EventQueueImpl instance = null;
        boolean expResult = false;
        boolean result = instance.hasConsumers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
