/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.content.status;

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
@Suite.SuiteClasses({com.solers.delivery.content.status.SupplierProgressIT.class, com.solers.delivery.content.status.CurrentSynchronizationIT.class, com.solers.delivery.content.status.ConsumerProgressIT.class, com.solers.delivery.content.status.ProgressIT.class, com.solers.delivery.content.status.DiskSpaceAlertTaskIT.class, com.solers.delivery.content.status.SynchronizationResultIT.class})
public class StatusITSuite {

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
