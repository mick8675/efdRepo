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

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class AuditEventListenerIT {
    
    public AuditEventListenerIT() {
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
     * Test of onSuccess method, of class AuditEventListener.
     */
    @Test
    public void testOnSuccess() {
        System.out.println("onSuccess");
        AuditSuccessEvent event = null;
        AuditEventListener instance = new AuditEventListenerImpl();
        instance.onSuccess(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onFailure method, of class AuditEventListener.
     */
    @Test
    public void testOnFailure() {
        System.out.println("onFailure");
        AuditFailureEvent event = null;
        AuditEventListener instance = new AuditEventListenerImpl();
        instance.onFailure(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AuditEventListenerImpl implements AuditEventListener {

        public void onSuccess(AuditSuccessEvent event) {
        }

        public void onFailure(AuditFailureEvent event) {
        }
    }
    
}
