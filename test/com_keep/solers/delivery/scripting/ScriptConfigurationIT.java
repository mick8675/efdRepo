/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting;

import java.util.Map;
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
public class ScriptConfigurationIT {
    
    public ScriptConfigurationIT() {
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
     * Test of isSupported method, of class ScriptConfiguration.
     */
    @Test
    public void testIsSupported() {
        System.out.println("isSupported");
        String language = "";
        ScriptConfiguration instance = null;
        boolean expResult = false;
        boolean result = instance.isSupported(language);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLanguageFromExtension method, of class ScriptConfiguration.
     */
    @Test
    public void testGetLanguageFromExtension() {
        System.out.println("getLanguageFromExtension");
        String extension = "";
        ScriptConfiguration instance = null;
        String expResult = "";
        String result = instance.getLanguageFromExtension(extension);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMap method, of class ScriptConfiguration.
     */
    @Test
    public void testGetMap() {
        System.out.println("getMap");
        ScriptConfiguration instance = null;
        Map<String, ScriptConfiguration.ScriptLanguage> expResult = null;
        Map<String, ScriptConfiguration.ScriptLanguage> result = instance.getMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefaultLanguage method, of class ScriptConfiguration.
     */
    @Test
    public void testGetDefaultLanguage() {
        System.out.println("getDefaultLanguage");
        ScriptConfiguration instance = null;
        String expResult = "";
        String result = instance.getDefaultLanguage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
