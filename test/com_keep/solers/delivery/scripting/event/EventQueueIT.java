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
public class EventQueueIT {
    
    public EventQueueIT() {
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
     * Test of receivedEvent method, of class EventQueue.
     */
    @Test
    public void testReceivedEvent() {
        System.out.println("receivedEvent");
        DeliveryEvent event = null;
        EventType type = null;
        EventQueue instance = new EventQueueImpl();
        instance.receivedEvent(event, type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of waitForEvents method, of class EventQueue.
     */
    @Test
    public void testWaitForEvents() {
        System.out.println("waitForEvents");
        long timeInMillis = 0L;
        EventQueue instance = new EventQueueImpl();
        instance.waitForEvents(timeInMillis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasConsumers method, of class EventQueue.
     */
    @Test
    public void testHasConsumers() {
        System.out.println("hasConsumers");
        EventQueue instance = new EventQueueImpl();
        boolean expResult = false;
        boolean result = instance.hasConsumers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EventQueueImpl implements EventQueue {

        public void receivedEvent(DeliveryEvent event, EventType type) {
        }

        public void waitForEvents(long timeInMillis) {
        }

        public boolean hasConsumers() {
            return false;
        }
    }

    public class EventQueueImpl implements EventQueue {

        public void receivedEvent(DeliveryEvent event, EventType type) {
        }

        public void waitForEvents(long timeInMillis) {
        }

        public boolean hasConsumers() {
            return false;
        }
    }
    
}
