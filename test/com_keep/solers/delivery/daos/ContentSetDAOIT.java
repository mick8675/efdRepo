/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.daos;

import com.solers.delivery.domain.ContentSet;
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
public class ContentSetDAOIT {
    
    public ContentSetDAOIT() {
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
     * Test of getSupplierByName method, of class ContentSetDAO.
     */
    @Test
    public void testGetSupplierByName() {
        System.out.println("getSupplierByName");
        String name = "";
        ContentSetDAO instance = new ContentSetDAOImpl();
        ContentSet expResult = null;
        ContentSet result = instance.getSupplierByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupplierSets method, of class ContentSetDAO.
     */
    @Test
    public void testGetSupplierSets() {
        System.out.println("getSupplierSets");
        ContentSetDAO instance = new ContentSetDAOImpl();
        List<ContentSet> expResult = null;
        List<ContentSet> result = instance.getSupplierSets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ContentSetDAOImpl implements ContentSetDAO {

        public ContentSet getSupplierByName(String name) {
            return null;
        }

        public List<ContentSet> getSupplierSets() {
            return null;
        }
    }

    public class ContentSetDAOImpl implements ContentSetDAO {

        public ContentSet getSupplierByName(String name) {
            return null;
        }

        public List<ContentSet> getSupplierSets() {
            return null;
        }
    }
    
}
