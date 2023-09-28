/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting.event;

import com.solers.delivery.event.BaseEvent;
import com.solers.delivery.event.DeliveryEvent;
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
public class EventTypeIT {
    
    public EventTypeIT() {
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
     * Test of values method, of class EventType.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        EventType[] expResult = null;
        EventType[] result = EventType.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class EventType.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        EventType expResult = null;
        EventType result = EventType.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendEvent method, of class EventType.
     */
    @Test
    public void testSendEvent() {
        System.out.println("sendEvent");
        EventService service = null;
        DeliveryEvent event = null;
        EventType instance = null;
        instance.sendEvent(service, event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receivedEvent method, of class EventType.
     */
    @Test
    public void testReceivedEvent() {
        System.out.println("receivedEvent");
        DeliveryEventConsumer deliveryEventConsumer = null;
        DeliveryEvent event = null;
        EventType instance = null;
        instance.receivedEvent(deliveryEventConsumer, event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class EventType.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        EventType instance = null;
        Class<? extends BaseEvent> expResult = null;
        Class<? extends BaseEvent> result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EventTypeImpl extends EventType {

        public void sendEvent(EventService service, DeliveryEvent event) {
        }

        public void receivedEvent(DeliveryEventConsumer deliveryEventConsumer, DeliveryEvent event) {
        }

        public Class<? extends BaseEvent> getType() {
            return null;
        }
    }

    public class EventTypeImpl extends EventType {

        public void sendEvent(EventService service, DeliveryEvent event) {
        }

        public void receivedEvent(DeliveryEventConsumer deliveryEventConsumer, DeliveryEvent event) {
        }

        public Class<? extends BaseEvent> getType() {
            return null;
        }
    }
    
}
