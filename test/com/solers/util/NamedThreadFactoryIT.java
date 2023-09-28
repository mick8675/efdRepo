/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util;

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
public class NamedThreadFactoryIT {
    
    public NamedThreadFactoryIT() {
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
     * Test of newThread method, of class NamedThreadFactory.
     */
    @Test
    public void testNewThread() {
        System.out.println("newThread");
        Runnable r = null;
        NamedThreadFactory instance = new NamedThreadFactory();
        Thread expResult = null;
        Thread result = instance.newThread(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThreadName method, of class NamedThreadFactory.
     */
    @Test
    public void testGetThreadName() {
        System.out.println("getThreadName");
        NamedThreadFactory instance = new NamedThreadFactory();
        String expResult = "";
        String result = instance.getThreadName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
