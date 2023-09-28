/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.user;

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
public class RestfulUserServiceIT {
    
    public RestfulUserServiceIT() {
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
     * Test of get method, of class RestfulUserService.
     */
    @Test
    public void testGet_String() {
        System.out.println("get");
        String username = "";
        RestfulUserService instance = null;
        User expResult = null;
        User result = instance.get(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class RestfulUserService.
     */
    @Test
    public void testGet_Long() {
        System.out.println("get");
        Long id = null;
        RestfulUserService instance = null;
        User expResult = null;
        User result = instance.get(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsers method, of class RestfulUserService.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        RestfulUserService instance = null;
        List<User> expResult = null;
        List<User> result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disable method, of class RestfulUserService.
     */
    @Test
    public void testDisable() {
        System.out.println("disable");
        Long id = null;
        RestfulUserService instance = null;
        instance.disable(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enable method, of class RestfulUserService.
     */
    @Test
    public void testEnable() {
        System.out.println("enable");
        Long id = null;
        RestfulUserService instance = null;
        instance.enable(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class RestfulUserService.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Long id = null;
        RestfulUserService instance = null;
        instance.remove(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class RestfulUserService.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        User user = null;
        RestfulUserService instance = null;
        Long expResult = null;
        Long result = instance.save(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
