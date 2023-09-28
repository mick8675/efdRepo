/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery;

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
@Suite.SuiteClasses({com.solers.delivery.scripting.ScriptingITSuite.class, com.solers.delivery.daos.DaosITSuite.class, com.solers.delivery.tools.ToolsITSuite.class, com.solers.delivery.user.UserITSuite.class, com.solers.delivery.inventory.InventoryITSuite.class, com.solers.delivery.transport.TransportITSuite.class, com.solers.delivery.domain.DomainITSuite.class, com.solers.delivery.management.ManagementITSuite.class, com.solers.delivery.alerts.AlertsITSuite.class, com.solers.delivery.StartIT.class, com.solers.delivery.install.InstallITSuite.class, com.solers.delivery.util.UtilITSuite.class, com.solers.delivery.reports.ReportsITSuite.class, com.solers.delivery.rest.RestITSuite.class, com.solers.delivery.content.ContentITSuite.class, com.solers.delivery.event.EventITSuite.class, com.solers.delivery.security.SecurityITSuite.class, com.solers.delivery.StartWebIT.class, com.solers.delivery.gbs.GbsITSuite.class, com.solers.delivery.lucene.LuceneITSuite.class, com.solers.delivery.web.WebITSuite.class})
public class DeliveryITSuite {

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
