/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.tools;

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
@Suite.SuiteClasses({com.solers.delivery.tools.UnlockAdminAccountIT.class, com.solers.delivery.tools.UsageExceptionIT.class, com.solers.delivery.tools.inventory.InventoryITSuite.class, com.solers.delivery.tools.LuceneExporterIT.class, com.solers.delivery.tools.ClToolsIT.class, com.solers.delivery.tools.database.DatabaseITSuite.class, com.solers.delivery.tools.security.SecurityITSuite.class})
public class ToolsITSuite {

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
