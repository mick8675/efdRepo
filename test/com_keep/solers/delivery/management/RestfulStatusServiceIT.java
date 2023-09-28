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
public class RestfulStatusServiceIT {
    
    public RestfulStatusServiceIT() {
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
     * Test of getConsumerStatus method, of class RestfulStatusService.
     */
    @Test
    public void testGetConsumerStatus() {
        System.out.println("getConsumerStatus");
        Long contentSetId = null;
        RestfulStatusService instance = null;
        ConsumerStatus expResult = null;
        ConsumerStatus result = instance.getConsumerStatus(contentSetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupplierStatus method, of class RestfulStatusService.
     */
    @Test
    public void testGetSupplierStatus() {
        System.out.println("getSupplierStatus");
        Long contentSetId = null;
        RestfulStatusService instance = null;
        SupplierStatus expResult = null;
        SupplierStatus result = instance.getSupplierStatus(contentSetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentSynchronizations method, of class RestfulStatusService.
     */
    @Test
    public void testGetCurrentSynchronizations() {
        System.out.println("getCurrentSynchronizations");
        RestfulStatusService instance = null;
        List<CurrentSynchronization> expResult = null;
        List<CurrentSynchronization> result = instance.getCurrentSynchronizations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convert method, of class RestfulStatusService.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        RestfulStatusService instance = null;
        Object expResult = null;
        Object result = instance.convert(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
