/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security.password;

import java.io.InputStream;
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
public class PasswordReaderIT {
    
    public PasswordReaderIT() {
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
     * Test of readPassword method, of class PasswordReader.
     */
    @Test
    public void testReadPassword_0args() {
        System.out.println("readPassword");
        PasswordReader instance = new PasswordReader();
        char[] expResult = null;
        char[] result = instance.readPassword();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readPassword method, of class PasswordReader.
     */
    @Test
    public void testReadPassword_InputStream() {
        System.out.println("readPassword");
        InputStream input = null;
        PasswordReader instance = new PasswordReader();
        char[] expResult = null;
        char[] result = instance.readPassword(input);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notNewline method, of class PasswordReader.
     */
    @Test
    public void testNotNewline() {
        System.out.println("notNewline");
        char c = ' ';
        PasswordReader instance = new PasswordReader();
        boolean expResult = false;
        boolean result = instance.notNewline(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
