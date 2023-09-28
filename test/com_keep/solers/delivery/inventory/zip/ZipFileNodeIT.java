/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.zip;

import com.solers.delivery.inventory.node.Node;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipFile;
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
public class ZipFileNodeIT {
    
    public ZipFileNodeIT() {
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
     * Test of fromPath method, of class ZipFileNode.
     */
    @Test
    public void testFromPath() {
        System.out.println("fromPath");
        String rootName = "";
        long rootTimestamp = 0L;
        ZipFile source = null;
        String path = "";
        ZipFileNode expResult = null;
        ZipFileNode result = ZipFileNode.fromPath(rootName, rootTimestamp, source, path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParentPath method, of class ZipFileNode.
     */
    @Test
    public void testGetParentPath() {
        System.out.println("getParentPath");
        String currentPath = "";
        String expResult = "";
        String result = ZipFileNode.getParentPath(currentPath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChildren method, of class ZipFileNode.
     */
    @Test
    public void testGetChildren() {
        System.out.println("getChildren");
        ZipFileNode instance = null;
        List<Node> expResult = null;
        List<Node> result = instance.getChildren();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChild method, of class ZipFileNode.
     */
    @Test
    public void testGetChild() {
        System.out.println("getChild");
        String name = "";
        ZipFileNode instance = null;
        Node expResult = null;
        Node result = instance.getChild(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class ZipFileNode.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ZipFileNode instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParent method, of class ZipFileNode.
     */
    @Test
    public void testGetParent() {
        System.out.println("getParent");
        ZipFileNode instance = null;
        Node expResult = null;
        Node result = instance.getParent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPath method, of class ZipFileNode.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        ZipFileNode instance = null;
        String expResult = "";
        String result = instance.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestamp method, of class ZipFileNode.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        ZipFileNode instance = null;
        long expResult = 0L;
        long result = instance.getTimestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDirectory method, of class ZipFileNode.
     */
    @Test
    public void testIsDirectory() {
        System.out.println("isDirectory");
        ZipFileNode instance = null;
        boolean expResult = false;
        boolean result = instance.isDirectory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openStream method, of class ZipFileNode.
     */
    @Test
    public void testOpenStream() throws Exception {
        System.out.println("openStream");
        ZipFileNode instance = null;
        InputStream expResult = null;
        InputStream result = instance.openStream();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
