/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.content;

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
@Suite.SuiteClasses({com.solers.delivery.content.ContentSetManagerIT.class, com.solers.delivery.content.status.StatusITSuite.class, com.solers.delivery.content.RestfulAllowedHostServiceIT.class, com.solers.delivery.content.AllowedHostServiceIT.class, com.solers.delivery.content.supplier.SupplierITSuite.class, com.solers.delivery.content.RestfulContentServiceIT.class, com.solers.delivery.content.scheduler.SchedulerITSuite.class, com.solers.delivery.content.ConsumerContentFilterIT.class, com.solers.delivery.content.consumer.ConsumerITSuite.class, com.solers.delivery.content.ContentServiceImplIT.class, com.solers.delivery.content.ContentServiceIT.class, com.solers.delivery.content.AllowedHostServiceImplIT.class})
public class ContentITSuite {

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
