/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.spring;

import com.solers.util.unit.TimeIntervalUnit;
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
public class TimeIntervalUnitFactoryBeanIT {
    
    public TimeIntervalUnitFactoryBeanIT() {
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
     * Test of setValue method, of class TimeIntervalUnitFactoryBean.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        long value = 0L;
        TimeIntervalUnitFactoryBean instance = new TimeIntervalUnitFactoryBean();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSourceUnit method, of class TimeIntervalUnitFactoryBean.
     */
    @Test
    public void testSetSourceUnit() {
        System.out.println("setSourceUnit");
        TimeIntervalUnit sourceUnit = null;
        TimeIntervalUnitFactoryBean instance = new TimeIntervalUnitFactoryBean();
        instance.setSourceUnit(sourceUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDestUnit method, of class TimeIntervalUnitFactoryBean.
     */
    @Test
    public void testSetDestUnit() {
        System.out.println("setDestUnit");
        TimeIntervalUnit destUnit = null;
        TimeIntervalUnitFactoryBean instance = new TimeIntervalUnitFactoryBean();
        instance.setDestUnit(destUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObject method, of class TimeIntervalUnitFactoryBean.
     */
    @Test
    public void testGetObject() throws Exception {
        System.out.println("getObject");
        TimeIntervalUnitFactoryBean instance = new TimeIntervalUnitFactoryBean();
        Object expResult = null;
        Object result = instance.getObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectType method, of class TimeIntervalUnitFactoryBean.
     */
    @Test
    public void testGetObjectType() {
        System.out.println("getObjectType");
        TimeIntervalUnitFactoryBean instance = new TimeIntervalUnitFactoryBean();
        Class expResult = null;
        Class result = instance.getObjectType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSingleton method, of class TimeIntervalUnitFactoryBean.
     */
    @Test
    public void testIsSingleton() {
        System.out.println("isSingleton");
        TimeIntervalUnitFactoryBean instance = new TimeIntervalUnitFactoryBean();
        boolean expResult = false;
        boolean result = instance.isSingleton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
