/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain;

import java.util.Date;
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
public class AlertIT {
    
    public AlertIT() {
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
     * Test of getId method, of class Alert.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Alert instance = new Alert();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Alert.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Alert instance = new Alert();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestamp method, of class Alert.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        Alert instance = new Alert();
        Date expResult = null;
        Date result = instance.getTimestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimestamp method, of class Alert.
     */
    @Test
    public void testSetTimestamp() {
        System.out.println("setTimestamp");
        Date timestamp = null;
        Alert instance = new Alert();
        instance.setTimestamp(timestamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class Alert.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Alert instance = new Alert();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class Alert.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        Alert instance = new Alert();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Alert.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Alert instance = new Alert();
        Alert.AlertType expResult = null;
        Alert.AlertType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Alert.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        Alert.AlertType type = null;
        Alert instance = new Alert();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUnread method, of class Alert.
     */
    @Test
    public void testIsUnread() {
        System.out.println("isUnread");
        Alert instance = new Alert();
        boolean expResult = false;
        boolean result = instance.isUnread();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUnread method, of class Alert.
     */
    @Test
    public void testSetUnread() {
        System.out.println("setUnread");
        boolean unread = false;
        Alert instance = new Alert();
        instance.setUnread(unread);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
