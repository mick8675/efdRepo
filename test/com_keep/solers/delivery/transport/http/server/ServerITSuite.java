/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.transport.http.server;

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
@Suite.SuiteClasses({com.solers.delivery.transport.http.server.FileHandlerIT.class, com.solers.delivery.transport.http.server.SynchronizationEventHandlerIT.class, com.solers.delivery.transport.http.server.LegacyHandlerIT.class, com.solers.delivery.transport.http.server.GbsHandlerIT.class, com.solers.delivery.transport.http.server.BaseHandlerIT.class, com.solers.delivery.transport.http.server.ValidationHandlerIT.class})
public class ServerITSuite {

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
