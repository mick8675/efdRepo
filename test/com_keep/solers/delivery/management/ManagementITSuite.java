/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.management;

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
@Suite.SuiteClasses({com.solers.delivery.management.ConsumerStatusIT.class, com.solers.delivery.management.ServiceUnavailableExceptionIT.class, com.solers.delivery.management.StatusServiceIT.class, com.solers.delivery.management.RestfulStatusServiceIT.class, com.solers.delivery.management.GbsPollerStatusIT.class, com.solers.delivery.management.startup.StartupITSuite.class, com.solers.delivery.management.XmlProxyIT.class, com.solers.delivery.management.StatusServiceImplIT.class, com.solers.delivery.management.SupplierStatusIT.class, com.solers.delivery.management.TransferServiceStatusIT.class})
public class ManagementITSuite {

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
