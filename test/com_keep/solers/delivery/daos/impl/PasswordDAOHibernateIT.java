/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.daos.impl;

import com.solers.delivery.domain.Password;
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
public class PasswordDAOHibernateIT {
    
    public PasswordDAOHibernateIT() {
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
     * Test of getPasswords method, of class PasswordDAOHibernate.
     */
    @Test
    public void testGetPasswords() {
        System.out.println("getPasswords");
        Long id = null;
        PasswordDAOHibernate instance = null;
        List<Password> expResult = null;
        List<Password> result = instance.getPasswords(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteOldest method, of class PasswordDAOHibernate.
     */
    @Test
    public void testDeleteOldest() {
        System.out.println("deleteOldest");
        Long id = null;
        PasswordDAOHibernate instance = null;
        instance.deleteOldest(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAll method, of class PasswordDAOHibernate.
     */
    @Test
    public void testDeleteAll() {
        System.out.println("deleteAll");
        Long id = null;
        PasswordDAOHibernate instance = null;
        instance.deleteAll(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
