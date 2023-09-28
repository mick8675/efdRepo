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
public class MBeanRegistrarIT {
    
    public MBeanRegistrarIT() {
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
     * Test of getManagedBean method, of class MBeanRegistrar.
     */
    @Test
    public void testGetManagedBean() {
        System.out.println("getManagedBean");
        Class mxbean = null;
        Object namingObject = null;
        MBeanRegistrar instance = new MBeanRegistrar();
        Object expResult = null;
        Object result = instance.getManagedBean(mxbean, namingObject);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerManagedBean method, of class MBeanRegistrar.
     */
    @Test
    public void testRegisterManagedBean() {
        System.out.println("registerManagedBean");
        Object object = null;
        String typeCategory = "";
        Object key = null;
        MBeanRegistrar instance = new MBeanRegistrar();
        instance.registerManagedBean(object, typeCategory, key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
