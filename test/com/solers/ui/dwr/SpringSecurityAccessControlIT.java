/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.ui.dwr;

import java.lang.reflect.Method;
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
public class SpringSecurityAccessControlIT {
    
    public SpringSecurityAccessControlIT() {
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
     * Test of addRoleRestriction method, of class SpringSecurityAccessControl.
     */
    @Test
    public void testAddRoleRestriction() {
        System.out.println("addRoleRestriction");
        String scriptName = "";
        String methodName = "";
        String role = "";
        SpringSecurityAccessControl instance = new SpringSecurityAccessControl();
        instance.addRoleRestriction(scriptName, methodName, role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assertIsRestrictedByRole method, of class SpringSecurityAccessControl.
     */
    @Test
    public void testAssertIsRestrictedByRole() {
        System.out.println("assertIsRestrictedByRole");
        String scriptName = "";
        Method method = null;
        SpringSecurityAccessControl instance = new SpringSecurityAccessControl();
        instance.assertIsRestrictedByRole(scriptName, method);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
