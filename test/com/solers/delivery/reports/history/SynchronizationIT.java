/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.reports.history;

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
public class SynchronizationIT {
    
    public SynchronizationIT() {
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
     * Test of getBytesFailed method, of class Synchronization.
     */
    @Test
    public void testGetBytesFailed() {
        System.out.println("getBytesFailed");
        Synchronization instance = new Synchronization();
        long expResult = 0L;
        long result = instance.getBytesFailed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBytesFailed method, of class Synchronization.
     */
    @Test
    public void testSetBytesFailed() {
        System.out.println("setBytesFailed");
        long bytesFailed = 0L;
        Synchronization instance = new Synchronization();
        instance.setBytesFailed(bytesFailed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFailures method, of class Synchronization.
     */
    @Test
    public void testGetFailures() {
        System.out.println("getFailures");
        Synchronization instance = new Synchronization();
        long expResult = 0L;
        long result = instance.getFailures();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFailures method, of class Synchronization.
     */
    @Test
    public void testSetFailures() {
        System.out.println("setFailures");
        long failures = 0L;
        Synchronization instance = new Synchronization();
        instance.setFailures(failures);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHost method, of class Synchronization.
     */
    @Test
    public void testGetHost() {
        System.out.println("getHost");
        Synchronization instance = new Synchronization();
        String expResult = "";
        String result = instance.getHost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHost method, of class Synchronization.
     */
    @Test
    public void testSetHost() {
        System.out.println("setHost");
        String host = "";
        Synchronization instance = new Synchronization();
        instance.setHost(host);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Synchronization.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Synchronization instance = new Synchronization();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Synchronization.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Synchronization instance = new Synchronization();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElapsedTime method, of class Synchronization.
     */
    @Test
    public void testGetElapsedTime() {
        System.out.println("getElapsedTime");
        Synchronization instance = new Synchronization();
        long expResult = 0L;
        long result = instance.getElapsedTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setElapsedTime method, of class Synchronization.
     */
    @Test
    public void testSetElapsedTime() {
        System.out.println("setElapsedTime");
        long elapsedTime = 0L;
        Synchronization instance = new Synchronization();
        instance.setElapsedTime(elapsedTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesAdded method, of class Synchronization.
     */
    @Test
    public void testGetBytesAdded() {
        System.out.println("getBytesAdded");
        Synchronization instance = new Synchronization();
        long expResult = 0L;
        long result = instance.getBytesAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBytesAdded method, of class Synchronization.
     */
    @Test
    public void testSetBytesAdded() {
        System.out.println("setBytesAdded");
        long bytesAdded = 0L;
        Synchronization instance = new Synchronization();
        instance.setBytesAdded(bytesAdded);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesUpdated method, of class Synchronization.
     */
    @Test
    public void testGetBytesUpdated() {
        System.out.println("getBytesUpdated");
        Synchronization instance = new Synchronization();
        long expResult = 0L;
        long result = instance.getBytesUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBytesUpdated method, of class Synchronization.
     */
    @Test
    public void testSetBytesUpdated() {
        System.out.println("setBytesUpdated");
        long bytesUpdated = 0L;
        Synchronization instance = new Synchronization();
        instance.setBytesUpdated(bytesUpdated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesDeleted method, of class Synchronization.
     */
    @Test
    public void testGetBytesDeleted() {
        System.out.println("getBytesDeleted");
        Synchronization instance = new Synchronization();
        long expResult = 0L;
        long result = instance.getBytesDeleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBytesDeleted method, of class Synchronization.
     */
    @Test
    public void testSetBytesDeleted() {
        System.out.println("setBytesDeleted");
        long bytesDeleted = 0L;
        Synchronization instance = new Synchronization();
        instance.setBytesDeleted(bytesDeleted);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdds method, of class Synchronization.
     */
    @Test
    public void testGetAdds() {
        System.out.println("getAdds");
        Synchronization instance = new Synchronization();
        long expResult = 0L;
        long result = instance.getAdds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdds method, of class Synchronization.
     */
    @Test
    public void testSetAdds() {
        System.out.println("setAdds");
        long adds = 0L;
        Synchronization instance = new Synchronization();
        instance.setAdds(adds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUpdates method, of class Synchronization.
     */
    @Test
    public void testGetUpdates() {
        System.out.println("getUpdates");
        Synchronization instance = new Synchronization();
        long expResult = 0L;
        long result = instance.getUpdates();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpdates method, of class Synchronization.
     */
    @Test
    public void testSetUpdates() {
        System.out.println("setUpdates");
        long updates = 0L;
        Synchronization instance = new Synchronization();
        instance.setUpdates(updates);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeletes method, of class Synchronization.
     */
    @Test
    public void testGetDeletes() {
        System.out.println("getDeletes");
        Synchronization instance = new Synchronization();
        long expResult = 0L;
        long result = instance.getDeletes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeletes method, of class Synchronization.
     */
    @Test
    public void testSetDeletes() {
        System.out.println("setDeletes");
        long deletes = 0L;
        Synchronization instance = new Synchronization();
        instance.setDeletes(deletes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class Synchronization.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Synchronization instance = new Synchronization();
        Date expResult = null;
        Date result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class Synchronization.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        Date endDate = null;
        Synchronization instance = new Synchronization();
        instance.setEndDate(endDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndTime method, of class Synchronization.
     */
    @Test
    public void testGetEndTime() {
        System.out.println("getEndTime");
        Synchronization instance = new Synchronization();
        long expResult = 0L;
        long result = instance.getEndTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndTime method, of class Synchronization.
     */
    @Test
    public void testSetEndTime() {
        System.out.println("setEndTime");
        long time = 0L;
        Synchronization instance = new Synchronization();
        instance.setEndTime(time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestamp method, of class Synchronization.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        Synchronization instance = new Synchronization();
        long expResult = 0L;
        long result = instance.getTimestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimestamp method, of class Synchronization.
     */
    @Test
    public void testSetTimestamp() {
        System.out.println("setTimestamp");
        long time = 0L;
        Synchronization instance = new Synchronization();
        instance.setTimestamp(time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSearchTime method, of class Synchronization.
     */
    @Test
    public void testSetSearchTime() {
        System.out.println("setSearchTime");
        Date searchTime = null;
        Synchronization instance = new Synchronization();
        instance.setSearchTime(searchTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
