/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.op;

import com.solers.delivery.domain.ContentSet;
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
public class EnableResourceIT {
    
    public EnableResourceIT() {
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
     * Test of disable method, of class EnableResource.
     */
    @Test
    public void testDisable() {
        System.out.println("disable");
        ContentSet item = null;
        EnableResource instance = null;
        instance.disable(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enable method, of class EnableResource.
     */
    @Test
    public void testEnable() {
        System.out.println("enable");
        ContentSet item = null;
        EnableResource instance = null;
        instance.enable(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lookup method, of class EnableResource.
     */
    @Test
    public void testLookup() {
        System.out.println("lookup");
        long id = 0L;
        EnableResource instance = null;
        ContentSet expResult = null;
        ContentSet result = instance.lookup(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
