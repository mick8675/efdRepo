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
public class IOConsoleIT {
    
    public IOConsoleIT() {
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
     * Test of flush method, of class IOConsole.
     */
    @Test
    public void testFlush() {
        System.out.println("flush");
        IOConsole instance = new IOConsoleImpl();
        instance.flush();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class IOConsole.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        String s = "";
        IOConsole instance = new IOConsoleImpl();
        instance.print(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of println method, of class IOConsole.
     */
    @Test
    public void testPrintln() {
        System.out.println("println");
        String s = "";
        IOConsole instance = new IOConsoleImpl();
        instance.println(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readPassword method, of class IOConsole.
     */
    @Test
    public void testReadPassword() {
        System.out.println("readPassword");
        String prompt = "";
        boolean confirm = false;
        IOConsole instance = new IOConsoleImpl();
        char[] expResult = null;
        char[] result = instance.readPassword(prompt, confirm);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLine method, of class IOConsole.
     */
    @Test
    public void testReadLine_0args() {
        System.out.println("readLine");
        IOConsole instance = new IOConsoleImpl();
        String expResult = "";
        String result = instance.readLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLine method, of class IOConsole.
     */
    @Test
    public void testReadLine_String() {
        System.out.println("readLine");
        String prompt = "";
        IOConsole instance = new IOConsoleImpl();
        String expResult = "";
        String result = instance.readLine(prompt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IOConsoleImpl implements IOConsole {

        public void flush() {
        }

        public void print(String s) {
        }

        public void println(String s) {
        }

        public char[] readPassword(String prompt, boolean confirm) {
            return null;
        }

        public String readLine() {
            return "";
        }

        public String readLine(String prompt) {
            return "";
        }
    }
    
}
