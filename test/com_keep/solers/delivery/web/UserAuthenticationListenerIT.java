/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web;

import com.solers.delivery.alerts.AlertManager;
import com.solers.delivery.user.UserService;
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
public class UserAuthenticationListenerIT {
    
    public UserAuthenticationListenerIT() {
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
     * Test of setMaxFailedPasswords method, of class UserAuthenticationListener.
     */
    @Test
    public void testSetMaxFailedPasswords() {
        System.out.println("setMaxFailedPasswords");
        int maxFailedPasswords = 0;
        UserAuthenticationListener instance = new UserAuthenticationListener();
        instance.setMaxFailedPasswords(maxFailedPasswords);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserService method, of class UserAuthenticationListener.
     */
    @Test
    public void testSetUserService() {
        System.out.println("setUserService");
        UserService userService = null;
        UserAuthenticationListener instance = new UserAuthenticationListener();
        instance.setUserService(userService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlertManager method, of class UserAuthenticationListener.
     */
    @Test
    public void testSetAlertManager() {
        System.out.println("setAlertManager");
        AlertManager alertManager = null;
        UserAuthenticationListener instance = new UserAuthenticationListener();
        instance.setAlertManager(alertManager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onApplicationEvent method, of class UserAuthenticationListener.
     */
    @Test
    public void testOnApplicationEvent() {
        System.out.println("onApplicationEvent");
        ApplicationEvent event = null;
        UserAuthenticationListener instance = new UserAuthenticationListener();
        instance.onApplicationEvent(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
