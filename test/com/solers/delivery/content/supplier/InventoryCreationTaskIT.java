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
public class InventoryCreationTaskIT {
    
    public InventoryCreationTaskIT() {
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
     * Test of run method, of class InventoryCreationTask.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        InventoryCreationTask instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemCount method, of class InventoryCreationTask.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        InventoryCreationTask instance = null;
        long expResult = 0L;
        long result = instance.getItemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class InventoryCreationTask.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        InventoryCreationTask instance = null;
        long expResult = 0L;
        long result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastRuntime method, of class InventoryCreationTask.
     */
    @Test
    public void testGetLastRuntime() {
        System.out.println("getLastRuntime");
        InventoryCreationTask instance = null;
        long expResult = 0L;
        long result = instance.getLastRuntime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class InventoryCreationTask.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        InventoryCreationTask instance = null;
        String expResult = "";
        String result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextEstimatedRuntime method, of class InventoryCreationTask.
     */
    @Test
    public void testGetNextEstimatedRuntime() {
        System.out.println("getNextEstimatedRuntime");
        InventoryCreationTask instance = null;
        long expResult = 0L;
        long result = instance.getNextEstimatedRuntime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
