/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.db;

import java.io.File;
import java.io.Reader;
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
public class ScriptParserIT {
    
    public ScriptParserIT() {
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
     * Test of parse method, of class ScriptParser.
     */
    @Test
    public void testParse_File() throws Exception {
        System.out.println("parse");
        File file = null;
        ScriptParser instance = new ScriptParser();
        List<String> expResult = null;
        List<String> result = instance.parse(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parse method, of class ScriptParser.
     */
    @Test
    public void testParse_Reader() throws Exception {
        System.out.println("parse");
        Reader reader = null;
        ScriptParser instance = new ScriptParser();
        List<String> expResult = null;
        List<String> result = instance.parse(reader);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
