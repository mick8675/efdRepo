/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.tools.inventory;

import com.solers.delivery.inventory.DifferenceInventory;
import com.solers.delivery.inventory.node.Node;
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
public class DifferenceViewerIT {
    
    public DifferenceViewerIT() {
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
     * Test of main method, of class DifferenceViewer.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DifferenceViewer.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class DifferenceViewer.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        DifferenceInventory inv = null;
        DifferenceViewer instance = null;
        instance.run(inv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class DifferenceViewer.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Node node = null;
        int depth = 0;
        DifferenceViewer instance = null;
        instance.start(node, depth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
