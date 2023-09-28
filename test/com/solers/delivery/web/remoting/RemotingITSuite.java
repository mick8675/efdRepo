/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.web.remoting;

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
@Suite.SuiteClasses({com.solers.delivery.web.remoting.AdminHelperIT.class, com.solers.delivery.web.remoting.AlertHelperIT.class, com.solers.delivery.web.remoting.StaticHelperIT.class, com.solers.delivery.web.remoting.UserNodeIT.class, com.solers.delivery.web.remoting.ContentSetNodeIT.class, com.solers.delivery.web.remoting.SynchronizationHistoryHelperIT.class, com.solers.delivery.web.remoting.UserHelperIT.class, com.solers.delivery.web.remoting.TreeNodeIT.class, com.solers.delivery.web.remoting.SystemHelperIT.class, com.solers.delivery.web.remoting.ContentSetHelperIT.class})
public class RemotingITSuite {

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
