/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.content.consumer;

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
@Suite.SuiteClasses({com.solers.delivery.content.consumer.ConsumerContentSetManagerIT.class, com.solers.delivery.content.consumer.SynchronizationTaskIT.class, com.solers.delivery.content.consumer.ContentDiffereceTaskIT.class, com.solers.delivery.content.consumer.InventoryResultIT.class, com.solers.delivery.content.consumer.SynchronizationStateIT.class, com.solers.delivery.content.consumer.InventoryRetrieverIT.class, com.solers.delivery.content.consumer.difference.DifferenceITSuite.class})
public class ConsumerITSuite {

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
