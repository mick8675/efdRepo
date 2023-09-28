/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.management;

import com.solers.delivery.content.status.CurrentSynchronization;
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
public class StatusServiceIT {
    
    public StatusServiceIT() {
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
     * Test of getSupplierStatus method, of class StatusService.
     */
    @Test
    public void testGetSupplierStatus() {
        System.out.println("getSupplierStatus");
        Long contentSetId = null;
        StatusService instance = new StatusServiceImpl();
        SupplierStatus expResult = null;
        SupplierStatus result = instance.getSupplierStatus(contentSetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsumerStatus method, of class StatusService.
     */
    @Test
    public void testGetConsumerStatus() {
        System.out.println("getConsumerStatus");
        Long contentSetId = null;
        StatusService instance = new StatusServiceImpl();
        ConsumerStatus expResult = null;
        ConsumerStatus result = instance.getConsumerStatus(contentSetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentSynchronizations method, of class StatusService.
     */
    @Test
    public void testGetCurrentSynchronizations() {
        System.out.println("getCurrentSynchronizations");
        StatusService instance = new StatusServiceImpl();
        List<CurrentSynchronization> expResult = null;
        List<CurrentSynchronization> result = instance.getCurrentSynchronizations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class StatusServiceImpl implements StatusService {

        public SupplierStatus getSupplierStatus(Long contentSetId) {
            return null;
        }

        public ConsumerStatus getConsumerStatus(Long contentSetId) {
            return null;
        }

        public List<CurrentSynchronization> getCurrentSynchronizations() {
            return null;
        }
    }
    
}
