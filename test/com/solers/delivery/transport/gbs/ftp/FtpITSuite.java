/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.transport.gbs.ftp;

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
@Suite.SuiteClasses({com.solers.delivery.transport.gbs.ftp.FTPUserManagerIT.class, com.solers.delivery.transport.gbs.ftp.FTPServerWrapperIT.class, com.solers.delivery.transport.gbs.ftp.FTPTransportIT.class, com.solers.delivery.transport.gbs.ftp.FTPSSLConfigurationIT.class, com.solers.delivery.transport.gbs.ftp.FTPSExampleIT.class})
public class FtpITSuite {

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
