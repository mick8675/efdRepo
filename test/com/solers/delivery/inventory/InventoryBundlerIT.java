/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory;

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
public class InventoryBundlerIT {
    
    public InventoryBundlerIT() {
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
     * Test of setNumInventoryBackups method, of class InventoryBundler.
     */
    @Test
    public void testSetNumInventoryBackups() {
        System.out.println("setNumInventoryBackups");
        int numBackups = 0;
        InventoryBundler instance = null;
        instance.setNumInventoryBackups(numBackups);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bundlesAvailable method, of class InventoryBundler.
     */
    @Test
    public void testBundlesAvailable() {
        System.out.println("bundlesAvailable");
        InventoryBundler instance = null;
        boolean expResult = false;
        boolean result = instance.bundlesAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bundleInventory method, of class InventoryBundler.
     */
    @Test
    public void testBundleInventory() {
        System.out.println("bundleInventory");
        InventoryBundler instance = null;
        instance.bundleInventory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
