/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security.ssl;

import java.util.Set;
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
public class CipherSuiteUtilIT {
    
    public CipherSuiteUtilIT() {
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
     * Test of getEnabledCipherSuites method, of class CipherSuiteUtil.
     */
    @Test
    public void testGetEnabledCipherSuites() {
        System.out.println("getEnabledCipherSuites");
        String[] supportedCipherSuites = null;
        Set<String> allowedCipherSuites = null;
        String[] expResult = null;
        String[] result = CipherSuiteUtil.getEnabledCipherSuites(supportedCipherSuites, allowedCipherSuites);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
