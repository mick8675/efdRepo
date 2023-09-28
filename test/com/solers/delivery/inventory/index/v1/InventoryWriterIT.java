/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.index.v1;

import java.io.File;
import java.io.RandomAccessFile;
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
public class InventoryWriterIT {
    
    public InventoryWriterIT() {
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
     * Test of write method, of class InventoryWriter.
     */
    @Test
    public void testWrite_String() throws Exception {
        System.out.println("write");
        String indexFile = "";
        InventoryWriter instance = null;
        instance.write(indexFile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of write method, of class InventoryWriter.
     */
    @Test
    public void testWrite_File() throws Exception {
        System.out.println("write");
        File index = null;
        InventoryWriter instance = null;
        instance.write(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recurse method, of class InventoryWriter.
     */
    @Test
    public void testRecurse() throws Exception {
        System.out.println("recurse");
        File f = null;
        RandomAccessFile out = null;
        InventoryWriter instance = null;
        int expResult = 0;
        int result = instance.recurse(f, out);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class InventoryWriter.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        File f = null;
        InventoryWriter instance = null;
        boolean expResult = false;
        boolean result = instance.create(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
