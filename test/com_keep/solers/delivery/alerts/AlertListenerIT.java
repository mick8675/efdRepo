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
public class AlertListenerIT {
    
    public AlertListenerIT() {
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
     * Test of onAlert method, of class AlertListener.
     */
    @Test
    public void testOnAlert() {
        System.out.println("onAlert");
        Alert alert = null;
        AlertListener instance = new AlertListenerImpl();
        instance.onAlert(alert);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AlertListenerImpl implements AlertListener {

        public void onAlert(Alert alert) {
        }
    }

    public class AlertListenerImpl implements AlertListener {

        public void onAlert(Alert alert) {
        }
    }

    public class AlertListenerImpl implements AlertListener {

        public void onAlert(Alert alert) {
        }
    }
    
}
