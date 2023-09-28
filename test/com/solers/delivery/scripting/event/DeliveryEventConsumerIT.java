/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting.event;

import com.solers.delivery.event.ContentEvent;
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
public class DeliveryEventConsumerIT {
    
    public DeliveryEventConsumerIT() {
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
     * Test of startedSupplier method, of class DeliveryEventConsumer.
     */
    @Test
    public void testStartedSupplier() {
        System.out.println("startedSupplier");
        SynchronizationEvent event = null;
        DeliveryEventConsumer instance = new DeliveryEventConsumerImpl();
        instance.startedSupplier(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completedSupplier method, of class DeliveryEventConsumer.
     */
    @Test
    public void testCompletedSupplier() {
        System.out.println("completedSupplier");
        SynchronizationEvent event = null;
        DeliveryEventConsumer instance = new DeliveryEventConsumerImpl();
        instance.completedSupplier(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startedConsumer method, of class DeliveryEventConsumer.
     */
    @Test
    public void testStartedConsumer() {
        System.out.println("startedConsumer");
        SynchronizationEvent event = null;
        DeliveryEventConsumer instance = new DeliveryEventConsumerImpl();
        instance.startedConsumer(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completedConsumer method, of class DeliveryEventConsumer.
     */
    @Test
    public void testCompletedConsumer() {
        System.out.println("completedConsumer");
        SynchronizationEvent event = null;
        DeliveryEventConsumer instance = new DeliveryEventConsumerImpl();
        instance.completedConsumer(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receivedContent method, of class DeliveryEventConsumer.
     */
    @Test
    public void testReceivedContent() {
        System.out.println("receivedContent");
        ContentEvent event = null;
        DeliveryEventConsumer instance = new DeliveryEventConsumerImpl();
        instance.receivedContent(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suppliedContent method, of class DeliveryEventConsumer.
     */
    @Test
    public void testSuppliedContent() {
        System.out.println("suppliedContent");
        ContentEvent event = null;
        DeliveryEventConsumer instance = new DeliveryEventConsumerImpl();
        instance.suppliedContent(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DeliveryEventConsumerImpl implements DeliveryEventConsumer {

        public void startedSupplier(SynchronizationEvent event) {
        }

        public void completedSupplier(SynchronizationEvent event) {
        }

        public void startedConsumer(SynchronizationEvent event) {
        }

        public void completedConsumer(SynchronizationEvent event) {
        }

        public void receivedContent(ContentEvent event) {
        }

        public void suppliedContent(ContentEvent event) {
        }
    }
    
}
