/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.daos.impl;

import com.solers.delivery.domain.AllowedHost;
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
public class AllowedHostDAOHibernateIT {
    
    public AllowedHostDAOHibernateIT() {
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
     * Test of getByAlias method, of class AllowedHostDAOHibernate.
     */
    @Test
    public void testGetByAlias() {
        System.out.println("getByAlias");
        String alias = "";
        AllowedHostDAOHibernate instance = null;
        AllowedHost expResult = null;
        AllowedHost result = instance.getByAlias(alias);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class AllowedHostDAOHibernate.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        AllowedHost allowedHost = null;
        AllowedHostDAOHibernate instance = null;
        instance.validate(allowedHost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
