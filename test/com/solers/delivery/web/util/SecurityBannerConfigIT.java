/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.util;

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
public class SecurityBannerConfigIT {
    
    public SecurityBannerConfigIT() {
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
     * Test of setSecurityLevel method, of class SecurityBannerConfig.
     */
    @Test
    public void testSetSecurityLevel() {
        System.out.println("setSecurityLevel");
        String securityLevel = "";
        SecurityBannerConfig instance = new SecurityBannerConfig();
        instance.setSecurityLevel(securityLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecurityLevel method, of class SecurityBannerConfig.
     */
    @Test
    public void testGetSecurityLevel() {
        System.out.println("getSecurityLevel");
        SecurityBannerConfig instance = new SecurityBannerConfig();
        String expResult = "";
        String result = instance.getSecurityLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBackgroundColor method, of class SecurityBannerConfig.
     */
    @Test
    public void testSetBackgroundColor() {
        System.out.println("setBackgroundColor");
        String backgroundColor = "";
        SecurityBannerConfig instance = new SecurityBannerConfig();
        instance.setBackgroundColor(backgroundColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBackgroundColor method, of class SecurityBannerConfig.
     */
    @Test
    public void testGetBackgroundColor() {
        System.out.println("getBackgroundColor");
        SecurityBannerConfig instance = new SecurityBannerConfig();
        String expResult = "";
        String result = instance.getBackgroundColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHostName method, of class SecurityBannerConfig.
     */
    @Test
    public void testGetHostName() {
        System.out.println("getHostName");
        SecurityBannerConfig instance = new SecurityBannerConfig();
        String expResult = "";
        String result = instance.getHostName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
