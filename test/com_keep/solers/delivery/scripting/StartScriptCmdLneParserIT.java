/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting;

import java.util.List;
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
public class StartScriptCmdLneParserIT {
    
    public StartScriptCmdLneParserIT() {
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
     * Test of isVerbose method, of class StartScriptCmdLneParser.
     */
    @Test
    public void testIsVerbose() {
        System.out.println("isVerbose");
        StartScriptCmdLneParser instance = null;
        boolean expResult = false;
        boolean result = instance.isVerbose();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErrors method, of class StartScriptCmdLneParser.
     */
    @Test
    public void testGetErrors() {
        System.out.println("getErrors");
        StartScriptCmdLneParser instance = null;
        List<String> expResult = null;
        List<String> result = instance.getErrors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printHelp method, of class StartScriptCmdLneParser.
     */
    @Test
    public void testPrintHelp() {
        System.out.println("printHelp");
        StartScriptCmdLneParser.printHelp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
