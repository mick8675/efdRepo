/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.transport.http.client;

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
@Suite.SuiteClasses({com.solers.delivery.transport.http.client.TransferIT.class, com.solers.delivery.transport.http.client.TransferContentIT.class, com.solers.delivery.transport.http.client.TransferInventoryIT.class, com.solers.delivery.transport.http.client.TransferServiceImplIT.class, com.solers.delivery.transport.http.client.TransferMangementIT.class, com.solers.delivery.transport.http.client.methods.MethodsITSuite.class, com.solers.delivery.transport.http.client.TransferContentGBSIT.class, com.solers.delivery.transport.http.client.connection.ConnectionITSuite.class, com.solers.delivery.transport.http.client.retry.RetryITSuite.class, com.solers.delivery.transport.http.client.TransferServiceIT.class, com.solers.delivery.transport.http.client.util.UtilITSuite.class})
public class ClientITSuite {

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
