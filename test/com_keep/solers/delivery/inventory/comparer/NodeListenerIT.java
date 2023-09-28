/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.comparer;

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
public class NodeListenerIT {
    
    public NodeListenerIT() {
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
     * Test of onAdd method, of class NodeListener.
     */
    @Test
    public void testOnAdd() {
        System.out.println("onAdd");
        Node node = null;
        NodeListener instance = new NodeListenerImpl();
        instance.onAdd(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onUpdate method, of class NodeListener.
     */
    @Test
    public void testOnUpdate() {
        System.out.println("onUpdate");
        Node node = null;
        NodeListener instance = new NodeListenerImpl();
        instance.onUpdate(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onRemove method, of class NodeListener.
     */
    @Test
    public void testOnRemove() {
        System.out.println("onRemove");
        Node node = null;
        NodeListener instance = new NodeListenerImpl();
        instance.onRemove(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onStart method, of class NodeListener.
     */
    @Test
    public void testOnStart() {
        System.out.println("onStart");
        NodeListener instance = new NodeListenerImpl();
        instance.onStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onStop method, of class NodeListener.
     */
    @Test
    public void testOnStop() {
        System.out.println("onStop");
        NodeListener instance = new NodeListenerImpl();
        instance.onStop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class NodeListenerImpl implements NodeListener {

        public void onAdd(Node node) {
        }

        public void onUpdate(Node node) {
        }

        public void onRemove(Node node) {
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }

    public class NodeListenerImpl implements NodeListener {

        public void onAdd(Node node) {
        }

        public void onUpdate(Node node) {
        }

        public void onRemove(Node node) {
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }
    
}
