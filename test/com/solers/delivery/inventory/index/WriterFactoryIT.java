/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.index;

import com.solers.delivery.inventory.Inventory;
import com.solers.delivery.inventory.Writer;
import com.solers.delivery.inventory.node.Node;
import java.net.URI;
import java.util.Map;
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
public class WriterFactoryIT {
    
    public WriterFactoryIT() {
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
     * Test of newInstance method, of class WriterFactory.
     */
    @Test
    public void testNewInstance_Node() {
        System.out.println("newInstance");
        Node rootNode = null;
        Writer expResult = null;
        Writer result = WriterFactory.newInstance(rootNode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newInstance method, of class WriterFactory.
     */
    @Test
    public void testNewInstance_Inventory() {
        System.out.println("newInstance");
        Inventory inv = null;
        Writer expResult = null;
        Writer result = WriterFactory.newInstance(inv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newInstance method, of class WriterFactory.
     */
    @Test
    public void testNewInstance_URI_Map() {
        System.out.println("newInstance");
        URI resource = null;
        Map<String, Object> parameters = null;
        Writer expResult = null;
        Writer result = WriterFactory.newInstance(resource, parameters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newInstance method, of class WriterFactory.
     */
    @Test
    public void testNewInstance_Inventory_String() {
        System.out.println("newInstance");
        Inventory backingInventory = null;
        String hashingAlgorithm = "";
        Writer expResult = null;
        Writer result = WriterFactory.newInstance(backingInventory, hashingAlgorithm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newInstance method, of class WriterFactory.
     */
    @Test
    public void testNewInstance_Node_String() {
        System.out.println("newInstance");
        Node rootNode = null;
        String hashingAlgorithm = "";
        Writer expResult = null;
        Writer result = WriterFactory.newInstance(rootNode, hashingAlgorithm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newInstance method, of class WriterFactory.
     */
    @Test
    public void testNewInstance_3args() {
        System.out.println("newInstance");
        Node rootNode = null;
        String hashingAlgorithm = "";
        long timestamp = 0L;
        Writer expResult = null;
        Writer result = WriterFactory.newInstance(rootNode, hashingAlgorithm, timestamp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
