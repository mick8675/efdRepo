/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs.ftp;

import org.apache.ftpserver.ftplet.Authentication;
import org.apache.ftpserver.ftplet.User;
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
public class FTPUserManagerIT {
    
    public FTPUserManagerIT() {
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
     * Test of getAdminName method, of class FTPUserManager.
     */
    @Test
    public void testGetAdminName() throws Exception {
        System.out.println("getAdminName");
        FTPUserManager instance = new FTPUserManager();
        String expResult = "";
        String result = instance.getAdminName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAdmin method, of class FTPUserManager.
     */
    @Test
    public void testIsAdmin() throws Exception {
        System.out.println("isAdmin");
        String arg0 = "";
        FTPUserManager instance = new FTPUserManager();
        boolean expResult = false;
        boolean result = instance.isAdmin(arg0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class FTPUserManager.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        FTPUserManager instance = new FTPUserManager();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class FTPUserManager.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        FTPUserManager instance = new FTPUserManager();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDir method, of class FTPUserManager.
     */
    @Test
    public void testSetDir() {
        System.out.println("setDir");
        String dir = "";
        FTPUserManager instance = new FTPUserManager();
        instance.setDir(dir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArchive method, of class FTPUserManager.
     */
    @Test
    public void testSetArchive() {
        System.out.println("setArchive");
        String archive = "";
        FTPUserManager instance = new FTPUserManager();
        instance.setArchive(archive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configure method, of class FTPUserManager.
     */
    @Test
    public void testConfigure() {
        System.out.println("configure");
        FTPUserManager instance = new FTPUserManager();
        instance.configure();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class FTPUserManager.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        User usr = null;
        FTPUserManager instance = new FTPUserManager();
        instance.save(usr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class FTPUserManager.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        String usrName = "";
        FTPUserManager instance = new FTPUserManager();
        instance.delete(usrName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllUserNames method, of class FTPUserManager.
     */
    @Test
    public void testGetAllUserNames() {
        System.out.println("getAllUserNames");
        FTPUserManager instance = new FTPUserManager();
        String[] expResult = null;
        String[] result = instance.getAllUserNames();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserByName method, of class FTPUserManager.
     */
    @Test
    public void testGetUserByName() {
        System.out.println("getUserByName");
        String userName = "";
        FTPUserManager instance = new FTPUserManager();
        User expResult = null;
        User result = instance.getUserByName(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doesExist method, of class FTPUserManager.
     */
    @Test
    public void testDoesExist() {
        System.out.println("doesExist");
        String name = "";
        FTPUserManager instance = new FTPUserManager();
        boolean expResult = false;
        boolean result = instance.doesExist(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticate method, of class FTPUserManager.
     */
    @Test
    public void testAuthenticate() throws Exception {
        System.out.println("authenticate");
        Authentication authentication = null;
        FTPUserManager instance = new FTPUserManager();
        User expResult = null;
        User result = instance.authenticate(authentication);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dispose method, of class FTPUserManager.
     */
    @Test
    public void testDispose() {
        System.out.println("dispose");
        FTPUserManager instance = new FTPUserManager();
        instance.dispose();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
