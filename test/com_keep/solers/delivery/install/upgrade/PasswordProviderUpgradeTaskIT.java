/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.install.upgrade;

import com.solers.security.password.PasswordProvider;
import java.io.File;
import java.util.Map;
import java.util.Properties;
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
public class PasswordProviderUpgradeTaskIT {
    
    public PasswordProviderUpgradeTaskIT() {
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
     * Test of setFileName method, of class PasswordProviderUpgradeTask.
     */
    @Test
    public void testSetFileName() {
        System.out.println("setFileName");
        String fileName = "";
        PasswordProviderUpgradeTask instance = new PasswordProviderUpgradeTask();
        instance.setFileName(fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class PasswordProviderUpgradeTask.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        char[] password = null;
        PasswordProviderUpgradeTask instance = new PasswordProviderUpgradeTask();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class PasswordProviderUpgradeTask.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        PasswordProviderUpgradeTask instance = new PasswordProviderUpgradeTask();
        instance.execute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeProvider method, of class PasswordProviderUpgradeTask.
     */
    @Test
    public void testRemoveProvider() {
        System.out.println("removeProvider");
        PasswordProviderUpgradeTask instance = new PasswordProviderUpgradeTask();
        instance.removeProvider();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeProvider method, of class PasswordProviderUpgradeTask.
     */
    @Test
    public void testInitializeProvider() {
        System.out.println("initializeProvider");
        PasswordProviderUpgradeTask instance = new PasswordProviderUpgradeTask();
        instance.initializeProvider();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createProvider method, of class PasswordProviderUpgradeTask.
     */
    @Test
    public void testCreateProvider() {
        System.out.println("createProvider");
        char[] password = null;
        File passwordFile = null;
        PasswordProviderUpgradeTask instance = new PasswordProviderUpgradeTask();
        PasswordProvider expResult = null;
        PasswordProvider result = instance.createProvider(password, passwordFile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPasswords method, of class PasswordProviderUpgradeTask.
     */
    @Test
    public void testGetCurrentPasswords() {
        System.out.println("getCurrentPasswords");
        PasswordProviderUpgradeTask instance = new PasswordProviderUpgradeTask();
        Map<String, String> expResult = null;
        Map<String, String> result = instance.getCurrentPasswords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readProperties method, of class PasswordProviderUpgradeTask.
     */
    @Test
    public void testReadProperties() {
        System.out.println("readProperties");
        PasswordProviderUpgradeTask instance = new PasswordProviderUpgradeTask();
        Properties expResult = null;
        Properties result = instance.readProperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readMasterPassword method, of class PasswordProviderUpgradeTask.
     */
    @Test
    public void testReadMasterPassword() {
        System.out.println("readMasterPassword");
        PasswordProviderUpgradeTask instance = new PasswordProviderUpgradeTask();
        instance.readMasterPassword();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class PasswordProviderUpgradeTask.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String cipherText = "";
        char[] password = null;
        PasswordProviderUpgradeTask instance = new PasswordProviderUpgradeTask();
        String expResult = "";
        String result = instance.decrypt(cipherText, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
