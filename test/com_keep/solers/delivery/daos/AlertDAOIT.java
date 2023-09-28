/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.daos;

import com.solers.delivery.domain.Alert;
import com.solers.util.Page;
import java.util.Collection;
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
public class AlertDAOIT {
    
    public AlertDAOIT() {
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
     * Test of listBy method, of class AlertDAO.
     */
    @Test
    public void testListBy() {
        System.out.println("listBy");
        Alert.AlertType type = null;
        int start = 0;
        int max = 0;
        AlertDAO instance = new AlertDAOImpl();
        Page<Alert> expResult = null;
        Page<Alert> result = instance.listBy(type, start, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeTransientById method, of class AlertDAO.
     */
    @Test
    public void testMakeTransientById() {
        System.out.println("makeTransientById");
        Collection<Long> ids = null;
        AlertDAO instance = new AlertDAOImpl();
        instance.makeTransientById(ids);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AlertDAOImpl implements AlertDAO {

        public Page<Alert> listBy(Alert.AlertType type, int start, int max) {
            return null;
        }

        public void makeTransientById(Collection<Long> ids) {
        }
    }

    public class AlertDAOImpl implements AlertDAO {

        public Page<Alert> listBy(Alert.AlertType type, int start, int max) {
            return null;
        }

        public void makeTransientById(Collection<Long> ids) {
        }
    }
    
}
