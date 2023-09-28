/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.content.supplier;

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
@Suite.SuiteClasses({com.solers.delivery.content.supplier.InventoryDifferencePrunerIT.class, com.solers.delivery.content.supplier.SupplierTaskIT.class, com.solers.delivery.content.supplier.UnregisteredContentSetExceptionIT.class, com.solers.delivery.content.supplier.InventoryCreationStateIT.class, com.solers.delivery.content.supplier.InventoryNotAvailableExceptionIT.class, com.solers.delivery.content.supplier.ContentSetMapperIT.class, com.solers.delivery.content.supplier.SupplierContentSetManagerIT.class, com.solers.delivery.content.supplier.DisabledContentSetExceptionIT.class, com.solers.delivery.content.supplier.InventoryCreationTaskIT.class, com.solers.delivery.content.supplier.InventoryNotChangedExceptionIT.class})
public class SupplierITSuite {

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
