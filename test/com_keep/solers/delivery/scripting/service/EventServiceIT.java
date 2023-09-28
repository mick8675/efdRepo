/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting.service;

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
public class EventServiceIT {
    
    public EventServiceIT() {
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
     * Test of ready method, of class EventService.
     */
    @Test
    public void testReady() {
        System.out.println("ready");
        EventService instance = new EventServiceImpl();
        boolean expResult = false;
        boolean result = instance.ready();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startedConsumer method, of class EventService.
     */
    @Test
    public void testStartedConsumer() {
        System.out.println("startedConsumer");
        DeliveryEvent event = null;
        EventService instance = new EventServiceImpl();
        instance.startedConsumer(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completedConsumer method, of class EventService.
     */
    @Test
    public void testCompletedConsumer() {
        System.out.println("completedConsumer");
        DeliveryEvent event = null;
        EventService instance = new EventServiceImpl();
        instance.completedConsumer(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startedSupplier method, of class EventService.
     */
    @Test
    public void testStartedSupplier() {
        System.out.println("startedSupplier");
        DeliveryEvent event = null;
        EventService instance = new EventServiceImpl();
        instance.startedSupplier(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completedSupplier method, of class EventService.
     */
    @Test
    public void testCompletedSupplier() {
        System.out.println("completedSupplier");
        DeliveryEvent event = null;
        EventService instance = new EventServiceImpl();
        instance.completedSupplier(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suppliedContent method, of class EventService.
     */
    @Test
    public void testSuppliedContent() {
        System.out.println("suppliedContent");
        DeliveryEvent event = null;
        EventService instance = new EventServiceImpl();
        instance.suppliedContent(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receivedContent method, of class EventService.
     */
    @Test
    public void testReceivedContent() {
        System.out.println("receivedContent");
        DeliveryEvent event = null;
        EventService instance = new EventServiceImpl();
        instance.receivedContent(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EventServiceImpl implements EventService {

        public boolean ready() {
            return false;
        }

        public void startedConsumer(DeliveryEvent event) {
        }

        public void completedConsumer(DeliveryEvent event) {
        }

        public void startedSupplier(DeliveryEvent event) {
        }

        public void completedSupplier(DeliveryEvent event) {
        }

        public void suppliedContent(DeliveryEvent event) {
        }

        public void receivedContent(DeliveryEvent event) {
        }
    }

    public class EventServiceImpl implements EventService {

        public boolean ready() {
            return false;
        }

        public void startedConsumer(DeliveryEvent event) {
        }

        public void completedConsumer(DeliveryEvent event) {
        }

        public void startedSupplier(DeliveryEvent event) {
        }

        public void completedSupplier(DeliveryEvent event) {
        }

        public void suppliedContent(DeliveryEvent event) {
        }

        public void receivedContent(DeliveryEvent event) {
        }
    }
    
}
