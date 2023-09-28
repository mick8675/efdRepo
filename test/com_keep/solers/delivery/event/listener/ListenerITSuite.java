/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.event.listener;

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
@Suite.SuiteClasses({com.solers.delivery.event.listener.EventLoggerIT.class, com.solers.delivery.event.listener.LuceneSupplierEventListenerIT.class, com.solers.delivery.event.listener.FailedSynchronizationAlertPublisherIT.class, com.solers.delivery.event.listener.LuceneConsumerGbsListenerIT.class, com.solers.delivery.event.listener.ScriptingEventListenerIT.class, com.solers.delivery.event.listener.EventListenerIT.class, com.solers.delivery.event.listener.LuceneContentEventFlusherIT.class, com.solers.delivery.event.listener.LuceneConsumerEventListenerIT.class, com.solers.delivery.event.listener.FlushingListenerIT.class, com.solers.delivery.event.listener.BaseListenerIT.class})
public class ListenerITSuite {

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
