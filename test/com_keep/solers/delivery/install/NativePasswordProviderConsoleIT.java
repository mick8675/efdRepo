/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.install;

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
public class NativePasswordProviderConsoleIT {
    
    public NativePasswordProviderConsoleIT() {
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
     * Test of getInstance method, of class NativePasswordProviderConsole.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        char[] masterPassword = null;
        File file = null;
        NativePasswordProviderConsole instance = new NativePasswordProviderConsole();
        PasswordProvider expResult = null;
        PasswordProvider result = instance.getInstance(masterPassword, file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class NativePasswordProviderConsole.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NativePasswordProviderConsole.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
