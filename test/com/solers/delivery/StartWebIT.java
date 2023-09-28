/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery;

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
public class StartWebIT {
    
    public StartWebIT() {
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
     * Test of start method, of class StartWeb.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        StartWeb instance = new StartWeb();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startupComplete method, of class StartWeb.
     */
    @Test
    public void testStartupComplete() {
        System.out.println("startupComplete");
        StartWeb instance = new StartWeb();
        instance.startupComplete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class StartWeb.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        StartWeb instance = new StartWeb();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class StartWeb.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        StartWeb.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
