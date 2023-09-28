/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.tools.inventory;

import com.solers.delivery.inventory.Inventory;
import com.solers.delivery.inventory.comparer.NodeListener;
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
public class CompareIT {
    
    public CompareIT() {
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
     * Test of compare method, of class Compare.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Inventory a = null;
        Inventory b = null;
        Compare instance = null;
        instance.compare(a, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHandler method, of class Compare.
     */
    @Test
    public void testGetHandler() {
        System.out.println("getHandler");
        Compare instance = null;
        NodeListener expResult = null;
        NodeListener result = instance.getHandler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHandler method, of class Compare.
     */
    @Test
    public void testSetHandler() {
        System.out.println("setHandler");
        NodeListener handler = null;
        Compare instance = null;
        instance.setHandler(handler);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Compare.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Compare.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printUsage method, of class Compare.
     */
    @Test
    public void testPrintUsage() {
        System.out.println("printUsage");
        Compare.printUsage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
