/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.index;

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
public class HeaderStructIT {
    
    public HeaderStructIT() {
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
     * Test of create method, of class HeaderStruct.
     */
    @Test
    public void testCreate_byte_int() {
        System.out.println("create");
        byte version = 0;
        int rootOffset = 0;
        HeaderStruct expResult = null;
        HeaderStruct result = HeaderStruct.create(version, rootOffset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class HeaderStruct.
     */
    @Test
    public void testCreate_DataInput() throws Exception {
        System.out.println("create");
        DataInput in = null;
        HeaderStruct expResult = null;
        HeaderStruct result = HeaderStruct.create(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pack method, of class HeaderStruct.
     */
    @Test
    public void testPack() {
        System.out.println("pack");
        HeaderStruct instance = null;
        byte[] expResult = null;
        byte[] result = instance.pack();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pack method, of class HeaderStruct.
     */
    @Test
    public void testPack_DataOutput() throws Exception {
        System.out.println("pack");
        DataOutput out = null;
        HeaderStruct instance = null;
        instance.pack(out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
