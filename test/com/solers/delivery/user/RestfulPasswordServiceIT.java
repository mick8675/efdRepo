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
public class RestfulPasswordServiceIT {
    
    public RestfulPasswordServiceIT() {
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
     * Test of getPassword method, of class RestfulPasswordService.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String username = "";
        RestfulPasswordService instance = null;
        String expResult = "";
        String result = instance.getPassword(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePassword method, of class RestfulPasswordService.
     */
    @Test
    public void testChangePassword() {
        System.out.println("changePassword");
        String username = "";
        String oldpassword = "";
        String newPassword = "";
        RestfulPasswordService instance = null;
        instance.changePassword(username, oldpassword, newPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPasswordExpired method, of class RestfulPasswordService.
     */
    @Test
    public void testIsPasswordExpired() {
        System.out.println("isPasswordExpired");
        String username = "";
        RestfulPasswordService instance = null;
        boolean expResult = false;
        boolean result = instance.isPasswordExpired(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePassword method, of class RestfulPasswordService.
     */
    @Test
    public void testUpdatePassword() {
        System.out.println("updatePassword");
        String username = "";
        String newPassword = "";
        RestfulPasswordService instance = null;
        instance.updatePassword(username, newPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
