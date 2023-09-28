/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain;

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
public class PendingDeleteIT {
    
    public PendingDeleteIT() {
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
     * Test of getId method, of class PendingDelete.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PendingDelete instance = new PendingDelete();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class PendingDelete.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        PendingDelete instance = new PendingDelete();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPath method, of class PendingDelete.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        PendingDelete instance = new PendingDelete();
        String expResult = "";
        String result = instance.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPath method, of class PendingDelete.
     */
    @Test
    public void testSetPath() {
        System.out.println("setPath");
        String path = "";
        PendingDelete instance = new PendingDelete();
        instance.setPath(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeMarkedForDeletion method, of class PendingDelete.
     */
    @Test
    public void testGetTimeMarkedForDeletion() {
        System.out.println("getTimeMarkedForDeletion");
        PendingDelete instance = new PendingDelete();
        Calendar expResult = null;
        Calendar result = instance.getTimeMarkedForDeletion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeMarkedForDeletion method, of class PendingDelete.
     */
    @Test
    public void testSetTimeMarkedForDeletion() {
        System.out.println("setTimeMarkedForDeletion");
        Calendar timeMarkedForDeletion = null;
        PendingDelete instance = new PendingDelete();
        instance.setTimeMarkedForDeletion(timeMarkedForDeletion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsumerContentSetId method, of class PendingDelete.
     */
    @Test
    public void testGetConsumerContentSetId() {
        System.out.println("getConsumerContentSetId");
        PendingDelete instance = new PendingDelete();
        Long expResult = null;
        Long result = instance.getConsumerContentSetId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConsumerContentSetId method, of class PendingDelete.
     */
    @Test
    public void testSetConsumerContentSetId() {
        System.out.println("setConsumerContentSetId");
        Long consumerContentSetId = null;
        PendingDelete instance = new PendingDelete();
        instance.setConsumerContentSetId(consumerContentSetId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
