/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.transport.http.client.methods;

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
@Suite.SuiteClasses({com.solers.delivery.transport.http.client.methods.GZIPAwareGetMethodIT.class, com.solers.delivery.transport.http.client.methods.ContentGetMethodIT.class, com.solers.delivery.transport.http.client.methods.GbsGetMethodIT.class, com.solers.delivery.transport.http.client.methods.HandshakeMethodIT.class, com.solers.delivery.transport.http.client.methods.ManagementMethodIT.class})
public class MethodsITSuite {

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
