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
public class PasswordServiceIT {
    
    public PasswordServiceIT() {
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
     * Test of getPassword method, of class PasswordService.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String username = "";
        PasswordService instance = new PasswordServiceImpl();
        String expResult = "";
        String result = instance.getPassword(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPasswordExpired method, of class PasswordService.
     */
    @Test
    public void testIsPasswordExpired() {
        System.out.println("isPasswordExpired");
        String username = "";
        PasswordService instance = new PasswordServiceImpl();
        boolean expResult = false;
        boolean result = instance.isPasswordExpired(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePassword method, of class PasswordService.
     */
    @Test
    public void testChangePassword() {
        System.out.println("changePassword");
        String username = "";
        String oldpassword = "";
        String newPassword = "";
        PasswordService instance = new PasswordServiceImpl();
        instance.changePassword(username, oldpassword, newPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePassword method, of class PasswordService.
     */
    @Test
    public void testUpdatePassword() {
        System.out.println("updatePassword");
        String username = "";
        String newPassword = "";
        PasswordService instance = new PasswordServiceImpl();
        instance.updatePassword(username, newPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PasswordServiceImpl implements PasswordService {

        public String getPassword(String username) {
            return "";
        }

        public boolean isPasswordExpired(String username) {
            return false;
        }

        public void changePassword(String username, String oldpassword, String newPassword) {
        }

        public void updatePassword(String username, String newPassword) {
        }
    }

    public class PasswordServiceImpl implements PasswordService {

        public String getPassword(String username) {
            return "";
        }

        public boolean isPasswordExpired(String username) {
            return false;
        }

        public void changePassword(String username, String oldpassword, String newPassword) {
        }

        public void updatePassword(String username, String newPassword) {
        }
    }
    
}
