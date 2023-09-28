/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain;

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
public class AllowedHostIT {
    
    public AllowedHostIT() {
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
     * Test of getId method, of class AllowedHost.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        AllowedHost instance = new AllowedHost();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class AllowedHost.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        AllowedHost instance = new AllowedHost();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlias method, of class AllowedHost.
     */
    @Test
    public void testGetAlias() {
        System.out.println("getAlias");
        AllowedHost instance = new AllowedHost();
        String expResult = "";
        String result = instance.getAlias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlias method, of class AllowedHost.
     */
    @Test
    public void testSetAlias() {
        System.out.println("setAlias");
        String alias = "";
        AllowedHost instance = new AllowedHost();
        instance.setAlias(alias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCommonName method, of class AllowedHost.
     */
    @Test
    public void testGetCommonName() {
        System.out.println("getCommonName");
        AllowedHost instance = new AllowedHost();
        String expResult = "";
        String result = instance.getCommonName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCommonName method, of class AllowedHost.
     */
    @Test
    public void testSetCommonName() {
        System.out.println("setCommonName");
        String commonName = "";
        AllowedHost instance = new AllowedHost();
        instance.setCommonName(commonName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class AllowedHost.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        AllowedHost instance = new AllowedHost();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class AllowedHost.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        AllowedHost instance = new AllowedHost();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AllowedHost.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AllowedHost instance = new AllowedHost();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
