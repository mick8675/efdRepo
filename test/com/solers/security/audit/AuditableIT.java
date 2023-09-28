/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security.audit;

import java.lang.annotation.Annotation;
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
public class AuditableIT {
    
    public AuditableIT() {
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
     * Test of action method, of class Auditable.
     */
    @Test
    public void testAction() {
        System.out.println("action");
        Auditable instance = new AuditableImpl();
        Auditable.Action expResult = null;
        Auditable.Action result = instance.action();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of severity method, of class Auditable.
     */
    @Test
    public void testSeverity() {
        System.out.println("severity");
        Auditable instance = new AuditableImpl();
        Auditable.Severity expResult = null;
        Auditable.Severity result = instance.severity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AuditableImpl implements Auditable {

        public Action action() {
            return null;
        }

        public Severity severity() {
            return null;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
