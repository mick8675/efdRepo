/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.inventory.index;

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
@Suite.SuiteClasses({com.solers.delivery.inventory.index.HeaderStructIT.class, com.solers.delivery.inventory.index.WriterFactoryIT.class, com.solers.delivery.inventory.index.ReaderFactoryIT.class, com.solers.delivery.inventory.index.diff.DiffITSuite.class, com.solers.delivery.inventory.index.PackableIT.class, com.solers.delivery.inventory.index.v2.V2ITSuite.class, com.solers.delivery.inventory.index.v1.V1ITSuite.class, com.solers.delivery.inventory.index.HashUtilIT.class})
public class IndexITSuite {

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
