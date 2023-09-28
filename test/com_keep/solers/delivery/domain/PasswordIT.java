/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain;

import java.util.Date;
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
public class PasswordIT {
    
    public PasswordIT() {
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
     * Test of getId method, of class Password.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Password instance = new Password();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Password.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Password instance = new Password();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreatedDate method, of class Password.
     */
    @Test
    public void testGetCreatedDate() {
        System.out.println("getCreatedDate");
        Password instance = new Password();
        Date expResult = null;
        Date result = instance.getCreatedDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreatedDate method, of class Password.
     */
    @Test
    public void testSetCreatedDate() {
        System.out.println("setCreatedDate");
        Date createdDate = null;
        Password instance = new Password();
        instance.setCreatedDate(createdDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Password.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Password instance = new Password();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Password.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Password instance = new Password();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Password.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Password instance = new Password();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Password.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Password instance = new Password();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAdminCreated method, of class Password.
     */
    @Test
    public void testIsAdminCreated() {
        System.out.println("isAdminCreated");
        Password instance = new Password();
        Boolean expResult = null;
        Boolean result = instance.isAdminCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdminCreated method, of class Password.
     */
    @Test
    public void testSetAdminCreated() {
        System.out.println("setAdminCreated");
        Boolean adminCreated = null;
        Password instance = new Password();
        instance.setAdminCreated(adminCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
