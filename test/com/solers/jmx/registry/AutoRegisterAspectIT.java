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
public class AutoRegisterAspectIT {
    
    public AutoRegisterAspectIT() {
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
     * Test of setRegistrar method, of class AutoRegisterAspect.
     */
    @Test
    public void testSetRegistrar() {
        System.out.println("setRegistrar");
        Registrar registrar = null;
        AutoRegisterAspect instance = new AutoRegisterAspect();
        instance.setRegistrar(registrar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of advice method, of class AutoRegisterAspect.
     */
    @Test
    public void testAdvice() {
        System.out.println("advice");
        AutoRegister a = null;
        Object o = null;
        AutoRegisterAspect instance = new AutoRegisterAspect();
        instance.advice(a, o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class AutoRegisterAspect.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Object object = null;
        AutoRegisterAspect instance = new AutoRegisterAspect();
        instance.register(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
