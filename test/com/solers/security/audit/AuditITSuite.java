/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.security.audit;

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
@Suite.SuiteClasses({com.solers.security.audit.AutoAuditEventListenerIT.class, com.solers.security.audit.AuditableIT.class, com.solers.security.audit.AuthenticationListenerIT.class, com.solers.security.audit.AuditSuccessEventIT.class, com.solers.security.audit.AuditFailureEventIT.class, com.solers.security.audit.AuditEventListenerIT.class, com.solers.security.audit.AuditLoggerIT.class, com.solers.security.audit.AuditAspectIT.class})
public class AuditITSuite {

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
