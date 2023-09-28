/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.consumer;

import com.solers.delivery.content.status.SynchronizationResult;
import com.solers.delivery.transport.http.client.Transfer;
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
public class InventoryResultIT {
    
    public InventoryResultIT() {
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
     * Test of successful method, of class InventoryResult.
     */
    @Test
    public void testSuccessful() {
        System.out.println("successful");
        InventoryResult instance = null;
        boolean expResult = false;
        boolean result = instance.successful();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class InventoryResult.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        InventoryResult instance = null;
        Transfer.Status expResult = null;
        Transfer.Status result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSynchronizationResult method, of class InventoryResult.
     */
    @Test
    public void testGetSynchronizationResult() {
        System.out.println("getSynchronizationResult");
        InventoryResult instance = null;
        SynchronizationResult expResult = null;
        SynchronizationResult result = instance.getSynchronizationResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
