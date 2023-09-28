/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.consumer.difference;

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
public class DifferenceQueuerIT {
    
    public DifferenceQueuerIT() {
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
     * Test of onAdd method, of class DifferenceQueuer.
     */
    @Test
    public void testOnAdd() {
        System.out.println("onAdd");
        Node node = null;
        DifferenceQueuer instance = null;
        instance.onAdd(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onUpdate method, of class DifferenceQueuer.
     */
    @Test
    public void testOnUpdate() {
        System.out.println("onUpdate");
        Node node = null;
        DifferenceQueuer instance = null;
        instance.onUpdate(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onRemove method, of class DifferenceQueuer.
     */
    @Test
    public void testOnRemove() {
        System.out.println("onRemove");
        Node node = null;
        DifferenceQueuer instance = null;
        instance.onRemove(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onStart method, of class DifferenceQueuer.
     */
    @Test
    public void testOnStart() {
        System.out.println("onStart");
        DifferenceQueuer instance = null;
        instance.onStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onStop method, of class DifferenceQueuer.
     */
    @Test
    public void testOnStop() {
        System.out.println("onStop");
        DifferenceQueuer instance = null;
        instance.onStop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
