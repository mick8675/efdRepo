/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.util;

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
@Suite.SuiteClasses({com.solers.util.PageIT.class, com.solers.util.PaginatedListIT.class, com.solers.util.FilterIT.class, com.solers.util.NamedThreadFactoryIT.class, com.solers.util.db.DbITSuite.class, com.solers.util.LoggingOutputStreamIT.class, com.solers.util.dao.DaoITSuite.class, com.solers.util.SoftCacheIT.class, com.solers.util.spring.SpringITSuite.class, com.solers.util.HashFunctionIT.class, com.solers.util.StopWatchIT.class, com.solers.util.CallbackIT.class, com.solers.util.StreamCopierIT.class, com.solers.util.IOConsoleIT.class, com.solers.util.BaseConsoleIT.class, com.solers.util.ConsoleIOConsoleIT.class, com.solers.util.SystemIOConsoleIT.class, com.solers.util.unit.UnitITSuite.class})
public class UtilITSuite {

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
