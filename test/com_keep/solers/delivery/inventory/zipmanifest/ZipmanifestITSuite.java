/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.inventory.zipmanifest;

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
@Suite.SuiteClasses({com.solers.delivery.inventory.zipmanifest.ZipFileInventoryProviderIT.class, com.solers.delivery.inventory.zipmanifest.ZipFileInventoryIT.class, com.solers.delivery.inventory.zipmanifest.TempDirectoryReferenceIT.class, com.solers.delivery.inventory.zipmanifest.ZipFileCacheEntryIT.class, com.solers.delivery.inventory.zipmanifest.ResourceManagerIT.class, com.solers.delivery.inventory.zipmanifest.ZipVirtualNodeIT.class, com.solers.delivery.inventory.zipmanifest.ZipFileNodeIT.class})
public class ZipmanifestITSuite {

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
