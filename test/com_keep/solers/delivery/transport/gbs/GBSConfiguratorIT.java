/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs;

import com.solers.delivery.transport.gbs.ftp.FTPUserManager;
import org.apache.ftpserver.ConnectionConfigFactory;
import org.apache.ftpserver.DataConnectionConfigurationFactory;
import org.apache.ftpserver.listener.ListenerFactory;
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
public class GBSConfiguratorIT {
    
    public GBSConfiguratorIT() {
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
     * Test of getListenerFactory method, of class GBSConfigurator.
     */
    @Test
    public void testGetListenerFactory() {
        System.out.println("getListenerFactory");
        GBSConfigurator instance = null;
        ListenerFactory expResult = null;
        ListenerFactory result = instance.getListenerFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnectionFactory method, of class GBSConfigurator.
     */
    @Test
    public void testGetConnectionFactory() {
        System.out.println("getConnectionFactory");
        GBSConfigurator instance = null;
        ConnectionConfigFactory expResult = null;
        ConnectionConfigFactory result = instance.getConnectionFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserManager method, of class GBSConfigurator.
     */
    @Test
    public void testGetUserManager() {
        System.out.println("getUserManager");
        GBSConfigurator instance = null;
        FTPUserManager expResult = null;
        FTPUserManager result = instance.getUserManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataConfigFactory method, of class GBSConfigurator.
     */
    @Test
    public void testGetDataConfigFactory() {
        System.out.println("getDataConfigFactory");
        GBSConfigurator instance = null;
        DataConnectionConfigurationFactory expResult = null;
        DataConnectionConfigurationFactory result = instance.getDataConfigFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useImplicitSsl method, of class GBSConfigurator.
     */
    @Test
    public void testUseImplicitSsl() {
        System.out.println("useImplicitSsl");
        GBSConfigurator instance = null;
        boolean expResult = false;
        boolean result = instance.useImplicitSsl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGBSEnabled method, of class GBSConfigurator.
     */
    @Test
    public void testIsGBSEnabled() {
        System.out.println("isGBSEnabled");
        boolean expResult = false;
        boolean result = GBSConfigurator.isGBSEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGBSEnabled method, of class GBSConfigurator.
     */
    @Test
    public void testSetGBSEnabled() {
        System.out.println("setGBSEnabled");
        boolean enable = false;
        GBSConfigurator.setGBSEnabled(enable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
