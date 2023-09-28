/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.event;

import com.solers.delivery.content.status.ConsumerProgress;
import com.solers.delivery.content.status.SynchronizationResult;
import java.util.Date;
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
public class SynchronizationEventIT {
    
    public SynchronizationEventIT() {
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
     * Test of getProgress method, of class SynchronizationEvent.
     */
    @Test
    public void testGetProgress() {
        System.out.println("getProgress");
        SynchronizationEvent instance = null;
        ConsumerProgress expResult = null;
        ConsumerProgress result = instance.getProgress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHost method, of class SynchronizationEvent.
     */
    @Test
    public void testGetHost() {
        System.out.println("getHost");
        SynchronizationEvent instance = null;
        String expResult = "";
        String result = instance.getHost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHost method, of class SynchronizationEvent.
     */
    @Test
    public void testSetHost() {
        System.out.println("setHost");
        String remoteHost = "";
        SynchronizationEvent instance = null;
        instance.setHost(remoteHost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setElapsedTime method, of class SynchronizationEvent.
     */
    @Test
    public void testSetElapsedTime() {
        System.out.println("setElapsedTime");
        Long time = null;
        SynchronizationEvent instance = null;
        instance.setElapsedTime(time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProgress method, of class SynchronizationEvent.
     */
    @Test
    public void testSetProgress() {
        System.out.println("setProgress");
        ConsumerProgress progress = null;
        SynchronizationEvent instance = null;
        instance.setProgress(progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class SynchronizationEvent.
     */
    @Test
    public void testGetId_0args() {
        System.out.println("getId");
        SynchronizationEvent instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class SynchronizationEvent.
     */
    @Test
    public void testGetId_String_long() {
        System.out.println("getId");
        String key = "";
        long contentSetId = 0L;
        String expResult = "";
        String result = SynchronizationEvent.getId(key, contentSetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKey method, of class SynchronizationEvent.
     */
    @Test
    public void testGetKey_String() {
        System.out.println("getKey");
        String id = "";
        String expResult = "";
        String result = SynchronizationEvent.getKey(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKey method, of class SynchronizationEvent.
     */
    @Test
    public void testGetKey_0args() {
        System.out.println("getKey");
        SynchronizationEvent instance = null;
        String expResult = "";
        String result = instance.getKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetId method, of class SynchronizationEvent.
     */
    @Test
    public void testGetContentSetId() {
        System.out.println("getContentSetId");
        SynchronizationEvent instance = null;
        long expResult = 0L;
        long result = instance.getContentSetId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElapsedTime method, of class SynchronizationEvent.
     */
    @Test
    public void testGetElapsedTime() {
        System.out.println("getElapsedTime");
        SynchronizationEvent instance = null;
        long expResult = 0L;
        long result = instance.getElapsedTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesAdded method, of class SynchronizationEvent.
     */
    @Test
    public void testGetBytesAdded() {
        System.out.println("getBytesAdded");
        SynchronizationEvent instance = null;
        long expResult = 0L;
        long result = instance.getBytesAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesUpdated method, of class SynchronizationEvent.
     */
    @Test
    public void testGetBytesUpdated() {
        System.out.println("getBytesUpdated");
        SynchronizationEvent instance = null;
        long expResult = 0L;
        long result = instance.getBytesUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesDeleted method, of class SynchronizationEvent.
     */
    @Test
    public void testGetBytesDeleted() {
        System.out.println("getBytesDeleted");
        SynchronizationEvent instance = null;
        long expResult = 0L;
        long result = instance.getBytesDeleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesFailed method, of class SynchronizationEvent.
     */
    @Test
    public void testGetBytesFailed() {
        System.out.println("getBytesFailed");
        SynchronizationEvent instance = null;
        long expResult = 0L;
        long result = instance.getBytesFailed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilesAdded method, of class SynchronizationEvent.
     */
    @Test
    public void testGetFilesAdded() {
        System.out.println("getFilesAdded");
        SynchronizationEvent instance = null;
        long expResult = 0L;
        long result = instance.getFilesAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilesUpdated method, of class SynchronizationEvent.
     */
    @Test
    public void testGetFilesUpdated() {
        System.out.println("getFilesUpdated");
        SynchronizationEvent instance = null;
        long expResult = 0L;
        long result = instance.getFilesUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilesDeleted method, of class SynchronizationEvent.
     */
    @Test
    public void testGetFilesDeleted() {
        System.out.println("getFilesDeleted");
        SynchronizationEvent instance = null;
        long expResult = 0L;
        long result = instance.getFilesDeleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFailures method, of class SynchronizationEvent.
     */
    @Test
    public void testGetFailures() {
        System.out.println("getFailures");
        SynchronizationEvent instance = null;
        long expResult = 0L;
        long result = instance.getFailures();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SynchronizationEvent.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SynchronizationEvent instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class SynchronizationEvent.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SynchronizationEvent instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class SynchronizationEvent.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        SynchronizationEvent instance = null;
        Date expResult = null;
        Date result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class SynchronizationEvent.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        SynchronizationEvent instance = null;
        SynchronizationResult expResult = null;
        SynchronizationResult result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class SynchronizationEvent.
     */
    @Test
    public void testSetResult() {
        System.out.println("setResult");
        SynchronizationResult result_2 = null;
        SynchronizationEvent instance = null;
        instance.setResult(result_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completed method, of class SynchronizationEvent.
     */
    @Test
    public void testCompleted() {
        System.out.println("completed");
        long elapsedTime = 0L;
        SynchronizationEvent instance = null;
        instance.completed(elapsedTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
