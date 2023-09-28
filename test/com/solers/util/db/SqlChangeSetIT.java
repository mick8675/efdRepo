/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.db;

import java.util.List;
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
public class SqlChangeSetIT {
    
    public SqlChangeSetIT() {
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
     * Test of getVersion method, of class SqlChangeSet.
     */
    @Test
    public void testGetVersion() {
        System.out.println("getVersion");
        SqlChangeSet instance = null;
        String expResult = "";
        String result = instance.getVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatements method, of class SqlChangeSet.
     */
    @Test
    public void testGetStatements() {
        System.out.println("getStatements");
        SqlChangeSet instance = null;
        List<String> expResult = null;
        List<String> result = instance.getStatements();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class SqlChangeSet.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        SqlChangeSet o = null;
        SqlChangeSet instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class SqlChangeSet.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        SqlChangeSet instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class SqlChangeSet.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        SqlChangeSet instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newerThan method, of class SqlChangeSet.
     */
    @Test
    public void testNewerThan() {
        System.out.println("newerThan");
        String version = "";
        SqlChangeSet instance = null;
        boolean expResult = false;
        boolean result = instance.newerThan(version);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
