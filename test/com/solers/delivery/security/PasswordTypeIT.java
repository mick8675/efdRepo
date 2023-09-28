/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.security;

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
public class PasswordTypeIT {
    
    public PasswordTypeIT() {
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
     * Test of values method, of class PasswordType.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        PasswordType[] expResult = null;
        PasswordType[] result = PasswordType.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class PasswordType.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        PasswordType expResult = null;
        PasswordType result = PasswordType.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of key method, of class PasswordType.
     */
    @Test
    public void testKey() {
        System.out.println("key");
        PasswordType instance = null;
        String expResult = "";
        String result = instance.key();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prompt method, of class PasswordType.
     */
    @Test
    public void testPrompt() {
        System.out.println("prompt");
        PasswordType instance = null;
        String expResult = "";
        String result = instance.prompt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSystemPassword method, of class PasswordType.
     */
    @Test
    public void testIsSystemPassword() {
        System.out.println("isSystemPassword");
        PasswordType instance = null;
        boolean expResult = false;
        boolean result = instance.isSystemPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyValueOf method, of class PasswordType.
     */
    @Test
    public void testKeyValueOf() {
        System.out.println("keyValueOf");
        String key = "";
        PasswordType expResult = null;
        PasswordType result = PasswordType.keyValueOf(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PasswordType.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PasswordType instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
