/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.remoting;

import com.solers.delivery.domain.AllowedHost;
import com.solers.delivery.domain.User;
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
public class AdminHelperIT {
    
    public AdminHelperIT() {
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
     * Test of deleteAll method, of class AdminHelper.
     */
    @Test
    public void testDeleteAll() {
        System.out.println("deleteAll");
        AllowedHost[] hosts = null;
        User[] users = null;
        AdminHelper instance = null;
        instance.deleteAll(hosts, users);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enable method, of class AdminHelper.
     */
    @Test
    public void testEnable() {
        System.out.println("enable");
        Long[] ids = null;
        AdminHelper instance = null;
        instance.enable(ids);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disable method, of class AdminHelper.
     */
    @Test
    public void testDisable() {
        System.out.println("disable");
        Long[] ids = null;
        AdminHelper instance = null;
        instance.disable(ids);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
