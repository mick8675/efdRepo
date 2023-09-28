/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.util.password;

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
public class PasswordValidatorIT {
    
    public PasswordValidatorIT() {
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
     * Test of validatePasswordDoesNotContain method, of class PasswordValidator.
     */
    @Test
    public void testValidatePasswordDoesNotContain() {
        System.out.println("validatePasswordDoesNotContain");
        String password = "";
        String[] strings = null;
        PasswordValidator.validatePasswordDoesNotContain(password, strings);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateSystemPassword method, of class PasswordValidator.
     */
    @Test
    public void testValidateSystemPassword_String_String() {
        System.out.println("validateSystemPassword");
        String password = "";
        String message = "";
        PasswordValidator.validateSystemPassword(password, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateSystemPassword method, of class PasswordValidator.
     */
    @Test
    public void testValidateSystemPassword_3args() {
        System.out.println("validateSystemPassword");
        String password = "";
        String message = "";
        int length = 0;
        PasswordValidator.validateSystemPassword(password, message, length);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateNonSystemPassword method, of class PasswordValidator.
     */
    @Test
    public void testValidateNonSystemPassword() {
        System.out.println("validateNonSystemPassword");
        char[] password = null;
        PasswordValidator.validateNonSystemPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
