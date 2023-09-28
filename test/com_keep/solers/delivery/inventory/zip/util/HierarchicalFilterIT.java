/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.zip.util;

import java.util.zip.ZipEntry;
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
public class HierarchicalFilterIT {
    
    public HierarchicalFilterIT() {
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
     * Test of accept method, of class HierarchicalFilter.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        ZipEntry entry = null;
        HierarchicalFilter instance = null;
        boolean expResult = false;
        boolean result = instance.accept(entry);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inDirectory method, of class HierarchicalFilter.
     */
    @Test
    public void testInDirectory() {
        System.out.println("inDirectory");
        String name = "";
        HierarchicalFilter instance = null;
        boolean expResult = false;
        boolean result = instance.inDirectory(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
