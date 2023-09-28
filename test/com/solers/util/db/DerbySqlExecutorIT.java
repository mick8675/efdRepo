/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.db;

import java.sql.Connection;
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
public class DerbySqlExecutorIT {
    
    public DerbySqlExecutorIT() {
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
     * Test of doExecute method, of class DerbySqlExecutor.
     */
    @Test
    public void testDoExecute() throws Exception {
        System.out.println("doExecute");
        String sql = "";
        DerbySqlExecutor instance = null;
        instance.doExecute(sql);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doHelp method, of class DerbySqlExecutor.
     */
    @Test
    public void testDoHelp() {
        System.out.println("doHelp");
        DerbySqlExecutor instance = null;
        instance.doHelp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createConnection method, of class DerbySqlExecutor.
     */
    @Test
    public void testCreateConnection() throws Exception {
        System.out.println("createConnection");
        DerbySqlExecutor instance = null;
        Connection expResult = null;
        Connection result = instance.createConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
