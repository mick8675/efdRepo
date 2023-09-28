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
import org.springframework.context.ApplicationEvent;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class AuthenticationListenerIT {
    
    public AuthenticationListenerIT() {
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
     * Test of setAuditLogger method, of class AuthenticationListener.
     */
    @Test
    public void testSetAuditLogger() {
        System.out.println("setAuditLogger");
        AuditLogger audit = null;
        AuthenticationListener instance = new AuthenticationListener();
        instance.setAuditLogger(audit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onApplicationEvent method, of class AuthenticationListener.
     */
    @Test
    public void testOnApplicationEvent() {
        System.out.println("onApplicationEvent");
        ApplicationEvent event = null;
        AuthenticationListener instance = new AuthenticationListener();
        instance.onApplicationEvent(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
