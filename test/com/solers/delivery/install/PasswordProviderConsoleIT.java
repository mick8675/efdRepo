/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.install;

import com.solers.security.password.PasswordProvider;
import com.solers.util.IOConsole;
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
public class PasswordProviderConsoleIT {
    
    public PasswordProviderConsoleIT() {
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
     * Test of readPassword method, of class PasswordProviderConsole.
     */
    @Test
    public void testReadPassword() {
        System.out.println("readPassword");
        IOConsole cons = null;
        String prompt = "";
        boolean isSystemPassword = false;
        char[] expResult = null;
        char[] result = PasswordProviderConsole.readPassword(cons, prompt, isSystemPassword);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PasswordProviderConsole.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PasswordProviderConsole.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class PasswordProviderConsole.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        PasswordProviderConsole providerConsole = null;
        String filename = "";
        IOConsole console = null;
        PasswordProviderConsole.create(providerConsole, filename, console);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creating method, of class PasswordProviderConsole.
     */
    @Test
    public void testCreating() {
        System.out.println("creating");
        String[] args = null;
        boolean expResult = false;
        boolean result = PasswordProviderConsole.creating(args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPasswordFile method, of class PasswordProviderConsole.
     */
    @Test
    public void testCreatePasswordFile() throws Exception {
        System.out.println("createPasswordFile");
        String passwordFile = "";
        IOConsole console = null;
        PasswordProviderConsole instance = new PasswordProviderConsole();
        PasswordProvider expResult = null;
        PasswordProvider result = instance.createPasswordFile(passwordFile, console);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewProvider method, of class PasswordProviderConsole.
     */
    @Test
    public void testCreateNewProvider() {
        System.out.println("createNewProvider");
        IOConsole console = null;
        File file = null;
        PasswordProviderConsole instance = new PasswordProviderConsole();
        PasswordProvider expResult = null;
        PasswordProvider result = instance.createNewProvider(console, file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentProvider method, of class PasswordProviderConsole.
     */
    @Test
    public void testGetCurrentProvider() {
        System.out.println("getCurrentProvider");
        IOConsole console = null;
        File file = null;
        PasswordProviderConsole instance = new PasswordProviderConsole();
        PasswordProvider expResult = null;
        PasswordProvider result = instance.getCurrentProvider(console, file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyMasterPassword method, of class PasswordProviderConsole.
     */
    @Test
    public void testVerifyMasterPassword() {
        System.out.println("verifyMasterPassword");
        String passwordFile = "";
        char[] masterPassword = null;
        IOConsole console = null;
        PasswordProviderConsole instance = new PasswordProviderConsole();
        boolean expResult = false;
        boolean result = instance.verifyMasterPassword(passwordFile, masterPassword, console);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class PasswordProviderConsole.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        char[] masterPassword = null;
        File file = null;
        PasswordProviderConsole instance = new PasswordProviderConsole();
        PasswordProvider expResult = null;
        PasswordProvider result = instance.getInstance(masterPassword, file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
