/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.security.ssl;

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
@Suite.SuiteClasses({com.solers.security.ssl.ClientSocketFactoryIT.class, com.solers.security.ssl.CipherSuiteUtilIT.class, com.solers.security.ssl.TimeoutSocketFactoryIT.class, com.solers.security.ssl.WrapperSSLContextIT.class, com.solers.security.ssl.ServerSocketFactoryIT.class, com.solers.security.ssl.SSLContextCreatorIT.class})
public class SslITSuite {

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
