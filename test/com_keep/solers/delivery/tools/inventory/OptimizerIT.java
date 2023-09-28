/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.tools.inventory;

import com.solers.delivery.inventory.Inventory;
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
public class OptimizerIT {
    
    public OptimizerIT() {
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
     * Test of analyze method, of class Optimizer.
     */
    @Test
    public void testAnalyze() {
        System.out.println("analyze");
        Inventory inv = null;
        Optimizer instance = new Optimizer();
        Map<String, Long> expResult = null;
        Map<String, Long> result = instance.analyze(inv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of optimal method, of class Optimizer.
     */
    @Test
    public void testOptimal_Map() {
        System.out.println("optimal");
        Map<String, Long> resultData = null;
        Optimizer instance = new Optimizer();
        String expResult = "";
        String result = instance.optimal(resultData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of optimal method, of class Optimizer.
     */
    @Test
    public void testOptimal_Inventory() {
        System.out.println("optimal");
        Inventory inv = null;
        Optimizer instance = new Optimizer();
        String expResult = "";
        String result = instance.optimal(inv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Optimizer.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Optimizer.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
