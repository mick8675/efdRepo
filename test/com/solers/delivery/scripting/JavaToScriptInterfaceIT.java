/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting;

import com.solers.delivery.scripting.event.DeliveryEventConsumer;
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
public class JavaToScriptInterfaceIT {
    
    public JavaToScriptInterfaceIT() {
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
     * Test of addConsumer method, of class JavaToScriptInterface.
     */
    @Test
    public void testAddConsumer() {
        System.out.println("addConsumer");
        DeliveryEventConsumer deliveryEventConsumer = null;
        JavaToScriptInterface instance = new JavaToScriptInterfaceImpl();
        instance.addConsumer(deliveryEventConsumer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startListening method, of class JavaToScriptInterface.
     */
    @Test
    public void testStartListening() throws Exception {
        System.out.println("startListening");
        long timeout = 0L;
        JavaToScriptInterface instance = new JavaToScriptInterfaceImpl();
        instance.startListening(timeout);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopListening method, of class JavaToScriptInterface.
     */
    @Test
    public void testStopListening() throws Exception {
        System.out.println("stopListening");
        DeliveryEventConsumer deliveryEventConsumer = null;
        JavaToScriptInterface instance = new JavaToScriptInterfaceImpl();
        instance.stopListening(deliveryEventConsumer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArguments method, of class JavaToScriptInterface.
     */
    @Test
    public void testGetArguments() {
        System.out.println("getArguments");
        JavaToScriptInterface instance = new JavaToScriptInterfaceImpl();
        String[] expResult = null;
        String[] result = instance.getArguments();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class JavaToScriptInterfaceImpl implements JavaToScriptInterface {

        public void addConsumer(DeliveryEventConsumer deliveryEventConsumer) {
        }

        public void startListening(long timeout) throws ScriptException {
        }

        public void stopListening(DeliveryEventConsumer deliveryEventConsumer) throws ScriptException {
        }

        public String[] getArguments() {
            return null;
        }
    }
    
}
