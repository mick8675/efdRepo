/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util;

import java.util.Iterator;
import java.util.Map;
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
public class SoftCacheIT {
    
    public SoftCacheIT() {
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
     * Test of put method, of class SoftCache.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Object key = null;
        Object value = null;
        SoftCache instance = null;
        Object expResult = null;
        Object result = instance.put(key, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class SoftCache.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object key = null;
        SoftCache instance = null;
        Object expResult = null;
        Object result = instance.get(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class SoftCache.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object key = null;
        SoftCache instance = null;
        Object expResult = null;
        Object result = instance.remove(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class SoftCache.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SoftCache instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class SoftCache.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SoftCache instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class SoftCache.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        SoftCache instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class SoftCache.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        SoftCache instance = null;
        Iterator<Map.Entry<Object, Object>> expResult = null;
        Iterator<Map.Entry<Object, Object>> result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
