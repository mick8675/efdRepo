/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.tools;

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
public class ClToolsIT {
    
    public ClToolsIT() {
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
     * Test of initializeJsafeProvider method, of class ClTools.
     */
    @Test
    public void testInitializeJsafeProvider() {
        System.out.println("initializeJsafeProvider");
        ClTools.initializeJsafeProvider();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeSSL method, of class ClTools.
     */
    @Test
    public void testInitializeSSL() {
        System.out.println("initializeSSL");
        PasswordProvider provider = null;
        File securityDirectory = null;
        ClTools.initializeSSL(provider, securityDirectory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extractFile method, of class ClTools.
     */
    @Test
    public void testExtractFile_boolean_StringArr() {
        System.out.println("extractFile");
        boolean mustExist = false;
        String[] args = null;
        File expResult = null;
        File result = ClTools.extractFile(mustExist, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extractFile method, of class ClTools.
     */
    @Test
    public void testExtractFile_3args() {
        System.out.println("extractFile");
        boolean mustExist = false;
        int expectedLocation = 0;
        String[] args = null;
        File expResult = null;
        File result = ClTools.extractFile(mustExist, expectedLocation, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extractExistingFile method, of class ClTools.
     */
    @Test
    public void testExtractExistingFile_int_StringArr() {
        System.out.println("extractExistingFile");
        int expectedLocation = 0;
        String[] args = null;
        File expResult = null;
        File result = ClTools.extractExistingFile(expectedLocation, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extractExistingFile method, of class ClTools.
     */
    @Test
    public void testExtractExistingFile_StringArr() {
        System.out.println("extractExistingFile");
        String[] args = null;
        File expResult = null;
        File result = ClTools.extractExistingFile(args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsEmptyArguments method, of class ClTools.
     */
    @Test
    public void testContainsEmptyArguments() {
        System.out.println("containsEmptyArguments");
        String[] args = null;
        boolean expResult = false;
        boolean result = ClTools.containsEmptyArguments(args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class ClTools.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        String s = "";
        boolean expResult = false;
        boolean result = ClTools.isEmpty(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
