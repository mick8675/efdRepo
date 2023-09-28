/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.supplier;

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
public class InventoryDifferencePrunerIT {
    
    public InventoryDifferencePrunerIT() {
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
     * Test of prune method, of class InventoryDifferencePruner.
     */
    @Test
    public void testPrune_0args() {
        System.out.println("prune");
        InventoryDifferencePruner instance = null;
        boolean expResult = false;
        boolean result = instance.prune();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prune method, of class InventoryDifferencePruner.
     */
    @Test
    public void testPrune_long() {
        System.out.println("prune");
        long value = 0L;
        InventoryDifferencePruner instance = null;
        boolean expResult = false;
        boolean result = instance.prune(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prune method, of class InventoryDifferencePruner.
     */
    @Test
    public void testPrune_long_InventoryDifferencePrunerPolicy() {
        System.out.println("prune");
        long value = 0L;
        InventoryDifferencePruner.Policy policy = null;
        InventoryDifferencePruner instance = null;
        boolean expResult = false;
        boolean result = instance.prune(value, policy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pruneFileCount method, of class InventoryDifferencePruner.
     */
    @Test
    public void testPruneFileCount() {
        System.out.println("pruneFileCount");
        long files = 0L;
        InventoryDifferencePruner instance = null;
        boolean expResult = false;
        boolean result = instance.pruneFileCount(files);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pruneDuration method, of class InventoryDifferencePruner.
     */
    @Test
    public void testPruneDuration() {
        System.out.println("pruneDuration");
        long duration = 0L;
        InventoryDifferencePruner instance = null;
        boolean expResult = false;
        boolean result = instance.pruneDuration(duration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
