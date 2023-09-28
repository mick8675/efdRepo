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
public class EventConsumersIT {
    
    public EventConsumersIT() {
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
     * Test of addConsumer method, of class EventConsumers.
     */
    @Test
    public void testAddConsumer() {
        System.out.println("addConsumer");
        Object consumer = null;
        EventConsumers instance = new EventConsumersImpl();
        instance.addConsumer(consumer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeConsumer method, of class EventConsumers.
     */
    @Test
    public void testRemoveConsumer() {
        System.out.println("removeConsumer");
        Object consumer = null;
        EventConsumers instance = new EventConsumersImpl();
        instance.removeConsumer(consumer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class EventConsumers.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        EventConsumers instance = new EventConsumersImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class EventConsumers.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        EventConsumers instance = new EventConsumersImpl();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EventConsumersImpl implements EventConsumers {

        public void addConsumer(E consumer) {
        }

        public void removeConsumer(E consumer) {
        }

        public int size() {
            return 0;
        }

        public Iterator<E> iterator() {
            return null;
        }
    }

    public class EventConsumersImpl implements EventConsumers {

        public void addConsumer(E consumer) {
        }

        public void removeConsumer(E consumer) {
        }

        public int size() {
            return 0;
        }

        public Iterator<E> iterator() {
            return null;
        }
    }
    
}
