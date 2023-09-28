/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.rest;

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
@Suite.SuiteClasses({com.solers.delivery.rest.RestfulServiceIT.class, com.solers.delivery.rest.admin.AdminITSuite.class, com.solers.delivery.rest.RestletJettyHandlerIT.class, com.solers.delivery.rest.BaseEnableResourceIT.class, com.solers.delivery.rest.inventory.InventoryITSuite.class, com.solers.delivery.rest.ServerAgentFilterIT.class, com.solers.delivery.rest.converter.ConverterITSuite.class, com.solers.delivery.rest.reports.ReportsITSuite.class, com.solers.delivery.rest.connectors.ConnectorsITSuite.class, com.solers.delivery.rest.op.OpITSuite.class, com.solers.delivery.rest.IpFilterIT.class, com.solers.delivery.rest.auth.AuthITSuite.class, com.solers.delivery.rest.content.ContentITSuite.class, com.solers.delivery.rest.UtilsIT.class, com.solers.delivery.rest.AcegiGuardIT.class})
public class RestITSuite {

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
