/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.remoting;

import com.solers.delivery.domain.User;
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
public class SystemHelperIT {
    
    public SystemHelperIT() {
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
     * Test of changePassword method, of class SystemHelper.
     */
    @Test
    public void testChangePassword() {
        System.out.println("changePassword");
        String oldpw = "";
        String newpw = "";
        String newpwconfirm = "";
        SystemHelper instance = null;
        instance.changePassword(oldpw, newpw, newpwconfirm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class SystemHelper.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        SystemHelper instance = null;
        User expResult = null;
        User result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class SystemHelper.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        SystemHelper instance = null;
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of heartbeat method, of class SystemHelper.
     */
    @Test
    public void testHeartbeat() {
        System.out.println("heartbeat");
        SystemHelper instance = null;
        instance.heartbeat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
