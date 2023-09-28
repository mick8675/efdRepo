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
public class UserPasswordEncoderIT {
    
    public UserPasswordEncoderIT() {
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
     * Test of encodePassword method, of class UserPasswordEncoder.
     */
    @Test
    public void testEncodePassword() {
        System.out.println("encodePassword");
        String rawPass = "";
        UserPasswordEncoder instance = new UserPasswordEncoder();
        String expResult = "";
        String result = instance.encodePassword(rawPass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPasswordValid method, of class UserPasswordEncoder.
     */
    @Test
    public void testIsPasswordValid() {
        System.out.println("isPasswordValid");
        String encPass = "";
        String rawPass = "";
        UserPasswordEncoder instance = new UserPasswordEncoder();
        boolean expResult = false;
        boolean result = instance.isPasswordValid(encPass, rawPass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
