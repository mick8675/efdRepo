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
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class StartIT {
    
    public StartIT() {
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
     * Test of main method, of class Start.
     */
    @Test
    public void testMain() throws Exception 
    {
        System.out.println("main");
        String[] args = null;
        Start.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeliveryService method, of class Start.
     */
    @Test
    public void testGetDeliveryService() {
        System.out.println("getDeliveryService");
        Start expResult = null;
        Start result = Start.getDeliveryService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class Start.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        String[] args = null;
        Start instance = new Start();
        instance.init(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class Start.
     * @throws java.lang.Exception
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Start instance = new Start();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class Start.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        Start instance = new Start();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class Start.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        Start instance = new Start();
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContext method, of class Start.
     */
    @Test
    public void testGetContext() {
        System.out.println("getContext");
        Start instance = new Start();
        ConfigurableApplicationContext expResult = null;
        ConfigurableApplicationContext result = instance.getContext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParentContext method, of class Start.
     */
    @Test
    public void testGetParentContext() {
        System.out.println("getParentContext");
        Start instance = new Start();
        ConfigurableApplicationContext expResult = null;
        ConfigurableApplicationContext result = instance.getParentContext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
