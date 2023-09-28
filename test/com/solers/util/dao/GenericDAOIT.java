/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.dao;

import java.io.Serializable;
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
public class GenericDAOIT {
    
    public GenericDAOIT() {
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
     * Test of findById method, of class GenericDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Object id = null;
        boolean lock = false;
        GenericDAO instance = new GenericDAOImpl();
        Object expResult = null;
        Object result = instance.findById(null, lock);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class GenericDAO.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Object id = null;
        GenericDAO instance = new GenericDAOImpl();
        Object expResult = null;
        Object result = instance.getById(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class GenericDAO.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        GenericDAO instance = new GenericDAOImpl();
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByExample method, of class GenericDAO.
     */
    @Test
    public void testFindByExample() {
        System.out.println("findByExample");
        Object exampleInstance = null;
        String[] excludeProperty = null;
        GenericDAO instance = new GenericDAOImpl();
        List expResult = null;
        List result = instance.findByExample(exampleInstance, excludeProperty);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makePersistent method, of class GenericDAO.
     */
    @Test
    public void testMakePersistent() {
        System.out.println("makePersistent");
        Object entity = null;
        GenericDAO instance = new GenericDAOImpl();
        Object expResult = null;
        Object result = instance.makePersistent(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeTransient method, of class GenericDAO.
     */
    @Test
    public void testMakeTransient() {
        System.out.println("makeTransient");
        Object entity = null;
        GenericDAO instance = new GenericDAOImpl();
        instance.makeTransient(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flush method, of class GenericDAO.
     */
    @Test
    public void testFlush() {
        System.out.println("flush");
        GenericDAO instance = new GenericDAOImpl();
        instance.flush();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GenericDAOImpl implements GenericDAO {

        public Object findById(Object id, boolean lock) {
            return null;
        }

        public Object getById(Object id) {
            return null;
        }

        public List<Object> findAll() {
            return null;
        }

        public List<Object> findByExample(Object exampleInstance, String[] excludeProperty) {
            return null;
        }

        public Object makePersistent(Object entity) {
            return null;
        }

        public void makeTransient(Object entity) {
        }

        public void flush() {
        }

        @Override
        public Object findById(Serializable id, boolean lock) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Object getById(Serializable id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
