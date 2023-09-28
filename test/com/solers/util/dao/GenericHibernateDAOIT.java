/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.dao;
import java.lang.Object;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
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
public class GenericHibernateDAOIT {
    
    public GenericHibernateDAOIT() {
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
     * Test of setSessionFactory method, of class GenericHibernateDAO.
     */
    @Test
    public void testSetSessionFactory() {
        System.out.println("setSessionFactory");
        SessionFactory sessionFactory = null;
        GenericHibernateDAO instance = new GenericHibernateDAO();
        instance.setSessionFactory(sessionFactory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSession method, of class GenericHibernateDAO.
     */
    @Test
    public void testGetSession() {
        System.out.println("getSession");
        GenericHibernateDAO instance = new GenericHibernateDAO();
        Session expResult = null;
        Session result = instance.getSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersistentClass method, of class GenericHibernateDAO.
     */
    @Test
    public void testGetPersistentClass() {
        System.out.println("getPersistentClass");
        GenericHibernateDAO instance = new GenericHibernateDAO();
        Class expResult = null;
        Class result = instance.getPersistentClass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class GenericHibernateDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Object id = null;
        boolean lock = false;
        GenericHibernateDAO instance = new GenericHibernateDAO();
        Object expResult = null;
        Object result = instance.findById(null, lock);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class GenericHibernateDAO.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Object id = -1;
        GenericHibernateDAO instance = new GenericHibernateDAO();
        Object expResult = null;
        Object result = instance.getById(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class GenericHibernateDAO.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        GenericHibernateDAO instance = new GenericHibernateDAO();
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByExample method, of class GenericHibernateDAO.
     */
    @Test
    public void testFindByExample() {
        System.out.println("findByExample");
        Object exampleInstance = null;
        String[] excludeProperty = null;
        GenericHibernateDAO instance = new GenericHibernateDAO();
        List expResult = null;
        List result = instance.findByExample(exampleInstance, excludeProperty);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makePersistent method, of class GenericHibernateDAO.
     */
    @Test
    public void testMakePersistent() {
        System.out.println("makePersistent");
        Object entity = null;
        GenericHibernateDAO instance = new GenericHibernateDAO();
        Object expResult = null;
        Object result = instance.makePersistent(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeTransient method, of class GenericHibernateDAO.
     */
    @Test
    public void testMakeTransient() {
        System.out.println("makeTransient");
        Object entity = null;
        GenericHibernateDAO instance = new GenericHibernateDAO();
        instance.makeTransient(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeTransientById method, of class GenericHibernateDAO.
     */
    @Test
    public void testMakeTransientById() {
        System.out.println("makeTransientById");
        GenericHibernateDAO instance = new GenericHibernateDAO();
        instance.makeTransientById(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flush method, of class GenericHibernateDAO.
     */
    @Test
    public void testFlush() {
        System.out.println("flush");
        GenericHibernateDAO instance = new GenericHibernateDAO();
        instance.flush();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class GenericHibernateDAO.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        GenericHibernateDAO instance = new GenericHibernateDAO();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByCriteria method, of class GenericHibernateDAO.
     */
    @Test
    public void testFindByCriteria() {
        System.out.println("findByCriteria");
        Criterion[] criterion = null;
        GenericHibernateDAO instance = new GenericHibernateDAO();
        List expResult = null;
        List result = instance.findByCriteria(criterion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class GenericHibernateDAO.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Object entity = null;
        GenericHibernateDAO instance = new GenericHibernateDAO();
        instance.validate(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
