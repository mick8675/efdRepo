/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.install;

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
public class SecuritySetupTaskIT {
    
    public SecuritySetupTaskIT() {
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
     * Test of setKeyStore method, of class SecuritySetupTask.
     */
    @Test
    public void testSetKeyStore() {
        System.out.println("setKeyStore");
        String keyStore = "";
        SecuritySetupTask instance = new SecuritySetupTask();
        instance.setKeyStore(keyStore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrustStore method, of class SecuritySetupTask.
     */
    @Test
    public void testSetTrustStore() {
        System.out.println("setTrustStore");
        String trustStore = "";
        SecuritySetupTask instance = new SecuritySetupTask();
        instance.setTrustStore(trustStore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPasswordfile method, of class SecuritySetupTask.
     */
    @Test
    public void testSetPasswordfile() {
        System.out.println("setPasswordfile");
        String passFile = "";
        SecuritySetupTask instance = new SecuritySetupTask();
        instance.setPasswordfile(passFile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class SecuritySetupTask.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        SecuritySetupTask instance = new SecuritySetupTask();
        instance.execute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswordConsole method, of class SecuritySetupTask.
     */
    @Test
    public void testGetPasswordConsole() {
        System.out.println("getPasswordConsole");
        SecuritySetupTask instance = new SecuritySetupTask();
        PasswordProviderConsole expResult = null;
        PasswordProviderConsole result = instance.getPasswordConsole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
