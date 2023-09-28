/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.install.upgrade;

import com.solers.security.password.PasswordProvider;
import java.io.File;
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
public class WindowsPasswordProviderUpgradeTaskIT {
    
    public WindowsPasswordProviderUpgradeTaskIT() {
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
     * Test of createProvider method, of class WindowsPasswordProviderUpgradeTask.
     */
    @Test
    public void testCreateProvider() {
        System.out.println("createProvider");
        char[] password = null;
        File passwordFile = null;
        WindowsPasswordProviderUpgradeTask instance = new WindowsPasswordProviderUpgradeTask();
        PasswordProvider expResult = null;
        PasswordProvider result = instance.createProvider(password, passwordFile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class WindowsPasswordProviderUpgradeTask.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String message = "";
        char[] password = null;
        WindowsPasswordProviderUpgradeTask instance = new WindowsPasswordProviderUpgradeTask();
        String expResult = "";
        String result = instance.decrypt(message, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readMasterPassword method, of class WindowsPasswordProviderUpgradeTask.
     */
    @Test
    public void testReadMasterPassword() {
        System.out.println("readMasterPassword");
        WindowsPasswordProviderUpgradeTask instance = new WindowsPasswordProviderUpgradeTask();
        instance.readMasterPassword();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
