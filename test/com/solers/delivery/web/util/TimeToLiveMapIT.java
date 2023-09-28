/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.util;

import com.solers.util.unit.TimeIntervalUnit;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
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
public class TimeToLiveMapIT {
    
    public TimeToLiveMapIT() {
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
     * Test of clear method, of class TimeToLiveMap.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        TimeToLiveMap instance = new TimeToLiveMap();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsKey method, of class TimeToLiveMap.
     */
    @Test
    public void testContainsKey() {
        System.out.println("containsKey");
        Object key = null;
        TimeToLiveMap instance = new TimeToLiveMap();
        boolean expResult = false;
        boolean result = instance.containsKey(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsValue method, of class TimeToLiveMap.
     */
    @Test
    public void testContainsValue() {
        System.out.println("containsValue");
        Object value = null;
        TimeToLiveMap instance = new TimeToLiveMap();
        boolean expResult = false;
        boolean result = instance.containsValue(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class TimeToLiveMap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        TimeToLiveMap instance = new TimeToLiveMap();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class TimeToLiveMap.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        TimeToLiveMap instance = new TimeToLiveMap();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of entrySet method, of class TimeToLiveMap.
     */
    @Test
    public void testEntrySet() {
        System.out.println("entrySet");
        Object key;
        //Statement value=null;
        TimeToLiveMap instance = new TimeToLiveMap();
        Set<Map.Entry<Object,Object>> expResult = null;
        Set<Map.Entry<Object,Object>> result = instance.entrySet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keySet method, of class TimeToLiveMap.
     */
    @Test
    public void testKeySet() {
        System.out.println("keySet");
        TimeToLiveMap instance = new TimeToLiveMap();
        Set expResult = null;
        Set result = instance.keySet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of values method, of class TimeToLiveMap.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        TimeToLiveMap instance = new TimeToLiveMap();
        Collection expResult = null;
        Collection result = instance.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class TimeToLiveMap.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object key = null;
        TimeToLiveMap instance = new TimeToLiveMap();
        Object expResult = null;
        Object result = instance.get(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class TimeToLiveMap.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Object key = null;
        Object value = null;
        TimeToLiveMap instance = new TimeToLiveMap();
        Object expResult = null;
        Object result = instance.put(key, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putAll method, of class TimeToLiveMap.
     */
    @Test
    public void testPutAll() {
        System.out.println("putAll");
        Map t = null;
        TimeToLiveMap instance = new TimeToLiveMap();
        instance.putAll(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class TimeToLiveMap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object key = null;
        TimeToLiveMap instance = new TimeToLiveMap();
        Object expResult = null;
        Object result = instance.remove(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expireKey method, of class TimeToLiveMap.
     */
    @Test
    public void testExpireKey() {
        System.out.println("expireKey");
        Object key = null;
        TimeIntervalUnit unit = null;
        long value = 0L;
        TimeToLiveMap instance = new TimeToLiveMap();
        instance.expireKey(key, unit, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTTL method, of class TimeToLiveMap.
     */
    @Test
    public void testGetTTL() {
        System.out.println("getTTL");
        TimeToLiveMap instance = new TimeToLiveMap();
        long expResult = 0L;
        long result = instance.getTTL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expireAndRemove method, of class TimeToLiveMap.
     */
    @Test
    public void testExpireAndRemove() {
        System.out.println("expireAndRemove");
        TimeToLiveMap instance = new TimeToLiveMap();
        boolean expResult = false;
        boolean result = instance.expireAndRemove(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
