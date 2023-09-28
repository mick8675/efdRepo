/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.alerts;

import com.solers.delivery.domain.Alert;
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
public class AlertManagerIT {
    
    public AlertManagerIT() {
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
     * Test of addListener method, of class AlertManager.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        AlertListener listener = null;
        AlertManager instance = null;
        instance.addListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeListener method, of class AlertManager.
     */
    @Test
    public void testRemoveListener() {
        System.out.println("removeListener");
        AlertListener listener = null;
        AlertManager instance = null;
        instance.removeListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onAlert method, of class AlertManager.
     */
    @Test
    public void testOnAlert() {
        System.out.println("onAlert");
        Alert alert = null;
        AlertManager instance = null;
        instance.onAlert(alert);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
