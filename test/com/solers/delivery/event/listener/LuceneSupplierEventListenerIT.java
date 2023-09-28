/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.event.listener;

import com.solers.delivery.event.ContentEvent;
import com.solers.delivery.event.SynchronizationEvent;
import java.util.List;
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
public class LuceneSupplierEventListenerIT {
    
    public LuceneSupplierEventListenerIT() {
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
     * Test of received method, of class LuceneSupplierEventListener.
     */
    @Test
    public void testReceived() {
        System.out.println("received");
        ContentEvent event = null;
        LuceneSupplierEventListener instance = null;
        instance.received(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supplierSynchronizationCompleted method, of class LuceneSupplierEventListener.
     */
    @Test
    public void testSupplierSynchronizationCompleted() {
        System.out.println("supplierSynchronizationCompleted");
        SynchronizationEvent event = null;
        LuceneSupplierEventListener instance = null;
        instance.supplierSynchronizationCompleted(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supplierSynchronizationStarted method, of class LuceneSupplierEventListener.
     */
    @Test
    public void testSupplierSynchronizationStarted() {
        System.out.println("supplierSynchronizationStarted");
        SynchronizationEvent event = null;
        LuceneSupplierEventListener instance = null;
        instance.supplierSynchronizationStarted(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flush method, of class LuceneSupplierEventListener.
     */
    @Test
    public void testFlush() {
        System.out.println("flush");
        List<ContentEvent> events = null;
        LuceneSupplierEventListener instance = null;
        instance.flush(events);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
