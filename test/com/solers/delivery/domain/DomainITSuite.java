/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.domain;

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
@Suite.SuiteClasses({com.solers.delivery.domain.ResourceParameterIT.class, com.solers.delivery.domain.FileFilterIT.class, com.solers.delivery.domain.PasswordIT.class, com.solers.delivery.domain.validations.ValidationsITSuite.class, com.solers.delivery.domain.PendingDeleteIT.class, com.solers.delivery.domain.AlertIT.class, com.solers.delivery.domain.ConsumerContentSetIT.class, com.solers.delivery.domain.FtpConnectionIT.class, com.solers.delivery.domain.ScheduleExpressionIT.class, com.solers.delivery.domain.AllowedHostIT.class, com.solers.delivery.domain.UserIT.class, com.solers.delivery.domain.ContentSetIT.class})
public class DomainITSuite {

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
