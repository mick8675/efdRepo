/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.monitor;

import com.solers.delivery.content.consumer.ConsumerContentSetManager;
import com.solers.delivery.content.status.CurrentSynchronization;
import com.solers.delivery.content.status.SupplierProgress;
import com.solers.delivery.content.supplier.SupplierContentSetManager;
import com.solers.delivery.event.SynchronizationEvent;
import com.solers.delivery.management.StatusService;
import com.solers.delivery.transport.http.TransferStatus;
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
public class TransferMonitorIT {
    
    public TransferMonitorIT() {
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
     * Test of setConsumerManager method, of class TransferMonitor.
     */
    @Test
    public void testSetConsumerManager() {
        System.out.println("setConsumerManager");
        ConsumerContentSetManager consumerManager = null;
        TransferMonitor instance = new TransferMonitor();
        instance.setConsumerManager(consumerManager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupplierManager method, of class TransferMonitor.
     */
    @Test
    public void testSetSupplierManager() {
        System.out.println("setSupplierManager");
        SupplierContentSetManager supplierManager = null;
        TransferMonitor instance = new TransferMonitor();
        instance.setSupplierManager(supplierManager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatusService method, of class TransferMonitor.
     */
    @Test
    public void testSetStatusService() {
        System.out.println("setStatusService");
        StatusService statusService = null;
        TransferMonitor instance = new TransferMonitor();
        instance.setStatusService(statusService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startConsumer method, of class TransferMonitor.
     */
    @Test
    public void testStartConsumer() {
        System.out.println("startConsumer");
        SynchronizationEvent event = null;
        TransferMonitor instance = new TransferMonitor();
        instance.startConsumer(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startSupplier method, of class TransferMonitor.
     */
    @Test
    public void testStartSupplier() {
        System.out.println("startSupplier");
        SynchronizationEvent event = null;
        SupplierProgress progress = null;
        TransferMonitor instance = new TransferMonitor();
        instance.startSupplier(event, progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completeConsumer method, of class TransferMonitor.
     */
    @Test
    public void testCompleteConsumer() {
        System.out.println("completeConsumer");
        SynchronizationEvent event = null;
        TransferMonitor instance = new TransferMonitor();
        instance.completeConsumer(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completeSupplier method, of class TransferMonitor.
     */
    @Test
    public void testCompleteSupplier() {
        System.out.println("completeSupplier");
        SynchronizationEvent event = null;
        TransferMonitor instance = new TransferMonitor();
        instance.completeSupplier(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startTransfer method, of class TransferMonitor.
     */
    @Test
    public void testStartTransfer() {
        System.out.println("startTransfer");
        String syncId = "";
        TransferStatus xfer = null;
        TransferMonitor instance = new TransferMonitor();
        instance.startTransfer(syncId, xfer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completeTransfer method, of class TransferMonitor.
     */
    @Test
    public void testCompleteTransfer() {
        System.out.println("completeTransfer");
        String syncId = "";
        TransferStatus xfer = null;
        TransferMonitor instance = new TransferMonitor();
        instance.completeTransfer(syncId, xfer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentSynchronizations method, of class TransferMonitor.
     */
    @Test
    public void testGetCurrentSynchronizations() {
        System.out.println("getCurrentSynchronizations");
        TransferMonitor instance = new TransferMonitor();
        List<CurrentSynchronization> expResult = null;
        List<CurrentSynchronization> result = instance.getCurrentSynchronizations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupplierProgress method, of class TransferMonitor.
     */
    @Test
    public void testGetSupplierProgress() {
        System.out.println("getSupplierProgress");
        String syncId = "";
        TransferMonitor instance = new TransferMonitor();
        SupplierProgress expResult = null;
        SupplierProgress result = instance.getSupplierProgress(syncId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentConsumers method, of class TransferMonitor.
     */
    @Test
    public void testGetCurrentConsumers() {
        System.out.println("getCurrentConsumers");
        Long supplierId = null;
        TransferMonitor instance = new TransferMonitor();
        List<CurrentSynchronization> expResult = null;
        List<CurrentSynchronization> result = instance.getCurrentConsumers(supplierId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
