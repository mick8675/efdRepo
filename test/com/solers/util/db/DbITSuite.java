/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.util.db;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.solers.util.db.action.ActionITSuite.class, com.solers.util.db.DerbyBeanIT.class, com.solers.util.db.DatabaseIT.class, com.solers.util.db.DatabaseBeanIT.class, com.solers.util.db.SqlExecutorIT.class, com.solers.util.db.SqlChangeSetIT.class, com.solers.util.db.ScriptParserIT.class, com.solers.util.db.DerbySqlExecutorIT.class, com.solers.util.db.SqlChangeSetParserIT.class, com.solers.util.db.SqlChangeSetManagerIT.class})
public class DbITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
