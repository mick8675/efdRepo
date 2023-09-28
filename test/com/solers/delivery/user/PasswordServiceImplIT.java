/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.user;

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
public class PasswordServiceImplIT {
    
    public PasswordServiceImplIT() {
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
     * Test of setPasswordExpirationDays method, of class PasswordServiceImpl.
     */
    @Test
    public void testSetPasswordExpirationDays() {
        System.out.println("setPasswordExpirationDays");
        int passwordExpirationDays = 0;
        PasswordServiceImpl instance = null;
        instance.setPasswordExpirationDays(passwordExpirationDays);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPasswordLengthAdmin method, of class PasswordServiceImpl.
     */
    @Test
    public void testSetPasswordLengthAdmin() {
        System.out.println("setPasswordLengthAdmin");
        int passwordLengthAdmin = 0;
        PasswordServiceImpl instance = null;
        instance.setPasswordLengthAdmin(passwordLengthAdmin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPasswordLengthUser method, of class PasswordServiceImpl.
     */
    @Test
    public void testSetPasswordLengthUser() {
        System.out.println("setPasswordLengthUser");
        int passwordLengthUser = 0;
        PasswordServiceImpl instance = null;
        instance.setPasswordLengthUser(passwordLengthUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPasswordReuseCount method, of class PasswordServiceImpl.
     */
    @Test
    public void testSetPasswordReuseCount() {
        System.out.println("setPasswordReuseCount");
        int passwordReuseCount = 0;
        PasswordServiceImpl instance = null;
        instance.setPasswordReuseCount(passwordReuseCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaxUserChanges method, of class PasswordServiceImpl.
     */
    @Test
    public void testSetMaxUserChanges() {
        System.out.println("setMaxUserChanges");
        int maxUserChanges = 0;
        PasswordServiceImpl instance = null;
        instance.setMaxUserChanges(maxUserChanges);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserChangesInterval method, of class PasswordServiceImpl.
     */
    @Test
    public void testSetUserChangesInterval() {
        System.out.println("setUserChangesInterval");
        int userChangesInterval = 0;
        PasswordServiceImpl instance = null;
        instance.setUserChangesInterval(userChangesInterval);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class PasswordServiceImpl.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String username = "";
        PasswordServiceImpl instance = null;
        String expResult = "";
        String result = instance.getPassword(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPasswordExpired method, of class PasswordServiceImpl.
     */
    @Test
    public void testIsPasswordExpired() {
        System.out.println("isPasswordExpired");
        String username = "";
        PasswordServiceImpl instance = null;
        boolean expResult = false;
        boolean result = instance.isPasswordExpired(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePassword method, of class PasswordServiceImpl.
     */
    @Test
    public void testChangePassword() {
        System.out.println("changePassword");
        String username = "";
        String oldpassword = "";
        String newPassword = "";
        PasswordServiceImpl instance = null;
        instance.changePassword(username, oldpassword, newPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePassword method, of class PasswordServiceImpl.
     */
    @Test
    public void testUpdatePassword() {
        System.out.println("updatePassword");
        String username = "";
        String newPassword = "";
        PasswordServiceImpl instance = null;
        instance.updatePassword(username, newPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
