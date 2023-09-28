/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.index.v2;

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
public class HeaderExtensionIT {
    
    public HeaderExtensionIT() {
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
     * Test of create method, of class HeaderExtension.
     */
    @Test
    public void testCreate_String_long() {
        System.out.println("create");
        String hashAlgorithm = "";
        long lkg_timestamp = 0L;
        HeaderExtension expResult = null;
        HeaderExtension result = HeaderExtension.create(hashAlgorithm, lkg_timestamp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class HeaderExtension.
     */
    @Test
    public void testCreate_DataInput() throws Exception {
        System.out.println("create");
        DataInput in = null;
        HeaderExtension expResult = null;
        HeaderExtension result = HeaderExtension.create(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pack method, of class HeaderExtension.
     */
    @Test
    public void testPack() {
        System.out.println("pack");
        HeaderExtension instance = null;
        byte[] expResult = null;
        byte[] result = instance.pack();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pack method, of class HeaderExtension.
     */
    @Test
    public void testPack_DataOutput() throws Exception {
        System.out.println("pack");
        DataOutput out = null;
        HeaderExtension instance = null;
        instance.pack(out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
