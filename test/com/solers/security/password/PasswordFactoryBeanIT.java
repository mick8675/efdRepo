/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security.password;

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
public class PasswordFactoryBeanIT {
    
    public PasswordFactoryBeanIT() {
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
     * Test of setKey method, of class PasswordFactoryBean.
     */
    @Test
    public void testSetKey() {
        System.out.println("setKey");
        String key = "";
        PasswordFactoryBean instance = new PasswordFactoryBean();
        instance.setKey(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnumKey method, of class PasswordFactoryBean.
     */
    @Test
    public void testSetEnumKey() {
        System.out.println("setEnumKey");
        String arg = "";
        PasswordFactoryBean instance = new PasswordFactoryBean();
        instance.setEnumKey(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFieldKey method, of class PasswordFactoryBean.
     */
    @Test
    public void testSetFieldKey() {
        System.out.println("setFieldKey");
        String arg = "";
        PasswordFactoryBean instance = new PasswordFactoryBean();
        instance.setFieldKey(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProvider method, of class PasswordFactoryBean.
     */
    @Test
    public void testSetProvider() {
        System.out.println("setProvider");
        PasswordProvider provider = null;
        PasswordFactoryBean instance = new PasswordFactoryBean();
        instance.setProvider(provider);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObject method, of class PasswordFactoryBean.
     */
    @Test
    public void testGetObject() throws Exception {
        System.out.println("getObject");
        PasswordFactoryBean instance = new PasswordFactoryBean();
        Object expResult = null;
        Object result = instance.getObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectType method, of class PasswordFactoryBean.
     */
    @Test
    public void testGetObjectType() {
        System.out.println("getObjectType");
        PasswordFactoryBean instance = new PasswordFactoryBean();
        Class expResult = null;
        Class result = instance.getObjectType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSingleton method, of class PasswordFactoryBean.
     */
    @Test
    public void testIsSingleton() {
        System.out.println("isSingleton");
        PasswordFactoryBean instance = new PasswordFactoryBean();
        boolean expResult = false;
        boolean result = instance.isSingleton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
