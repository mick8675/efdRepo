/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.alerts;

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
public class AlertServiceIT {
    
    public AlertServiceIT() {
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
     * Test of list method, of class AlertService.
     */
    @Test
    public void testList() {
        System.out.println("list");
        Alert.AlertType type = null;
        int startIndex = 0;
        int numRecords = 0;
        AlertService instance = new AlertServiceImpl();
        Page<Alert> expResult = null;
        Page<Alert> result = instance.list(type, startIndex, numRecords);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AlertService.
     */
    @Test
    public void testRemove_Long() {
        System.out.println("remove");
        Long id = null;
        AlertService instance = new AlertServiceImpl();
        instance.remove(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AlertService.
     */
    @Test
    public void testRemove_Collection() {
        System.out.println("remove");
        Collection<Long> ids = null;
        AlertService instance = new AlertServiceImpl();
        instance.remove(ids);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class AlertService.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Alert alert = null;
        AlertService instance = new AlertServiceImpl();
        instance.save(alert);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class AlertService.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Long id = null;
        AlertService instance = new AlertServiceImpl();
        Alert expResult = null;
        Alert result = instance.get(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AlertServiceImpl implements AlertService {

        public Page<Alert> list(Alert.AlertType type, int startIndex, int numRecords) {
            return null;
        }

        public void remove(Long id) {
        }

        public void remove(Collection<Long> ids) {
        }

        public void save(Alert alert) {
        }

        public Alert get(Long id) {
            return null;
        }
    }

    public class AlertServiceImpl implements AlertService {

        public Page<Alert> list(Alert.AlertType type, int startIndex, int numRecords) {
            return null;
        }

        public void remove(Long id) {
        }

        public void remove(Collection<Long> ids) {
        }

        public void save(Alert alert) {
        }

        public Alert get(Long id) {
            return null;
        }
    }

    public class AlertServiceImpl implements AlertService {

        public Page<Alert> list(Alert.AlertType type, int startIndex, int numRecords) {
            return null;
        }

        public void remove(Long id) {
        }

        public void remove(Collection<Long> ids) {
        }

        public void save(Alert alert) {
        }

        public Alert get(Long id) {
            return null;
        }
    }
    
}
