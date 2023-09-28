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
public class QueuedEventIT {
    
    public QueuedEventIT() {
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
     * Test of getEventType method, of class QueuedEvent.
     */
    @Test
    public void testGetEventType() {
        System.out.println("getEventType");
        QueuedEvent instance = null;
        EventType expResult = null;
        EventType result = instance.getEventType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeliveryEvent method, of class QueuedEvent.
     */
    @Test
    public void testGetDeliveryEvent() {
        System.out.println("getDeliveryEvent");
        QueuedEvent instance = null;
        DeliveryEvent expResult = null;
        DeliveryEvent result = instance.getDeliveryEvent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class QueuedEvent.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        QueuedEvent instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class QueuedEvent.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        QueuedEvent instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class QueuedEvent.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        QueuedEvent instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class QueuedEvent.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        QueuedEvent instance = null;
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
