/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.zipmanifest;

import com.solers.delivery.inventory.node.Node;
import com.solers.util.Filter;
import java.io.File;
import java.util.Set;
import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;
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
public class ZipFileInventoryIT {
    
    public ZipFileInventoryIT() {
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
     * Test of close method, of class ZipFileInventory.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        ZipFileInventory instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperty method, of class ZipFileInventory.
     */
    @Test
    public void testGetProperty() {
        System.out.println("getProperty");
        String name = "";
        ZipFileInventory instance = null;
        Object expResult = null;
        Object result = instance.getProperty(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRootName method, of class ZipFileInventory.
     */
    @Test
    public void testGetRootName() {
        System.out.println("getRootName");
        ZipFileInventory instance = null;
        String expResult = "";
        String result = instance.getRootName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of properties method, of class ZipFileInventory.
     */
    @Test
    public void testProperties() {
        System.out.println("properties");
        ZipFileInventory instance = null;
        Set<String> expResult = null;
        Set<String> result = instance.properties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class ZipFileInventory.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String path = "";
        ZipFileInventory instance = null;
        Node expResult = null;
        Node result = instance.read(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of root method, of class ZipFileInventory.
     */
    @Test
    public void testRoot() {
        System.out.println("root");
        ZipFileInventory instance = null;
        Node expResult = null;
        Node result = instance.root();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useFilter method, of class ZipFileInventory.
     */
    @Test
    public void testUseFilter() {
        System.out.println("useFilter");
        Filter<Node> filter = null;
        ZipFileInventory instance = null;
        instance.useFilter(filter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntry method, of class ZipFileInventory.
     */
    @Test
    public void testGetEntry() {
        System.out.println("getEntry");
        ZipFile source = null;
        String entryName = "";
        ZipEntry expResult = null;
        ZipEntry result = ZipFileInventory.getEntry(source, entryName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadNode method, of class ZipFileInventory.
     */
    @Test
    public void testLoadNode() {
        System.out.println("loadNode");
        File f = null;
        Node parent = null;
        ZipFileInventory instance = null;
        Node expResult = null;
        Node result = instance.loadNode(f, parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
