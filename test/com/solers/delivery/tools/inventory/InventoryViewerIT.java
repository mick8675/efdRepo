/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.tools.inventory;

import com.solers.delivery.inventory.node.Node;
import java.io.File;
import java.io.PrintStream;
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
public class InventoryViewerIT {
    
    public InventoryViewerIT() {
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
     * Test of toggleFlags method, of class InventoryViewer.
     */
    @Test
    public void testToggleFlags() {
        System.out.println("toggleFlags");
        InventoryViewer v = null;
        String[] args = null;
        boolean expResult = false;
        boolean result = InventoryViewer.toggleFlags(v, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class InventoryViewer.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        InventoryViewer.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printUsage method, of class InventoryViewer.
     */
    @Test
    public void testPrintUsage() {
        System.out.println("printUsage");
        PrintStream out = null;
        InventoryViewer.printUsage(out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of error method, of class InventoryViewer.
     */
    @Test
    public void testError() {
        System.out.println("error");
        File file = null;
        String msg = "";
        InventoryViewer.error(file, msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShowPath method, of class InventoryViewer.
     */
    @Test
    public void testSetShowPath() {
        System.out.println("setShowPath");
        boolean showPath = false;
        InventoryViewer instance = null;
        instance.setShowPath(showPath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrdered method, of class InventoryViewer.
     */
    @Test
    public void testSetOrdered() {
        System.out.println("setOrdered");
        boolean ordered = false;
        InventoryViewer instance = null;
        instance.setOrdered(ordered);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShowProperties method, of class InventoryViewer.
     */
    @Test
    public void testSetShowProperties() {
        System.out.println("setShowProperties");
        boolean showProps = false;
        InventoryViewer instance = null;
        instance.setShowProperties(showProps);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class InventoryViewer.
     */
    @Test
    public void testRun_File() throws Exception {
        System.out.println("run");
        File invFile = null;
        InventoryViewer instance = null;
        instance.run(invFile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class InventoryViewer.
     */
    @Test
    public void testRun_Node() {
        System.out.println("run");
        Node node = null;
        InventoryViewer instance = null;
        instance.run(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class InventoryViewer.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Node node = null;
        int depth = 0;
        InventoryViewer instance = null;
        instance.start(node, depth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
