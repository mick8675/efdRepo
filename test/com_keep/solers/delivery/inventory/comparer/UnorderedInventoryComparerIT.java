/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.comparer;

import com.solers.delivery.inventory.Inventory;
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
public class UnorderedInventoryComparerIT {
    
    public UnorderedInventoryComparerIT() {
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
     * Test of setHeapSize method, of class UnorderedInventoryComparer.
     */
    @Test
    public void testSetHeapSize() {
        System.out.println("setHeapSize");
        int heapSize = 0;
        UnorderedInventoryComparer instance = new UnorderedInventoryComparer();
        instance.setHeapSize(heapSize);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compare method, of class UnorderedInventoryComparer.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Inventory desired = null;
        Inventory existing = null;
        NodeListener theHandler = null;
        UnorderedInventoryComparer instance = new UnorderedInventoryComparer();
        instance.compare(desired, existing, theHandler);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
