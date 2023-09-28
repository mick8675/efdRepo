/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory;

import java.io.File;
import java.io.IOException;
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
public class WriterIT {
    
    public WriterIT() {
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
     * Test of write method, of class Writer.
     */
    @Test
    public void testWrite_String() throws Exception {
        System.out.println("write");
        String inventoryFile = "";
        Writer instance = new WriterImpl();
        instance.write(inventoryFile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of write method, of class Writer.
     */
    @Test
    public void testWrite_File() throws Exception {
        System.out.println("write");
        File inventory = null;
        Writer instance = new WriterImpl();
        instance.write(inventory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class WriterImpl implements Writer {

        public void write(String inventoryFile) throws IOException {
        }

        public void write(File inventory) throws IOException {
        }
    }
    
}
