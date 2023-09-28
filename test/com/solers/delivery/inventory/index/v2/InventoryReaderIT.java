/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.index.v2;

import com.solers.delivery.inventory.node.Node;
import com.solers.util.Filter;
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
public class InventoryReaderIT {
    
    public InventoryReaderIT() {
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
     * Test of readEntry method, of class InventoryReader.
     */
    @Test
    public void testReadEntry() throws Exception {
        System.out.println("readEntry");
        int offset = 0;
        InventoryReader instance = null;
        EntryStruct expResult = null;
        EntryStruct result = instance.readEntry(offset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of root method, of class InventoryReader.
     */
    @Test
    public void testRoot() {
        System.out.println("root");
        InventoryReader instance = null;
        Node expResult = null;
        Node result = instance.root();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRootName method, of class InventoryReader.
     */
    @Test
    public void testGetRootName() {
        System.out.println("getRootName");
        InventoryReader instance = null;
        String expResult = "";
        String result = instance.getRootName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useFilter method, of class InventoryReader.
     */
    @Test
    public void testUseFilter() {
        System.out.println("useFilter");
        Filter<Node> filter = null;
        InventoryReader instance = null;
        instance.useFilter(filter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of timestamp method, of class InventoryReader.
     */
    @Test
    public void testTimestamp() {
        System.out.println("timestamp");
        InventoryReader instance = null;
        long expResult = 0L;
        long result = instance.timestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class InventoryReader.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String path = "";
        InventoryReader instance = null;
        Node expResult = null;
        Node result = instance.read(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalize method, of class InventoryReader.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        InventoryReader instance = null;
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class InventoryReader.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        InventoryReader instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperty method, of class InventoryReader.
     */
    @Test
    public void testGetProperty() {
        System.out.println("getProperty");
        String name = "";
        InventoryReader instance = null;
        Object expResult = null;
        Object result = instance.getProperty(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of properties method, of class InventoryReader.
     */
    @Test
    public void testProperties() {
        System.out.println("properties");
        InventoryReader instance = null;
        Set<String> expResult = null;
        Set<String> result = instance.properties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
