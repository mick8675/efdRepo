/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.daos;

import com.solers.delivery.domain.PendingDelete;
import java.util.Calendar;
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
public class PendingDeleteDAOIT {
    
    public PendingDeleteDAOIT() {
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
     * Test of getByPath method, of class PendingDeleteDAO.
     */
    @Test
    public void testGetByPath() {
        System.out.println("getByPath");
        Long consumerContentSetId = null;
        String path = "";
        PendingDeleteDAO instance = new PendingDeleteDAOImpl();
        PendingDelete expResult = null;
        PendingDelete result = instance.getByPath(consumerContentSetId, path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextToDelete method, of class PendingDeleteDAO.
     */
    @Test
    public void testGetNextToDelete() {
        System.out.println("getNextToDelete");
        Long consumerContentSetId = null;
        Calendar date = null;
        PendingDeleteDAO instance = new PendingDeleteDAOImpl();
        PendingDelete expResult = null;
        PendingDelete result = instance.getNextToDelete(consumerContentSetId, date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PendingDeleteDAOImpl implements PendingDeleteDAO {

        public PendingDelete getByPath(Long consumerContentSetId, String path) {
            return null;
        }

        public PendingDelete getNextToDelete(Long consumerContentSetId, Calendar date) {
            return null;
        }
    }

    public class PendingDeleteDAOImpl implements PendingDeleteDAO {

        public PendingDelete getByPath(Long consumerContentSetId, String path) {
            return null;
        }

        public PendingDelete getNextToDelete(Long consumerContentSetId, Calendar date) {
            return null;
        }
    }
    
}
