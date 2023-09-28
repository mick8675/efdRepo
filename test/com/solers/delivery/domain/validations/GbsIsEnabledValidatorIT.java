/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain.validations;

import javax.validation.ConstraintValidatorContext;
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
public class GbsIsEnabledValidatorIT {
    
    public GbsIsEnabledValidatorIT() {
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
     * Test of isValid method, of class GbsIsEnabledValidator.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        Boolean gbsEnabled = null;
        ConstraintValidatorContext notused = null;
        GbsIsEnabledValidator instance = new GbsIsEnabledValidator();
        boolean expResult = false;
        boolean result = instance.isValid(gbsEnabled, notused);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class GbsIsEnabledValidator.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        GbsIsEnabled a = null;
        GbsIsEnabledValidator instance = new GbsIsEnabledValidator();
        instance.initialize(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
