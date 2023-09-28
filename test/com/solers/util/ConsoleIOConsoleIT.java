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
public class ConsoleIOConsoleIT {
    
    public ConsoleIOConsoleIT() {
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
     * Test of flush method, of class ConsoleIOConsole.
     */
    @Test
    public void testFlush() {
        System.out.println("flush");
        ConsoleIOConsole instance = new ConsoleIOConsole();
        instance.flush();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class ConsoleIOConsole.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        String s = "";
        ConsoleIOConsole instance = new ConsoleIOConsole();
        instance.print(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of println method, of class ConsoleIOConsole.
     */
    @Test
    public void testPrintln() {
        System.out.println("println");
        String s = "";
        ConsoleIOConsole instance = new ConsoleIOConsole();
        instance.println(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLine method, of class ConsoleIOConsole.
     */
    @Test
    public void testReadLine_0args() {
        System.out.println("readLine");
        ConsoleIOConsole instance = new ConsoleIOConsole();
        String expResult = "";
        String result = instance.readLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLine method, of class ConsoleIOConsole.
     */
    @Test
    public void testReadLine_String() {
        System.out.println("readLine");
        String prompt = "";
        ConsoleIOConsole instance = new ConsoleIOConsole();
        String expResult = "";
        String result = instance.readLine(prompt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doReadPassword method, of class ConsoleIOConsole.
     */
    @Test
    public void testDoReadPassword() {
        System.out.println("doReadPassword");
        String prompt = "";
        ConsoleIOConsole instance = new ConsoleIOConsole();
        char[] expResult = null;
        char[] result = instance.doReadPassword(prompt);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
