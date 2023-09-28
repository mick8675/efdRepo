/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.node;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
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
public class NodeIT {
    
    public NodeIT() {
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
     * Test of getName method, of class Node.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Node instance = new NodeImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChildren method, of class Node.
     */
    @Test
    public void testGetChildren() {
        System.out.println("getChildren");
        Node instance = new NodeImpl();
        List<Node> expResult = null;
        List<Node> result = instance.getChildren();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Node.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Node instance = new NodeImpl();
        long expResult = 0L;
        long result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestamp method, of class Node.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        Node instance = new NodeImpl();
        long expResult = 0L;
        long result = instance.getTimestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPath method, of class Node.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        Node instance = new NodeImpl();
        String expResult = "";
        String result = instance.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDirectory method, of class Node.
     */
    @Test
    public void testIsDirectory() {
        System.out.println("isDirectory");
        Node instance = new NodeImpl();
        boolean expResult = false;
        boolean result = instance.isDirectory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParent method, of class Node.
     */
    @Test
    public void testGetParent() {
        System.out.println("getParent");
        Node instance = new NodeImpl();
        Node expResult = null;
        Node result = instance.getParent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChild method, of class Node.
     */
    @Test
    public void testGetChild() {
        System.out.println("getChild");
        String name = "";
        Node instance = new NodeImpl();
        Node expResult = null;
        Node result = instance.getChild(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openStream method, of class Node.
     */
    @Test
    public void testOpenStream() throws Exception {
        System.out.println("openStream");
        Node instance = new NodeImpl();
        InputStream expResult = null;
        InputStream result = instance.openStream();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class NodeImpl implements Node {

        public String getName() {
            return "";
        }

        public List<Node> getChildren() {
            return null;
        }

        public long getSize() {
            return 0L;
        }

        public long getTimestamp() {
            return 0L;
        }

        public String getPath() {
            return "";
        }

        public boolean isDirectory() {
            return false;
        }

        public Node getParent() {
            return null;
        }

        public Node getChild(String name) {
            return null;
        }

        public InputStream openStream() throws IOException {
            return null;
        }
    }

    public class NodeImpl implements Node {

        public String getName() {
            return "";
        }

        public List<Node> getChildren() {
            return null;
        }

        public long getSize() {
            return 0L;
        }

        public long getTimestamp() {
            return 0L;
        }

        public String getPath() {
            return "";
        }

        public boolean isDirectory() {
            return false;
        }

        public Node getParent() {
            return null;
        }

        public Node getChild(String name) {
            return null;
        }

        public InputStream openStream() throws IOException {
            return null;
        }
    }
    
}
