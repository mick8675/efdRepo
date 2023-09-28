/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.remoting;

import java.util.Date;
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
public class UserNodeIT {
    
    public UserNodeIT() {
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
     * Test of isEnabled method, of class UserNode.
     */
    @Test
    public void testIsEnabled() {
        System.out.println("isEnabled");
        UserNode instance = null;
        boolean expResult = false;
        boolean result = instance.isEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastLogin method, of class UserNode.
     */
    @Test
    public void testGetLastLogin() {
        System.out.println("getLastLogin");
        UserNode instance = null;
        Date expResult = null;
        Date result = instance.getLastLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastLogin method, of class UserNode.
     */
    @Test
    public void testSetLastLogin() {
        System.out.println("setLastLogin");
        Date lastLogin = null;
        UserNode instance = null;
        instance.setLastLogin(lastLogin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFailedLogins method, of class UserNode.
     */
    @Test
    public void testGetFailedLogins() {
        System.out.println("getFailedLogins");
        UserNode instance = null;
        long expResult = 0L;
        long result = instance.getFailedLogins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFailedLogins method, of class UserNode.
     */
    @Test
    public void testSetFailedLogins() {
        System.out.println("setFailedLogins");
        long failedLogins = 0L;
        UserNode instance = null;
        instance.setFailedLogins(failedLogins);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnabled method, of class UserNode.
     */
    @Test
    public void testSetEnabled() {
        System.out.println("setEnabled");
        boolean enabled = false;
        UserNode instance = null;
        instance.setEnabled(enabled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class UserNode.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UserNode instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class UserNode.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        UserNode instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
