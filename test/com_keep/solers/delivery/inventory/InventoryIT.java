/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory;

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
public class InventoryIT {
    
    public InventoryIT() {
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
     * Test of root method, of class Inventory.
     */
    @Test
    public void testRoot() {
        System.out.println("root");
        Inventory instance = new InventoryImpl();
        Node expResult = null;
        Node result = instance.root();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRootName method, of class Inventory.
     */
    @Test
    public void testGetRootName() {
        System.out.println("getRootName");
        Inventory instance = new InventoryImpl();
        String expResult = "";
        String result = instance.getRootName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class Inventory.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String path = "";
        Inventory instance = new InventoryImpl();
        Node expResult = null;
        Node result = instance.read(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useFilter method, of class Inventory.
     */
    @Test
    public void testUseFilter() {
        System.out.println("useFilter");
        Filter<Node> filter = null;
        Inventory instance = new InventoryImpl();
        instance.useFilter(filter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class Inventory.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        Inventory instance = new InventoryImpl();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperty method, of class Inventory.
     */
    @Test
    public void testGetProperty() {
        System.out.println("getProperty");
        String name = "";
        Inventory instance = new InventoryImpl();
        Object expResult = null;
        Object result = instance.getProperty(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of properties method, of class Inventory.
     */
    @Test
    public void testProperties() {
        System.out.println("properties");
        Inventory instance = new InventoryImpl();
        Set<String> expResult = null;
        Set<String> result = instance.properties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InventoryImpl implements Inventory {

        public Node root() {
            return null;
        }

        public String getRootName() {
            return "";
        }

        public Node read(String path) {
            return null;
        }

        public void useFilter(Filter<Node> filter) {
        }

        public void close() {
        }

        public Object getProperty(String name) {
            return null;
        }

        public Set<String> properties() {
            return null;
        }
    }

    public class InventoryImpl implements Inventory {

        public Node root() {
            return null;
        }

        public String getRootName() {
            return "";
        }

        public Node read(String path) {
            return null;
        }

        public void useFilter(Filter<Node> filter) {
        }

        public void close() {
        }

        public Object getProperty(String name) {
            return null;
        }

        public Set<String> properties() {
            return null;
        }
    }
    
}
