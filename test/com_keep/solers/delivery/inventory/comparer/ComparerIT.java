/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.comparer;

import com.solers.delivery.inventory.Inventory;
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
public class ComparerIT {
    
    public ComparerIT() {
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
     * Test of compare method, of class Comparer.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Inventory desired = null;
        Inventory existing = null;
        NodeListener handler = null;
        Comparer instance = new ComparerImpl();
        instance.compare(desired, existing, handler);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ComparerImpl implements Comparer {

        public void compare(Inventory desired, Inventory existing, NodeListener handler) {
        }
    }

    public class ComparerImpl implements Comparer {

        public void compare(Inventory desired, Inventory existing, NodeListener handler) {
        }
    }
    
}
