/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.remoting;

import com.solers.delivery.domain.User;
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
public class UserHelperIT {
    
    public UserHelperIT() {
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
     * Test of getUsers method, of class UserHelper.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        UserHelper instance = null;
        List<UserNode> expResult = null;
        List<UserNode> result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveUser method, of class UserHelper.
     */
    @Test
    public void testSaveUser() {
        System.out.println("saveUser");
        User user = null;
        String pw = "";
        String pwConfirm = "";
        UserHelper instance = null;
        Long expResult = null;
        Long result = instance.saveUser(user, pw, pwConfirm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserById method, of class UserHelper.
     */
    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        Long id = null;
        UserHelper instance = null;
        User expResult = null;
        User result = instance.getUserById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserByName method, of class UserHelper.
     */
    @Test
    public void testGetUserByName() {
        System.out.println("getUserByName");
        String username = "";
        UserHelper instance = null;
        User expResult = null;
        User result = instance.getUserByName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
