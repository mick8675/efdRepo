/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.web;

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
@Suite.SuiteClasses({com.solers.delivery.web.UserAuthenticationListenerIT.class, com.solers.delivery.web.XSLTFilterIT.class, com.solers.delivery.web.remoting.RemotingITSuite.class, com.solers.delivery.web.combine.CombineITSuite.class, com.solers.delivery.web.export.ExportITSuite.class, com.solers.delivery.web.SessionTimeOutProcessingIT.class, com.solers.delivery.web.EnumConverterIT.class, com.solers.delivery.web.util.UtilITSuite.class})
public class WebITSuite {

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
