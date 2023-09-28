/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.consumer.difference;

import com.solers.delivery.inventory.node.Node;
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
public class DifferenceCounterIT {
    
    public DifferenceCounterIT() {
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
     * Test of onAdd method, of class DifferenceCounter.
     */
    @Test
    public void testOnAdd() {
        System.out.println("onAdd");
        Node node = null;
        DifferenceCounter instance = new DifferenceCounter();
        instance.onAdd(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onUpdate method, of class DifferenceCounter.
     */
    @Test
    public void testOnUpdate() {
        System.out.println("onUpdate");
        Node node = null;
        DifferenceCounter instance = new DifferenceCounter();
        instance.onUpdate(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onRemove method, of class DifferenceCounter.
     */
    @Test
    public void testOnRemove() {
        System.out.println("onRemove");
        Node node = null;
        DifferenceCounter instance = new DifferenceCounter();
        instance.onRemove(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onStart method, of class DifferenceCounter.
     */
    @Test
    public void testOnStart() {
        System.out.println("onStart");
        DifferenceCounter instance = new DifferenceCounter();
        instance.onStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onStop method, of class DifferenceCounter.
     */
    @Test
    public void testOnStop() {
        System.out.println("onStop");
        DifferenceCounter instance = new DifferenceCounter();
        instance.onStop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddBytes method, of class DifferenceCounter.
     */
    @Test
    public void testGetAddBytes() {
        System.out.println("getAddBytes");
        DifferenceCounter instance = new DifferenceCounter();
        long expResult = 0L;
        long result = instance.getAddBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUpdateBytes method, of class DifferenceCounter.
     */
    @Test
    public void testGetUpdateBytes() {
        System.out.println("getUpdateBytes");
        DifferenceCounter instance = new DifferenceCounter();
        long expResult = 0L;
        long result = instance.getUpdateBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeleteBytes method, of class DifferenceCounter.
     */
    @Test
    public void testGetDeleteBytes() {
        System.out.println("getDeleteBytes");
        DifferenceCounter instance = new DifferenceCounter();
        long expResult = 0L;
        long result = instance.getDeleteBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAdded method, of class DifferenceCounter.
     */
    @Test
    public void testGetItemsAdded() {
        System.out.println("getItemsAdded");
        DifferenceCounter instance = new DifferenceCounter();
        long expResult = 0L;
        long result = instance.getItemsAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsUpdated method, of class DifferenceCounter.
     */
    @Test
    public void testGetItemsUpdated() {
        System.out.println("getItemsUpdated");
        DifferenceCounter instance = new DifferenceCounter();
        long expResult = 0L;
        long result = instance.getItemsUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsDeleted method, of class DifferenceCounter.
     */
    @Test
    public void testGetItemsDeleted() {
        System.out.println("getItemsDeleted");
        DifferenceCounter instance = new DifferenceCounter();
        long expResult = 0L;
        long result = instance.getItemsDeleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilesAdded method, of class DifferenceCounter.
     */
    @Test
    public void testGetFilesAdded() {
        System.out.println("getFilesAdded");
        DifferenceCounter instance = new DifferenceCounter();
        long expResult = 0L;
        long result = instance.getFilesAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilesUpdated method, of class DifferenceCounter.
     */
    @Test
    public void testGetFilesUpdated() {
        System.out.println("getFilesUpdated");
        DifferenceCounter instance = new DifferenceCounter();
        long expResult = 0L;
        long result = instance.getFilesUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
