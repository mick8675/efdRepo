/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.inventory.index.diff;

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
@Suite.SuiteClasses({com.solers.delivery.inventory.index.diff.DifferenceFileReaderIT.class, com.solers.delivery.inventory.index.diff.MergedNodeIT.class, com.solers.delivery.inventory.index.diff.DiffChildNodeIT.class, com.solers.delivery.inventory.index.diff.DifferenceFileEventHandlerIT.class, com.solers.delivery.inventory.index.diff.DifferenceNodeIT.class, com.solers.delivery.inventory.index.diff.EntryStructIT.class, com.solers.delivery.inventory.index.diff.DiffParentNodeIT.class, com.solers.delivery.inventory.index.diff.DiffRootNodeIT.class, com.solers.delivery.inventory.index.diff.HeaderStructIT.class})
public class DiffITSuite {

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
