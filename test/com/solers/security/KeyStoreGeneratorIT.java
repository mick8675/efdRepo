/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security;

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
public class KeyStoreGeneratorIT {
    
    public KeyStoreGeneratorIT() {
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
     * Test of saveKeyStore method, of class KeyStoreGenerator.
     */
    @Test
    public void testSaveKeyStore() throws Exception {
        System.out.println("saveKeyStore");
        File destination = null;
        char[] keyStorePassword = null;
        char[] keyPassword = null;
        KeyStoreGenerator instance = null;
        instance.saveKeyStore(destination, keyStorePassword, keyPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveTrustStore method, of class KeyStoreGenerator.
     */
    @Test
    public void testSaveTrustStore() throws Exception {
        System.out.println("saveTrustStore");
        File destination = null;
        char[] trustStorePassword = null;
        KeyStoreGenerator instance = null;
        instance.saveTrustStore(destination, trustStorePassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
