/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.index.diff;

import com.solers.delivery.inventory.node.Node;
import java.io.DataInput;
import java.io.DataOutput;
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
public class EntryStructIT {
    
    public EntryStructIT() {
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
     * Test of create method, of class EntryStruct.
     */
    @Test
    public void testCreate_3args() {
        System.out.println("create");
        Node f = null;
        boolean changed = false;
        boolean child = false;
        EntryStruct expResult = null;
        EntryStruct result = EntryStruct.create(f, changed, child);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class EntryStruct.
     */
    @Test
    public void testCreate_DataInput_boolean() throws Exception {
        System.out.println("create");
        DataInput in = null;
        boolean child = false;
        EntryStruct expResult = null;
        EntryStruct result = EntryStruct.create(in, child);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pack method, of class EntryStruct.
     */
    @Test
    public void testPack() {
        System.out.println("pack");
        EntryStruct instance = null;
        byte[] expResult = null;
        byte[] result = instance.pack();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pack method, of class EntryStruct.
     */
    @Test
    public void testPack_DataOutput() throws Exception {
        System.out.println("pack");
        DataOutput out = null;
        EntryStruct instance = null;
        instance.pack(out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
