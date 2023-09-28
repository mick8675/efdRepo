/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.db.action;

import com.solers.util.db.Database;
import java.io.File;
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
public class SqlChangesetActionIT {
    
    public SqlChangesetActionIT() {
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
     * Test of setDatabaseDirectory method, of class SqlChangesetAction.
     */
    @Test
    public void testSetDatabaseDirectory() {
        System.out.println("setDatabaseDirectory");
        File databaseDirectory = null;
        SqlChangesetAction instance = new SqlChangesetAction();
        instance.setDatabaseDirectory(databaseDirectory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSqlConfig method, of class SqlChangesetAction.
     */
    @Test
    public void testSetSqlConfig() {
        System.out.println("setSqlConfig");
        File sqlConfig = null;
        SqlChangesetAction instance = new SqlChangesetAction();
        instance.setSqlConfig(sqlConfig);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class SqlChangesetAction.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        Database db = null;
        SqlChangesetAction instance = new SqlChangesetAction();
        instance.execute(db);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
