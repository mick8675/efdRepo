/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.index.diff;

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
public class DifferenceNodeIT {
    
    public DifferenceNodeIT() {
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
     * Test of isChanged method, of class DifferenceNode.
     */
    @Test
    public void testIsChanged() {
        System.out.println("isChanged");
        DifferenceNode instance = new DifferenceNodeImpl();
        boolean expResult = false;
        boolean result = instance.isChanged();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRemoved method, of class DifferenceNode.
     */
    @Test
    public void testIsRemoved() {
        System.out.println("isRemoved");
        DifferenceNode instance = new DifferenceNodeImpl();
        boolean expResult = false;
        boolean result = instance.isRemoved();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DifferenceNodeImpl implements DifferenceNode {

        public boolean isChanged() {
            return false;
        }

        public boolean isRemoved() {
            return false;
        }
    }

    public class DifferenceNodeImpl implements DifferenceNode {

        public boolean isChanged() {
            return false;
        }

        public boolean isRemoved() {
            return false;
        }
    }
    
}
