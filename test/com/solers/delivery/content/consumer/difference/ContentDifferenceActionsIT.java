/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.consumer.difference;

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
public class ContentDifferenceActionsIT {
    
    public ContentDifferenceActionsIT() {
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
     * Test of values method, of class ContentDifferenceActions.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        ContentDifferenceActions[] expResult = null;
        ContentDifferenceActions[] result = ContentDifferenceActions.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class ContentDifferenceActions.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        ContentDifferenceActions expResult = null;
        ContentDifferenceActions result = ContentDifferenceActions.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of action method, of class ContentDifferenceActions.
     */
    @Test
    public void testAction() {
        System.out.println("action");
        ContentDifferenceActions instance = null;
        String expResult = "";
        String result = instance.action();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
