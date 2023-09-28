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
public class AuditAspectIT {
    
    public AuditAspectIT() {
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
     * Test of advice method, of class AuditAspect.
     */
    @Test
    public void testAdvice() {
        System.out.println("advice");
        AutoAuditEventListener a = null;
        Object o = null;
        AuditAspect instance = new AuditAspect();
        instance.advice(a, o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addListener method, of class AuditAspect.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        AuditEventListener listener = null;
        AuditAspect instance = new AuditAspect();
        instance.addListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of audit method, of class AuditAspect.
     */
    @Test
    public void testAudit() {
        System.out.println("audit");
        Auditable a = null;
        Object o = null;
        AuditAspect instance = new AuditAspect();
        instance.audit(a, o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of auditSuccess method, of class AuditAspect.
     */
    @Test
    public void testAuditSuccess() {
        System.out.println("auditSuccess");
        Object obj = null;
        Auditable a = null;
        AuditAspect instance = new AuditAspect();
        instance.auditSuccess(obj, a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of auditFailure method, of class AuditAspect.
     */
    @Test
    public void testAuditFailure() {
        System.out.println("auditFailure");
        Object obj = null;
        Auditable a = null;
        Exception e = null;
        AuditAspect instance = new AuditAspect();
        instance.auditFailure(obj, a, e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
