/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class SqlExecutorIT {
    
    public SqlExecutorIT() {
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
     * Test of loop method, of class SqlExecutor.
     */
    @Test
    public void testLoop() {
        System.out.println("loop");
        SqlExecutor instance = new SqlExecutorImpl();
        instance.loop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class SqlExecutor.
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        String sql = "";
        SqlExecutor instance = new SqlExecutorImpl();
        instance.execute(sql);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class SqlExecutor.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        SqlExecutor instance = new SqlExecutorImpl();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class SqlExecutor.
     */
    @Test
    public void testClose_0args() throws Exception {
        System.out.println("close");
        SqlExecutor instance = new SqlExecutorImpl();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doExecute method, of class SqlExecutor.
     */
    @Test
    public void testDoExecute() throws Exception {
        System.out.println("doExecute");
        String sql = "";
        SqlExecutor instance = new SqlExecutorImpl();
        instance.doExecute(sql);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doHelp method, of class SqlExecutor.
     */
    @Test
    public void testDoHelp() {
        System.out.println("doHelp");
        SqlExecutor instance = new SqlExecutorImpl();
        instance.doHelp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalize method, of class SqlExecutor.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        SqlExecutor instance = new SqlExecutorImpl();
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class SqlExecutor.
     */
    @Test
    public void testClose_Statement() {
        System.out.println("close");
        Statement stmt = null;
        SqlExecutor instance = new SqlExecutorImpl();
        instance.close(stmt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class SqlExecutor.
     */
    @Test
    public void testClose_ResultSet() {
        System.out.println("close");
        ResultSet rs = null;
        SqlExecutor instance = new SqlExecutorImpl();
        instance.close(rs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createConnection method, of class SqlExecutor.
     */
    @Test
    public void testCreateConnection() throws Exception {
        System.out.println("createConnection");
        SqlExecutor instance = new SqlExecutorImpl();
        Connection expResult = null;
        Connection result = instance.createConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SqlExecutorImpl extends SqlExecutor {

        public Connection createConnection() throws SQLException {
            return null;
        }
    }
    
}
