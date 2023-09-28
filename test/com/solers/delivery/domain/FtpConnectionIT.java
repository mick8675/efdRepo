/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain;

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
public class FtpConnectionIT {
    
    public FtpConnectionIT() {
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
     * Test of getId method, of class FtpConnection.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        FtpConnection instance = new FtpConnection();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class FtpConnection.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        FtpConnection instance = new FtpConnection();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirectory method, of class FtpConnection.
     */
    @Test
    public void testGetDirectory() {
        System.out.println("getDirectory");
        FtpConnection instance = new FtpConnection();
        String expResult = "";
        String result = instance.getDirectory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirectory method, of class FtpConnection.
     */
    @Test
    public void testSetDirectory() {
        System.out.println("setDirectory");
        String directory = "";
        FtpConnection instance = new FtpConnection();
        instance.setDirectory(directory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHost method, of class FtpConnection.
     */
    @Test
    public void testGetHost() {
        System.out.println("getHost");
        FtpConnection instance = new FtpConnection();
        String expResult = "";
        String result = instance.getHost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHost method, of class FtpConnection.
     */
    @Test
    public void testSetHost() {
        System.out.println("setHost");
        String host = "";
        FtpConnection instance = new FtpConnection();
        instance.setHost(host);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class FtpConnection.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        FtpConnection instance = new FtpConnection();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class FtpConnection.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        FtpConnection instance = new FtpConnection();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPort method, of class FtpConnection.
     */
    @Test
    public void testGetPort() {
        System.out.println("getPort");
        FtpConnection instance = new FtpConnection();
        String expResult = "";
        String result = instance.getPort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPort method, of class FtpConnection.
     */
    @Test
    public void testSetPort() {
        System.out.println("setPort");
        String port = "";
        FtpConnection instance = new FtpConnection();
        instance.setPort(port);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class FtpConnection.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        FtpConnection instance = new FtpConnection();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class FtpConnection.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        FtpConnection instance = new FtpConnection();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPassive method, of class FtpConnection.
     */
    @Test
    public void testIsPassive() {
        System.out.println("isPassive");
        FtpConnection instance = new FtpConnection();
        boolean expResult = false;
        boolean result = instance.isPassive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassive method, of class FtpConnection.
     */
    @Test
    public void testSetPassive() {
        System.out.println("setPassive");
        boolean passive = false;
        FtpConnection instance = new FtpConnection();
        instance.setPassive(passive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isImplicit method, of class FtpConnection.
     */
    @Test
    public void testIsImplicit() {
        System.out.println("isImplicit");
        FtpConnection instance = new FtpConnection();
        boolean expResult = false;
        boolean result = instance.isImplicit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImplicit method, of class FtpConnection.
     */
    @Test
    public void testSetImplicit() {
        System.out.println("setImplicit");
        boolean implicit = false;
        FtpConnection instance = new FtpConnection();
        instance.setImplicit(implicit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlainPassword method, of class FtpConnection.
     */
    @Test
    public void testGetPlainPassword() {
        System.out.println("getPlainPassword");
        FtpConnection instance = new FtpConnection();
        String expResult = "";
        String result = instance.getPlainPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlainPassword method, of class FtpConnection.
     */
    @Test
    public void testSetPlainPassword() {
        System.out.println("setPlainPassword");
        String p = "";
        FtpConnection instance = new FtpConnection();
        instance.setPlainPassword(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
