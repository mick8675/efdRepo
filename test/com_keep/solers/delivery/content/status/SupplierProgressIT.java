/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.status;

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
public class SupplierProgressIT {
    
    public SupplierProgressIT() {
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
     * Test of sentBytes method, of class SupplierProgress.
     */
    @Test
    public void testSentBytes() {
        System.out.println("sentBytes");
        long bytes = 0L;
        SupplierProgress instance = null;
        instance.sentBytes(bytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sentItem method, of class SupplierProgress.
     */
    @Test
    public void testSentItem() {
        System.out.println("sentItem");
        SupplierProgress instance = null;
        instance.sentItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPercentComplete method, of class SupplierProgress.
     */
    @Test
    public void testGetPercentComplete() {
        System.out.println("getPercentComplete");
        SupplierProgress instance = null;
        double expResult = 0.0;
        double result = instance.getPercentComplete();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalItems method, of class SupplierProgress.
     */
    @Test
    public void testGetTotalItems() {
        System.out.println("getTotalItems");
        SupplierProgress instance = null;
        long expResult = 0L;
        long result = instance.getTotalItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBytes method, of class SupplierProgress.
     */
    @Test
    public void testGetTotalBytes() {
        System.out.println("getTotalBytes");
        SupplierProgress instance = null;
        long expResult = 0L;
        long result = instance.getTotalBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompletedBytes method, of class SupplierProgress.
     */
    @Test
    public void testGetCompletedBytes() {
        System.out.println("getCompletedBytes");
        SupplierProgress instance = null;
        long expResult = 0L;
        long result = instance.getCompletedBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompletedItems method, of class SupplierProgress.
     */
    @Test
    public void testGetCompletedItems() {
        System.out.println("getCompletedItems");
        SupplierProgress instance = null;
        long expResult = 0L;
        long result = instance.getCompletedItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastUpdateTime method, of class SupplierProgress.
     */
    @Test
    public void testGetLastUpdateTime() {
        System.out.println("getLastUpdateTime");
        SupplierProgress instance = null;
        long expResult = 0L;
        long result = instance.getLastUpdateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class SupplierProgress.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        SupplierProgress instance = null;
        SynchronizationResult expResult = null;
        SynchronizationResult result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
