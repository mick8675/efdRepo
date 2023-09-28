/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting;

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
public class ScriptUnitIT {
    
    public ScriptUnitIT() {
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
     * Test of getId method, of class ScriptUnit.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ScriptUnit instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupId method, of class ScriptUnit.
     */
    @Test
    public void testGetGroupId() {
        System.out.println("getGroupId");
        ScriptUnit instance = null;
        String expResult = "";
        String result = instance.getGroupId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFile method, of class ScriptUnit.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        ScriptUnit instance = null;
        File expResult = null;
        File result = instance.getFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScriptLanguage method, of class ScriptUnit.
     */
    @Test
    public void testGetScriptLanguage() {
        System.out.println("getScriptLanguage");
        ScriptUnit instance = null;
        String expResult = "";
        String result = instance.getScriptLanguage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArguments method, of class ScriptUnit.
     */
    @Test
    public void testGetArguments() {
        System.out.println("getArguments");
        ScriptUnit instance = null;
        String expResult = "";
        String result = instance.getArguments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ScriptUnit.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ScriptUnit instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
