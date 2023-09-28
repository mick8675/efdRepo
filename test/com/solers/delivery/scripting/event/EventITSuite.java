/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.scripting.event;

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
@Suite.SuiteClasses({com.solers.delivery.scripting.event.DeliveryEventConsumerIT.class, com.solers.delivery.scripting.event.ConsumerIT.class, com.solers.delivery.scripting.event.EventQueueImplIT.class, com.solers.delivery.scripting.event.EventTypeIT.class, com.solers.delivery.scripting.event.QueuedEventIT.class, com.solers.delivery.scripting.event.MapEventConsumersImplIT.class, com.solers.delivery.scripting.event.EventQueueIT.class, com.solers.delivery.scripting.event.EventConsumersIT.class})
public class EventITSuite {

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
