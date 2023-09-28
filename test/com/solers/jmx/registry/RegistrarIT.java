/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.jmx.registry;

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
public class RegistrarIT {
    
    public RegistrarIT() {
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
     * Test of getManagedBean method, of class Registrar.
     */
    @Test
    public void testGetManagedBean() {
        System.out.println("getManagedBean");
        Class type = null;
        Object key = null;
        Registrar instance = new RegistrarImpl();
        Object expResult = null;
        Object result = instance.getManagedBean(type, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerManagedBean method, of class Registrar.
     */
    @Test
    public void testRegisterManagedBean() {
        System.out.println("registerManagedBean");
        Object object = null;
        String typeCategory = "";
        Object key = null;
        Registrar instance = new RegistrarImpl();
        instance.registerManagedBean(object, typeCategory, key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RegistrarImpl implements Registrar {

        public <M> M getManagedBean(Class<? extends M> type, Object key) {
            return null;
        }

        public void registerManagedBean(Object object, String typeCategory, Object key) {
        }
    }
    
}
