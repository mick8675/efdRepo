/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.inventory;

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
@Suite.SuiteClasses({com.solers.delivery.inventory.DifferenceInventoryIT.class, com.solers.delivery.inventory.HashPropertiesIT.class, com.solers.delivery.inventory.plugin.PluginITSuite.class, com.solers.delivery.inventory.cifs.CifsITSuite.class, com.solers.delivery.inventory.zipmanifest.ZipmanifestITSuite.class, com.solers.delivery.inventory.zip.ZipITSuite.class, com.solers.delivery.inventory.TimePropertiesIT.class, com.solers.delivery.inventory.comparer.ComparerITSuite.class, com.solers.delivery.inventory.index.IndexITSuite.class, com.solers.delivery.inventory.InventoryPathCreatorIT.class, com.solers.delivery.inventory.fs.FsITSuite.class, com.solers.delivery.inventory.InventoryFactoryIT.class, com.solers.delivery.inventory.InventoryIT.class, com.solers.delivery.inventory.InventoryBundlerIT.class, com.solers.delivery.inventory.node.NodeITSuite.class, com.solers.delivery.inventory.WriterIT.class})
public class InventoryITSuite {

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
