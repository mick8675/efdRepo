/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting.event;

import java.util.Iterator;
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
public class MapEventConsumersImplIT {
    
    public MapEventConsumersImplIT() {
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
     * Test of addConsumer method, of class MapEventConsumersImpl.
     */
    @Test
    public void testAddConsumer() {
        System.out.println("addConsumer");
        MapEventConsumersImpl instance = new MapEventConsumersImpl();
        instance.addConsumer(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class MapEventConsumersImpl.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MapEventConsumersImpl instance = new MapEventConsumersImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeConsumer method, of class MapEventConsumersImpl.
     */
    @Test
    public void testRemoveConsumer() {
        System.out.println("removeConsumer");
        MapEventConsumersImpl instance = new MapEventConsumersImpl();
        instance.removeConsumer(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class MapEventConsumersImpl.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        MapEventConsumersImpl instance = new MapEventConsumersImpl();
        Iterator<Consumer<V>> expResult = null;
        Iterator<Consumer<V>> result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
