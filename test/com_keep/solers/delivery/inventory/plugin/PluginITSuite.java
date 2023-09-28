/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.inventory.plugin;

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
@Suite.SuiteClasses({com.solers.delivery.inventory.plugin.provider.ProviderITSuite.class, com.solers.delivery.inventory.plugin.InventoryPluginIT.class, com.solers.delivery.inventory.plugin.PluginLoaderIT.class, com.solers.delivery.inventory.plugin.PluginExecutionExceptionIT.class, com.solers.delivery.inventory.plugin.PluginProviderNotFoundExceptionIT.class, com.solers.delivery.inventory.plugin.PluginLoadExceptionIT.class, com.solers.delivery.inventory.plugin.PluginExceptionIT.class})
public class PluginITSuite {

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
