/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.index;

import java.io.DataOutput;
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
public class PackableIT {
    
    public PackableIT() {
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
     * Test of pack method, of class Packable.
     */
    @Test
    public void testPack() {
        System.out.println("pack");
        Packable instance = new PackableImpl();
        byte[] expResult = null;
        byte[] result = instance.pack();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pack method, of class Packable.
     */
    @Test
    public void testPack_DataOutput() throws Exception {
        System.out.println("pack");
        DataOutput out = null;
        Packable instance = new PackableImpl();
        instance.pack(out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PackableImpl implements Packable {

        public byte[] pack() {
            return null;
        }

        public void pack(DataOutput out) throws IOException {
        }
    }

    public class PackableImpl implements Packable {

        public byte[] pack() {
            return null;
        }

        public void pack(DataOutput out) throws IOException {
        }
    }
    
}
