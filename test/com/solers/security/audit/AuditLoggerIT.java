/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security.audit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.core.Authentication;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class AuditLoggerIT {
    
    public AuditLoggerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of onFailure method, of class AuditLogger.
     */
    @Test
    public void testOnFailure() {
        System.out.println("onFailure");
        AuditFailureEvent event = null;
        AuditLogger instance = new AuditLogger();
        instance.onFailure(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onSuccess method, of class AuditLogger.
     */
    @Test
    public void testOnSuccess() {
        System.out.println("onSuccess");
        AuditSuccessEvent event = null;
        AuditLogger instance = new AuditLogger();
        instance.onSuccess(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of log method, of class AuditLogger.
     */
    @Test
    public void testLog_String_AuditableSeverity() {
        System.out.println("log");
        String message = "";
        Auditable.Severity severity = null;
        AuditLogger instance = new AuditLogger();
        instance.log(message, severity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of log method, of class AuditLogger.
     */
    @Test
    public void testLog_3args() {
        System.out.println("log");
        String message = "";
        Auditable.Severity severity = null;
        Authentication auth = null;
        AuditLogger instance = new AuditLogger();
        instance.log(message, severity, auth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
