/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security;

import java.security.KeyStore;
import java.security.cert.PKIXParameters;
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
public class CRLConfiguratorIT {
    
    public CRLConfiguratorIT() {
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
     * Test of setOcspEnabled method, of class CRLConfigurator.
     */
    @Test
    public void testSetOcspEnabled() {
        System.out.println("setOcspEnabled");
        String enable = "";
        CRLConfigurator.setOcspEnabled(enable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAnyRevocationEnabled method, of class CRLConfigurator.
     */
    @Test
    public void testIsAnyRevocationEnabled() {
        System.out.println("isAnyRevocationEnabled");
        boolean expResult = false;
        boolean result = CRLConfigurator.isAnyRevocationEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRevocationEnabled method, of class CRLConfigurator.
     */
    @Test
    public void testIsRevocationEnabled() {
        System.out.println("isRevocationEnabled");
        boolean expResult = false;
        boolean result = CRLConfigurator.isRevocationEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRevocationEnabled method, of class CRLConfigurator.
     */
    @Test
    public void testSetRevocationEnabled() {
        System.out.println("setRevocationEnabled");
        String enabled = "";
        CRLConfigurator.setRevocationEnabled(enabled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCRLDPEnabled method, of class CRLConfigurator.
     */
    @Test
    public void testSetCRLDPEnabled() {
        System.out.println("setCRLDPEnabled");
        String enable = "";
        CRLConfigurator.setCRLDPEnabled(enable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCRLDPEnabled method, of class CRLConfigurator.
     */
    @Test
    public void testIsCRLDPEnabled() {
        System.out.println("isCRLDPEnabled");
        boolean expResult = false;
        boolean result = CRLConfigurator.isCRLDPEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecurityProperty method, of class CRLConfigurator.
     */
    @Test
    public void testSetSecurityProperty() {
        System.out.println("setSecurityProperty");
        String property = "";
        String value = "";
        CRLConfigurator.setSecurityProperty(property, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadCertPathParameters method, of class CRLConfigurator.
     */
    @Test
    public void testLoadCertPathParameters() throws Exception {
        System.out.println("loadCertPathParameters");
        KeyStore trusted = null;
        PKIXParameters expResult = null;
        PKIXParameters result = CRLConfigurator.loadCertPathParameters(trusted);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
