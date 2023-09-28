/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.daos.impl;

import com.solers.delivery.daos.AlertDAO;
import com.solers.delivery.daos.AllowedHostDAO;
import com.solers.delivery.daos.ConsumerContentSetDAO;
import com.solers.delivery.daos.ContentSetDAO;
import com.solers.delivery.daos.PasswordDAO;
import com.solers.delivery.daos.PendingDeleteDAO;
import com.solers.delivery.daos.UserDAO;
import com.solers.util.dao.GenericDAO;
import org.hibernate.SessionFactory;
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
public class HibernateDAOFactoryIT {
    
    public HibernateDAOFactoryIT() {
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
     * Test of getGenericDAO method, of class HibernateDAOFactory.
     */
    @Test
    public void testGetGenericDAO() {
        System.out.println("getGenericDAO");
        HibernateDAOFactory instance = new HibernateDAOFactory();
        GenericDAO expResult = null;
        GenericDAO result = instance.getGenericDAO(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetDAO method, of class HibernateDAOFactory.
     */
    @Test
    public void testGetContentSetDAO() {
        System.out.println("getContentSetDAO");
        HibernateDAOFactory instance = new HibernateDAOFactory();
        ContentSetDAO expResult = null;
        ContentSetDAO result = instance.getContentSetDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsumerContentSetDAO method, of class HibernateDAOFactory.
     */
    @Test
    public void testGetConsumerContentSetDAO() {
        System.out.println("getConsumerContentSetDAO");
        HibernateDAOFactory instance = new HibernateDAOFactory();
        ConsumerContentSetDAO expResult = null;
        ConsumerContentSetDAO result = instance.getConsumerContentSetDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPendingDeleteDAO method, of class HibernateDAOFactory.
     */
    @Test
    public void testGetPendingDeleteDAO() {
        System.out.println("getPendingDeleteDAO");
        HibernateDAOFactory instance = new HibernateDAOFactory();
        PendingDeleteDAO expResult = null;
        PendingDeleteDAO result = instance.getPendingDeleteDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserDAO method, of class HibernateDAOFactory.
     */
    @Test
    public void testGetUserDAO() {
        System.out.println("getUserDAO");
        HibernateDAOFactory instance = new HibernateDAOFactory();
        UserDAO expResult = null;
        UserDAO result = instance.getUserDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswordDAO method, of class HibernateDAOFactory.
     */
    @Test
    public void testGetPasswordDAO() {
        System.out.println("getPasswordDAO");
        HibernateDAOFactory instance = new HibernateDAOFactory();
        PasswordDAO expResult = null;
        PasswordDAO result = instance.getPasswordDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllowedHostDAO method, of class HibernateDAOFactory.
     */
    @Test
    public void testGetAllowedHostDAO() {
        System.out.println("getAllowedHostDAO");
        HibernateDAOFactory instance = new HibernateDAOFactory();
        AllowedHostDAO expResult = null;
        AllowedHostDAO result = instance.getAllowedHostDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlertDAO method, of class HibernateDAOFactory.
     */
    @Test
    public void testGetAlertDAO() {
        System.out.println("getAlertDAO");
        HibernateDAOFactory instance = new HibernateDAOFactory();
        AlertDAO expResult = null;
        AlertDAO result = instance.getAlertDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionFactory method, of class HibernateDAOFactory.
     */
    @Test
    public void testSetSessionFactory() {
        System.out.println("setSessionFactory");
        SessionFactory sessionFactory = null;
        HibernateDAOFactory instance = new HibernateDAOFactory();
        instance.setSessionFactory(sessionFactory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
