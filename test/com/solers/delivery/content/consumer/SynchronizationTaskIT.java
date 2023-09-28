/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.consumer;

import com.solers.delivery.event.listener.EventListener;
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
public class SynchronizationTaskIT {
    
    public SynchronizationTaskIT() {
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
     * Test of setEventManager method, of class SynchronizationTask.
     */
    @Test
    public void testSetEventManager() {
        System.out.println("setEventManager");
        EventListener eventManager = null;
        SynchronizationTask instance = null;
        instance.setEventManager(eventManager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetId method, of class SynchronizationTask.
     */
    @Test
    public void testGetContentSetId() {
        System.out.println("getContentSetId");
        SynchronizationTask instance = null;
        Long expResult = null;
        Long result = instance.getContentSetId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SynchronizationTask.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SynchronizationTask instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class SynchronizationTask.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        SynchronizationTask instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventoryTimestamp method, of class SynchronizationTask.
     */
    @Test
    public void testGetInventoryTimestamp() {
        System.out.println("getInventoryTimestamp");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getInventoryTimestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPercentCompleted method, of class SynchronizationTask.
     */
    @Test
    public void testGetPercentCompleted() {
        System.out.println("getPercentCompleted");
        SynchronizationTask instance = null;
        double expResult = 0.0;
        double result = instance.getPercentCompleted();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesAdded method, of class SynchronizationTask.
     */
    @Test
    public void testGetBytesAdded() {
        System.out.println("getBytesAdded");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getBytesAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesDeleted method, of class SynchronizationTask.
     */
    @Test
    public void testGetBytesDeleted() {
        System.out.println("getBytesDeleted");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getBytesDeleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesUpdated method, of class SynchronizationTask.
     */
    @Test
    public void testGetBytesUpdated() {
        System.out.println("getBytesUpdated");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getBytesUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAdded method, of class SynchronizationTask.
     */
    @Test
    public void testGetItemsAdded() {
        System.out.println("getItemsAdded");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getItemsAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsDeleted method, of class SynchronizationTask.
     */
    @Test
    public void testGetItemsDeleted() {
        System.out.println("getItemsDeleted");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getItemsDeleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsUpdated method, of class SynchronizationTask.
     */
    @Test
    public void testGetItemsUpdated() {
        System.out.println("getItemsUpdated");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getItemsUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class SynchronizationTask.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        SynchronizationTask instance = null;
        String expResult = "";
        String result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemCount method, of class SynchronizationTask.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getItemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class SynchronizationTask.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastRuntime method, of class SynchronizationTask.
     */
    @Test
    public void testGetLastRuntime() {
        System.out.println("getLastRuntime");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getLastRuntime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTransfers method, of class SynchronizationTask.
     */
    @Test
    public void testGetCurrentTransfers() {
        System.out.println("getCurrentTransfers");
        SynchronizationTask instance = null;
        List<TransferStatus> expResult = null;
        List<TransferStatus> result = instance.getCurrentTransfers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnabled method, of class SynchronizationTask.
     */
    @Test
    public void testIsEnabled() {
        System.out.println("isEnabled");
        SynchronizationTask instance = null;
        boolean expResult = false;
        boolean result = instance.isEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElapsedTime method, of class SynchronizationTask.
     */
    @Test
    public void testGetElapsedTime() {
        System.out.println("getElapsedTime");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getElapsedTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRemainingTime method, of class SynchronizationTask.
     */
    @Test
    public void testGetRemainingTime() {
        System.out.println("getRemainingTime");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getRemainingTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextEstimatedRuntime method, of class SynchronizationTask.
     */
    @Test
    public void testGetNextEstimatedRuntime() {
        System.out.println("getNextEstimatedRuntime");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getNextEstimatedRuntime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesAddedRemaining method, of class SynchronizationTask.
     */
    @Test
    public void testGetBytesAddedRemaining() {
        System.out.println("getBytesAddedRemaining");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getBytesAddedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesDeletedRemaining method, of class SynchronizationTask.
     */
    @Test
    public void testGetBytesDeletedRemaining() {
        System.out.println("getBytesDeletedRemaining");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getBytesDeletedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesUpdatedRemaining method, of class SynchronizationTask.
     */
    @Test
    public void testGetBytesUpdatedRemaining() {
        System.out.println("getBytesUpdatedRemaining");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getBytesUpdatedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAddedRemaining method, of class SynchronizationTask.
     */
    @Test
    public void testGetItemsAddedRemaining() {
        System.out.println("getItemsAddedRemaining");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getItemsAddedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsDeletedRemaining method, of class SynchronizationTask.
     */
    @Test
    public void testGetItemsDeletedRemaining() {
        System.out.println("getItemsDeletedRemaining");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getItemsDeletedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsUpdatedRemaining method, of class SynchronizationTask.
     */
    @Test
    public void testGetItemsUpdatedRemaining() {
        System.out.println("getItemsUpdatedRemaining");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getItemsUpdatedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFailures method, of class SynchronizationTask.
     */
    @Test
    public void testGetFailures() {
        System.out.println("getFailures");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getFailures();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesFailed method, of class SynchronizationTask.
     */
    @Test
    public void testGetBytesFailed() {
        System.out.println("getBytesFailed");
        SynchronizationTask instance = null;
        long expResult = 0L;
        long result = instance.getBytesFailed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
