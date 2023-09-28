/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util;

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
public class SystemIOConsoleIT {
    
    public SystemIOConsoleIT() {
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
     * Test of flush method, of class SystemIOConsole.
     */
    @Test
    public void testFlush() {
        System.out.println("flush");
        SystemIOConsole instance = new SystemIOConsole();
        instance.flush();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class SystemIOConsole.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        String s = "";
        SystemIOConsole instance = new SystemIOConsole();
        instance.print(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of println method, of class SystemIOConsole.
     */
    @Test
    public void testPrintln() {
        System.out.println("println");
        String s = "";
        SystemIOConsole instance = new SystemIOConsole();
        instance.println(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLine method, of class SystemIOConsole.
     */
    @Test
    public void testReadLine_String() {
        System.out.println("readLine");
        String prompt = "";
        SystemIOConsole instance = new SystemIOConsole();
        String expResult = "";
        String result = instance.readLine(prompt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLine method, of class SystemIOConsole.
     */
    @Test
    public void testReadLine_0args() {
        System.out.println("readLine");
        SystemIOConsole instance = new SystemIOConsole();
        String expResult = "";
        String result = instance.readLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doReadPassword method, of class SystemIOConsole.
     */
    @Test
    public void testDoReadPassword() {
        System.out.println("doReadPassword");
        String prompt = "";
        SystemIOConsole instance = new SystemIOConsole();
        char[] expResult = null;
        char[] result = instance.doReadPassword(prompt);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
