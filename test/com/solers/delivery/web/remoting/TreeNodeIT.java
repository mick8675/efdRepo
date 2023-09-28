/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.remoting;

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
public class TreeNodeIT {
    
    public TreeNodeIT() {
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
     * Test of getId method, of class TreeNode.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        TreeNode instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class TreeNode.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        TreeNode instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class TreeNode.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        TreeNode instance = null;
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setText method, of class TreeNode.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String title = "";
        TreeNode instance = null;
        instance.setText(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeaf method, of class TreeNode.
     */
    @Test
    public void testIsLeaf() {
        System.out.println("isLeaf");
        TreeNode instance = null;
        boolean expResult = false;
        boolean result = instance.isLeaf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLeaf method, of class TreeNode.
     */
    @Test
    public void testSetLeaf() {
        System.out.println("setLeaf");
        boolean leaf = false;
        TreeNode instance = null;
        instance.setLeaf(leaf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
