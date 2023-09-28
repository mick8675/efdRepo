/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.transport.gbs;

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
@Suite.SuiteClasses({com.solers.delivery.transport.gbs.GbsFileIT.class, com.solers.delivery.transport.gbs.GbsTransferStatusIT.class, com.solers.delivery.transport.gbs.poll.PollITSuite.class, com.solers.delivery.transport.gbs.GbsExceptionIT.class, com.solers.delivery.transport.gbs.TransportTypeIT.class, com.solers.delivery.transport.gbs.ArchiveIT.class, com.solers.delivery.transport.gbs.GBSConfiguratorIT.class, com.solers.delivery.transport.gbs.TransportIT.class, com.solers.delivery.transport.gbs.TarArchiveIT.class, com.solers.delivery.transport.gbs.ftp.FtpITSuite.class, com.solers.delivery.transport.gbs.push.PushITSuite.class, com.solers.delivery.transport.gbs.AbstractGBSServiceIT.class, com.solers.delivery.transport.gbs.GBSServiceIT.class, com.solers.delivery.transport.gbs.TransportExceptionIT.class})
public class GbsITSuite {

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
