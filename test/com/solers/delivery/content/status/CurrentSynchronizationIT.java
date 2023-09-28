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
public class CurrentSynchronizationIT {
    
    public CurrentSynchronizationIT() {
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
     * Test of getLastUpdateInterval method, of class CurrentSynchronization.
     */
    @Test
    public void testGetLastUpdateInterval() {
        System.out.println("getLastUpdateInterval");
        CurrentSynchronization instance = new CurrentSynchronization();
        Long expResult = null;
        Long result = instance.getLastUpdateInterval();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastUpdateInterval method, of class CurrentSynchronization.
     */
    @Test
    public void testSetLastUpdateInterval() {
        System.out.println("setLastUpdateInterval");
        Long lastUpdateInterval = null;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setLastUpdateInterval(lastUpdateInterval);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class CurrentSynchronization.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        CurrentSynchronization instance = new CurrentSynchronization();
        SynchronizationResult expResult = null;
        SynchronizationResult result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class CurrentSynchronization.
     */
    @Test
    public void testSetResult() {
        System.out.println("setResult");
        SynchronizationResult result_2 = null;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setResult(result_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElapsedTime method, of class CurrentSynchronization.
     */
    @Test
    public void testGetElapsedTime() {
        System.out.println("getElapsedTime");
        CurrentSynchronization instance = new CurrentSynchronization();
        Long expResult = null;
        Long result = instance.getElapsedTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setElapsedTime method, of class CurrentSynchronization.
     */
    @Test
    public void testSetElapsedTime() {
        System.out.println("setElapsedTime");
        Long elapsedTime = null;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setElapsedTime(elapsedTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRemainingTime method, of class CurrentSynchronization.
     */
    @Test
    public void testGetRemainingTime() {
        System.out.println("getRemainingTime");
        CurrentSynchronization instance = new CurrentSynchronization();
        Long expResult = null;
        Long result = instance.getRemainingTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRemainingTime method, of class CurrentSynchronization.
     */
    @Test
    public void testSetRemainingTime() {
        System.out.println("setRemainingTime");
        Long remainingTime = null;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setRemainingTime(remainingTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSupplier method, of class CurrentSynchronization.
     */
    @Test
    public void testIsSupplier() {
        System.out.println("isSupplier");
        CurrentSynchronization instance = new CurrentSynchronization();
        boolean expResult = false;
        boolean result = instance.isSupplier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupplier method, of class CurrentSynchronization.
     */
    @Test
    public void testSetSupplier() {
        System.out.println("setSupplier");
        boolean supplier = false;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setSupplier(supplier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTransfers method, of class CurrentSynchronization.
     */
    @Test
    public void testGetCurrentTransfers() {
        System.out.println("getCurrentTransfers");
        CurrentSynchronization instance = new CurrentSynchronization();
        List<TransferStatus> expResult = null;
        List<TransferStatus> result = instance.getCurrentTransfers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentTransfers method, of class CurrentSynchronization.
     */
    @Test
    public void testSetCurrentTransfers() {
        System.out.println("setCurrentTransfers");
        List<TransferStatus> currentTransfers = null;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setCurrentTransfers(currentTransfers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHost method, of class CurrentSynchronization.
     */
    @Test
    public void testGetHost() {
        System.out.println("getHost");
        CurrentSynchronization instance = new CurrentSynchronization();
        String expResult = "";
        String result = instance.getHost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHost method, of class CurrentSynchronization.
     */
    @Test
    public void testSetHost() {
        System.out.println("setHost");
        String host = "";
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setHost(host);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class CurrentSynchronization.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        CurrentSynchronization instance = new CurrentSynchronization();
        Long expResult = null;
        Long result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class CurrentSynchronization.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Long date = null;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetName method, of class CurrentSynchronization.
     */
    @Test
    public void testGetContentSetName() {
        System.out.println("getContentSetName");
        CurrentSynchronization instance = new CurrentSynchronization();
        String expResult = "";
        String result = instance.getContentSetName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContentSetName method, of class CurrentSynchronization.
     */
    @Test
    public void testSetContentSetName() {
        System.out.println("setContentSetName");
        String contentSetName = "";
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setContentSetName(contentSetName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetId method, of class CurrentSynchronization.
     */
    @Test
    public void testGetContentSetId() {
        System.out.println("getContentSetId");
        CurrentSynchronization instance = new CurrentSynchronization();
        Long expResult = null;
        Long result = instance.getContentSetId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContentSetId method, of class CurrentSynchronization.
     */
    @Test
    public void testSetContentSetId() {
        System.out.println("setContentSetId");
        Long contentSetId = null;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setContentSetId(contentSetId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompletedBytes method, of class CurrentSynchronization.
     */
    @Test
    public void testGetCompletedBytes() {
        System.out.println("getCompletedBytes");
        CurrentSynchronization instance = new CurrentSynchronization();
        Long expResult = null;
        Long result = instance.getCompletedBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompletedBytes method, of class CurrentSynchronization.
     */
    @Test
    public void testSetCompletedBytes() {
        System.out.println("setCompletedBytes");
        Long completedBytes = null;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setCompletedBytes(completedBytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBytes method, of class CurrentSynchronization.
     */
    @Test
    public void testGetTotalBytes() {
        System.out.println("getTotalBytes");
        CurrentSynchronization instance = new CurrentSynchronization();
        Long expResult = null;
        Long result = instance.getTotalBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalBytes method, of class CurrentSynchronization.
     */
    @Test
    public void testSetTotalBytes() {
        System.out.println("setTotalBytes");
        Long totalBytes = null;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setTotalBytes(totalBytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsCompleted method, of class CurrentSynchronization.
     */
    @Test
    public void testGetItemsCompleted() {
        System.out.println("getItemsCompleted");
        CurrentSynchronization instance = new CurrentSynchronization();
        Long expResult = null;
        Long result = instance.getItemsCompleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemsCompleted method, of class CurrentSynchronization.
     */
    @Test
    public void testSetItemsCompleted() {
        System.out.println("setItemsCompleted");
        Long itemsCompleted = null;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setItemsCompleted(itemsCompleted);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalItems method, of class CurrentSynchronization.
     */
    @Test
    public void testGetTotalItems() {
        System.out.println("getTotalItems");
        CurrentSynchronization instance = new CurrentSynchronization();
        Long expResult = null;
        Long result = instance.getTotalItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalItems method, of class CurrentSynchronization.
     */
    @Test
    public void testSetTotalItems() {
        System.out.println("setTotalItems");
        Long totalItems = null;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setTotalItems(totalItems);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPercentSuccessful method, of class CurrentSynchronization.
     */
    @Test
    public void testGetPercentSuccessful() {
        System.out.println("getPercentSuccessful");
        CurrentSynchronization instance = new CurrentSynchronization();
        Double expResult = null;
        Double result = instance.getPercentSuccessful();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPercentSuccessful method, of class CurrentSynchronization.
     */
    @Test
    public void testSetPercentSuccessful() {
        System.out.println("setPercentSuccessful");
        Double percentSuccessful = null;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setPercentSuccessful(percentSuccessful);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isActive method, of class CurrentSynchronization.
     */
    @Test
    public void testIsActive() {
        System.out.println("isActive");
        CurrentSynchronization instance = new CurrentSynchronization();
        boolean expResult = false;
        boolean result = instance.isActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActive method, of class CurrentSynchronization.
     */
    @Test
    public void testSetActive() {
        System.out.println("setActive");
        boolean active = false;
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setActive(active);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class CurrentSynchronization.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        CurrentSynchronization instance = new CurrentSynchronization();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class CurrentSynchronization.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        CurrentSynchronization instance = new CurrentSynchronization();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
