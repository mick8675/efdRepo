/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.status;

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
public class ConsumerProgressIT {
    
    public ConsumerProgressIT() {
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
     * Test of initialize method, of class ConsumerProgress.
     */
    @Test
    public void testInitialize_6args() {
        System.out.println("initialize");
        long addItems = 0L;
        long addBytes = 0L;
        long updateItems = 0L;
        long updateBytes = 0L;
        long deleteItems = 0L;
        long deleteBytes = 0L;
        ConsumerProgress instance = new ConsumerProgress();
        instance.initialize(addItems, addBytes, updateItems, updateBytes, deleteItems, deleteBytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class ConsumerProgress.
     */
    @Test
    public void testInitialize_long_long() {
        System.out.println("initialize");
        long addItems = 0L;
        long addBytes = 0L;
        ConsumerProgress instance = new ConsumerProgress();
        instance.initialize(addItems, addBytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKey method, of class ConsumerProgress.
     */
    @Test
    public void testGetKey() {
        System.out.println("getKey");
        ConsumerProgress instance = new ConsumerProgress();
        String expResult = "";
        String result = instance.getKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKey method, of class ConsumerProgress.
     */
    @Test
    public void testSetKey() {
        System.out.println("setKey");
        String key = "";
        ConsumerProgress instance = new ConsumerProgress();
        instance.setKey(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTotalDelete method, of class ConsumerProgress.
     */
    @Test
    public void testAddTotalDelete() {
        System.out.println("addTotalDelete");
        long bytes = 0L;
        ConsumerProgress instance = new ConsumerProgress();
        instance.addTotalDelete(bytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLastUpdateTime method, of class ConsumerProgress.
     */
    @Test
    public void testUpdateLastUpdateTime() {
        System.out.println("updateLastUpdateTime");
        ConsumerProgress instance = new ConsumerProgress();
        instance.updateLastUpdateTime();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPercentComplete method, of class ConsumerProgress.
     */
    @Test
    public void testGetPercentComplete_0args() {
        System.out.println("getPercentComplete");
        ConsumerProgress instance = new ConsumerProgress();
        double expResult = 0.0;
        double result = instance.getPercentComplete();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPercentComplete method, of class ConsumerProgress.
     */
    @Test
    public void testGetPercentComplete_List() {
        System.out.println("getPercentComplete");
        List<TransferStatus> xfers = null;
        ConsumerProgress instance = new ConsumerProgress();
        double expResult = 0.0;
        double result = instance.getPercentComplete(xfers);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalNewFiles method, of class ConsumerProgress.
     */
    @Test
    public void testGetTotalNewFiles() {
        System.out.println("getTotalNewFiles");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getTotalNewFiles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalNewFiles method, of class ConsumerProgress.
     */
    @Test
    public void testSetTotalNewFiles() {
        System.out.println("setTotalNewFiles");
        long value = 0L;
        ConsumerProgress instance = new ConsumerProgress();
        instance.setTotalNewFiles(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalNewBytes method, of class ConsumerProgress.
     */
    @Test
    public void testGetTotalNewBytes() {
        System.out.println("getTotalNewBytes");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getTotalNewBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompletedItems method, of class ConsumerProgress.
     */
    @Test
    public void testGetCompletedItems() {
        System.out.println("getCompletedItems");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getCompletedItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalItems method, of class ConsumerProgress.
     */
    @Test
    public void testGetTotalItems() {
        System.out.println("getTotalItems");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getTotalItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBytes method, of class ConsumerProgress.
     */
    @Test
    public void testGetTotalBytes() {
        System.out.println("getTotalBytes");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getTotalBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFailures method, of class ConsumerProgress.
     */
    @Test
    public void testGetFailures() {
        System.out.println("getFailures");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getFailures();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFailedBytes method, of class ConsumerProgress.
     */
    @Test
    public void testGetFailedBytes() {
        System.out.println("getFailedBytes");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getFailedBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompletedBytes method, of class ConsumerProgress.
     */
    @Test
    public void testGetCompletedBytes() {
        System.out.println("getCompletedBytes");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getCompletedBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesAdded method, of class ConsumerProgress.
     */
    @Test
    public void testGetBytesAdded_List() {
        System.out.println("getBytesAdded");
        List<TransferStatus> xfers = null;
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getBytesAdded(xfers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesAdded method, of class ConsumerProgress.
     */
    @Test
    public void testGetBytesAdded_0args() {
        System.out.println("getBytesAdded");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getBytesAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesAddedRemaining method, of class ConsumerProgress.
     */
    @Test
    public void testGetBytesAddedRemaining_List() {
        System.out.println("getBytesAddedRemaining");
        List<TransferStatus> xfers = null;
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getBytesAddedRemaining(xfers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesAddedRemaining method, of class ConsumerProgress.
     */
    @Test
    public void testGetBytesAddedRemaining_0args() {
        System.out.println("getBytesAddedRemaining");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getBytesAddedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesUpdated method, of class ConsumerProgress.
     */
    @Test
    public void testGetBytesUpdated_0args() {
        System.out.println("getBytesUpdated");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getBytesUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesUpdated method, of class ConsumerProgress.
     */
    @Test
    public void testGetBytesUpdated_List() {
        System.out.println("getBytesUpdated");
        List<TransferStatus> xfers = null;
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getBytesUpdated(xfers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesUpdatedRemaining method, of class ConsumerProgress.
     */
    @Test
    public void testGetBytesUpdatedRemaining_List() {
        System.out.println("getBytesUpdatedRemaining");
        List<TransferStatus> xfers = null;
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getBytesUpdatedRemaining(xfers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesUpdatedRemaining method, of class ConsumerProgress.
     */
    @Test
    public void testGetBytesUpdatedRemaining_0args() {
        System.out.println("getBytesUpdatedRemaining");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getBytesUpdatedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesDeleted method, of class ConsumerProgress.
     */
    @Test
    public void testGetBytesDeleted() {
        System.out.println("getBytesDeleted");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getBytesDeleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesDeletedRemaining method, of class ConsumerProgress.
     */
    @Test
    public void testGetBytesDeletedRemaining() {
        System.out.println("getBytesDeletedRemaining");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getBytesDeletedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilesAdded method, of class ConsumerProgress.
     */
    @Test
    public void testGetFilesAdded() {
        System.out.println("getFilesAdded");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getFilesAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilesAddedRemaining method, of class ConsumerProgress.
     */
    @Test
    public void testGetFilesAddedRemaining() {
        System.out.println("getFilesAddedRemaining");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getFilesAddedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilesUpdated method, of class ConsumerProgress.
     */
    @Test
    public void testGetFilesUpdated() {
        System.out.println("getFilesUpdated");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getFilesUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilesUpdatedRemaining method, of class ConsumerProgress.
     */
    @Test
    public void testGetFilesUpdatedRemaining() {
        System.out.println("getFilesUpdatedRemaining");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getFilesUpdatedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilesDeleted method, of class ConsumerProgress.
     */
    @Test
    public void testGetFilesDeleted() {
        System.out.println("getFilesDeleted");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getFilesDeleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilesDeletedRemaining method, of class ConsumerProgress.
     */
    @Test
    public void testGetFilesDeletedRemaining() {
        System.out.println("getFilesDeletedRemaining");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getFilesDeletedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of added method, of class ConsumerProgress.
     */
    @Test
    public void testAdded() {
        System.out.println("added");
        long bytes = 0L;
        boolean success = false;
        ConsumerProgress instance = new ConsumerProgress();
        instance.added(bytes, success);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removed method, of class ConsumerProgress.
     */
    @Test
    public void testRemoved() {
        System.out.println("removed");
        long bytes = 0L;
        boolean success = false;
        ConsumerProgress instance = new ConsumerProgress();
        instance.removed(bytes, success);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastUpdateTime method, of class ConsumerProgress.
     */
    @Test
    public void testGetLastUpdateTime() {
        System.out.println("getLastUpdateTime");
        ConsumerProgress instance = new ConsumerProgress();
        long expResult = 0L;
        long result = instance.getLastUpdateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updated method, of class ConsumerProgress.
     */
    @Test
    public void testUpdated() {
        System.out.println("updated");
        long bytes = 0L;
        boolean success = false;
        ConsumerProgress instance = new ConsumerProgress();
        instance.updated(bytes, success);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
