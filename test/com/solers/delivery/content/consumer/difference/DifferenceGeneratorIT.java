/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.consumer.difference;

import com.solers.delivery.content.status.ConsumerProgress;
import com.solers.delivery.inventory.comparer.NodeListener;
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
public class DifferenceGeneratorIT {
    
    public DifferenceGeneratorIT() {
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
     * Test of run method, of class DifferenceGenerator.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        DifferenceGenerator instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prescan method, of class DifferenceGenerator.
     */
    @Test
    public void testPrescan() {
        System.out.println("prescan");
        ConsumerProgress progress = null;
        DifferenceGenerator instance = null;
        instance.prescan(progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of runCompare method, of class DifferenceGenerator.
     */
    @Test
    public void testRunCompare() {
        System.out.println("runCompare");
        NodeListener handler = null;
        boolean prescan = false;
        DifferenceGenerator instance = null;
        instance.runCompare(handler, prescan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
