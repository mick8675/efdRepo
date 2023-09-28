/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.transport.http;

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
@Suite.SuiteClasses({com.solers.delivery.transport.http.HTTPContextPathsIT.class, com.solers.delivery.transport.http.HTTPHeadersIT.class, com.solers.delivery.transport.http.server.ServerITSuite.class, com.solers.delivery.transport.http.TransferTypeIT.class, com.solers.delivery.transport.http.TransferStatusIT.class, com.solers.delivery.transport.http.HTTPParametersIT.class, com.solers.delivery.transport.http.monitor.MonitorITSuite.class, com.solers.delivery.transport.http.client.ClientITSuite.class, com.solers.delivery.transport.http.DefaultTransferStatusIT.class, com.solers.delivery.transport.http.HTTPRangeHeaderIT.class, com.solers.delivery.transport.http.HTTPStatusCodesIT.class})
public class HttpITSuite {

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
