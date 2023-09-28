/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.admin;

import com.solers.delivery.domain.User;
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
public class EnableUserResourceIT {
    
    public EnableUserResourceIT() {
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
     * Test of disable method, of class EnableUserResource.
     */
    @Test
    public void testDisable() {
        System.out.println("disable");
        User item = null;
        EnableUserResource instance = null;
        instance.disable(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enable method, of class EnableUserResource.
     */
    @Test
    public void testEnable() {
        System.out.println("enable");
        User item = null;
        EnableUserResource instance = null;
        instance.enable(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lookup method, of class EnableUserResource.
     */
    @Test
    public void testLookup() {
        System.out.println("lookup");
        long id = 0L;
        EnableUserResource instance = null;
        User expResult = null;
        User result = instance.lookup(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
