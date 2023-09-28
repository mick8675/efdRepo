/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.index.diff;

import com.solers.delivery.inventory.DifferenceInventory;
import com.solers.delivery.inventory.node.Node;
import com.solers.util.Filter;
import com.solers.util.HashFunction;
import java.util.Collection;
import java.util.Set;
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
public class DifferenceFileReaderIT {
    
    public DifferenceFileReaderIT() {
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
     * Test of timestamp method, of class DifferenceFileReader.
     */
    @Test
    public void testTimestamp() {
        System.out.println("timestamp");
        DifferenceFileReader instance = null;
        long expResult = 0L;
        long result = instance.timestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHash method, of class DifferenceFileReader.
     */
    @Test
    public void testGetHash() {
        System.out.println("getHash");
        DifferenceFileReader instance = null;
        HashFunction expResult = null;
        HashFunction result = instance.getHash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of root method, of class DifferenceFileReader.
     */
    @Test
    public void testRoot() {
        System.out.println("root");
        DifferenceFileReader instance = null;
        Node expResult = null;
        Node result = instance.root();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRootName method, of class DifferenceFileReader.
     */
    @Test
    public void testGetRootName() {
        System.out.println("getRootName");
        DifferenceFileReader instance = null;
        String expResult = "";
        String result = instance.getRootName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of roots method, of class DifferenceFileReader.
     */
    @Test
    public void testRoots() {
        System.out.println("roots");
        DifferenceFileReader instance = null;
        Collection<Node> expResult = null;
        Collection<Node> result = instance.roots();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cacheRoots method, of class DifferenceFileReader.
     */
    @Test
    public void testCacheRoots() {
        System.out.println("cacheRoots");
        DifferenceFileReader instance = null;
        instance.cacheRoots();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class DifferenceFileReader.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String path = "";
        DifferenceFileReader instance = null;
        Node expResult = null;
        Node result = instance.read(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readRoot method, of class DifferenceFileReader.
     */
    @Test
    public void testReadRoot() throws Exception {
        System.out.println("readRoot");
        int offset = 0;
        DifferenceFileReader instance = null;
        DiffParentNode expResult = null;
        DiffParentNode result = instance.readRoot(offset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readDifference method, of class DifferenceFileReader.
     */
    @Test
    public void testReadDifference_int_boolean() throws Exception {
        System.out.println("readDifference");
        int offset = 0;
        boolean child = false;
        DifferenceFileReader instance = null;
        DifferenceNode expResult = null;
        DifferenceNode result = instance.readDifference(offset, child);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readDifference method, of class DifferenceFileReader.
     */
    @Test
    public void testReadDifference_int_DiffParentNode() throws Exception {
        System.out.println("readDifference");
        int offset = 0;
        DiffParentNode parent = null;
        DifferenceFileReader instance = null;
        DifferenceNode expResult = null;
        DifferenceNode result = instance.readDifference(offset, parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readEntry method, of class DifferenceFileReader.
     */
    @Test
    public void testReadEntry() throws Exception {
        System.out.println("readEntry");
        int offset = 0;
        boolean child = false;
        DifferenceFileReader instance = null;
        EntryStruct expResult = null;
        EntryStruct result = instance.readEntry(offset, child);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class DifferenceFileReader.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        DifferenceFileReader instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useFilter method, of class DifferenceFileReader.
     */
    @Test
    public void testUseFilter() {
        System.out.println("useFilter");
        Filter<Node> filter = null;
        DifferenceFileReader instance = null;
        instance.useFilter(filter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperty method, of class DifferenceFileReader.
     */
    @Test
    public void testGetProperty() {
        System.out.println("getProperty");
        String name = "";
        DifferenceFileReader instance = null;
        Object expResult = null;
        Object result = instance.getProperty(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of properties method, of class DifferenceFileReader.
     */
    @Test
    public void testProperties() {
        System.out.println("properties");
        DifferenceFileReader instance = null;
        Set<String> expResult = null;
        Set<String> result = instance.properties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class DifferenceFileReader.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        DifferenceInventory other = null;
        DifferenceFileReader instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class DifferenceFileReader.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        DifferenceFileReader instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class DifferenceFileReader.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        DifferenceFileReader instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
