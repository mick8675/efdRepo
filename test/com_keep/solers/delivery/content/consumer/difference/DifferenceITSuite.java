/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.content.consumer.difference;

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
@Suite.SuiteClasses({com.solers.delivery.content.consumer.difference.ContentDifferenceIT.class, com.solers.delivery.content.consumer.difference.DifferenceCounterIT.class, com.solers.delivery.content.consumer.difference.RequesterIT.class, com.solers.delivery.content.consumer.difference.ContentDifferenceActionsIT.class, com.solers.delivery.content.consumer.difference.DifferenceGeneratorIT.class, com.solers.delivery.content.consumer.difference.RemoverIT.class, com.solers.delivery.content.consumer.difference.ContentDifferenceHandlerIT.class, com.solers.delivery.content.consumer.difference.DifferenceQueuerIT.class})
public class DifferenceITSuite {

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
