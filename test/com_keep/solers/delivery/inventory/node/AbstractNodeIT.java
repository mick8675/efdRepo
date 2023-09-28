/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.node;

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
public class AbstractNodeIT {
    
    public AbstractNodeIT() {
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
     * Test of getTimestampAccuracy method, of class AbstractNode.
     */
    @Test
    public void testGetTimestampAccuracy_0args() {
        System.out.println("getTimestampAccuracy");
        AbstractNode instance = new AbstractNodeImpl();
        int expResult = 0;
        int result = instance.getTimestampAccuracy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestampAccuracy method, of class AbstractNode.
     */
    @Test
    public void testGetTimestampAccuracy_Node() {
        System.out.println("getTimestampAccuracy");
        Node other = null;
        AbstractNode instance = new AbstractNodeImpl();
        int expResult = 0;
        int result = instance.getTimestampAccuracy(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class AbstractNode.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        AbstractNode instance = new AbstractNodeImpl();
        long expResult = 0L;
        long result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nodeSize method, of class AbstractNode.
     */
    @Test
    public void testNodeSize() {
        System.out.println("nodeSize");
        AbstractNode instance = new AbstractNodeImpl();
        long expResult = 0L;
        long result = instance.nodeSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class AbstractNode.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        AbstractNode instance = new AbstractNodeImpl();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class AbstractNode.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        AbstractNode instance = new AbstractNodeImpl();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AbstractNode.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AbstractNode instance = new AbstractNodeImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class AbstractNode.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Node other = null;
        AbstractNode instance = new AbstractNodeImpl();
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChild method, of class AbstractNode.
     */
    @Test
    public void testGetChild() {
        System.out.println("getChild");
        String name = "";
        AbstractNode instance = new AbstractNodeImpl();
        Node expResult = null;
        Node result = instance.getChild(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of timestampEquals method, of class AbstractNode.
     */
    @Test
    public void testTimestampEquals() {
        System.out.println("timestampEquals");
        long other = 0L;
        int accuracy = 0;
        AbstractNode instance = new AbstractNodeImpl();
        boolean expResult = false;
        boolean result = instance.timestampEquals(other, accuracy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sizeEquals method, of class AbstractNode.
     */
    @Test
    public void testSizeEquals() {
        System.out.println("sizeEquals");
        long other = 0L;
        AbstractNode instance = new AbstractNodeImpl();
        boolean expResult = false;
        boolean result = instance.sizeEquals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractNodeImpl extends AbstractNode {
    }

    public class AbstractNodeImpl extends AbstractNode {
    }
    
}
