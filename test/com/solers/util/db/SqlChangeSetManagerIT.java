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
public class SqlChangeSetManagerIT {
    
    public SqlChangeSetManagerIT() {
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
     * Test of getCurrentVersion method, of class SqlChangeSetManager.
     */
    @Test
    public void testGetCurrentVersion() {
        System.out.println("getCurrentVersion");
        SqlChangeSetManager instance = null;
        String expResult = "";
        String result = instance.getCurrentVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChangeSets method, of class SqlChangeSetManager.
     */
    @Test
    public void testGetChangeSets() {
        System.out.println("getChangeSets");
        SqlChangeSetManager instance = null;
        List<SqlChangeSet> expResult = null;
        List<SqlChangeSet> result = instance.getChangeSets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
