/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.index;

import com.solers.util.HashFunction;
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
public class HashUtilIT {
    
    public HashUtilIT() {
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
     * Test of index method, of class HashUtil.
     */
    @Test
    public void testIndex() {
        System.out.println("index");
        String name = "";
        HashFunction hash = null;
        int buckets = 0;
        int expResult = 0;
        int result = HashUtil.index(name, hash, buckets);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class HashUtil.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int[] table = null;
        int desired = 0;
        int value = 0;
        boolean expResult = false;
        boolean result = HashUtil.set(table, desired, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
