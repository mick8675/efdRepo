/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain.validations;

import com.solers.delivery.domain.ScheduleExpression;
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
public class ValidScheduleDurationValidatorIT {
    
    public ValidScheduleDurationValidatorIT() {
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
     * Test of isValid method, of class ValidScheduleDurationValidator.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        ScheduleExpression expression = null;
        ConstraintValidatorContext unused = null;
        ValidScheduleDurationValidator instance = new ValidScheduleDurationValidator();
        boolean expResult = false;
        boolean result = instance.isValid(expression, unused);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class ValidScheduleDurationValidator.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        ValidScheduleDuration a = null;
        ValidScheduleDurationValidator instance = new ValidScheduleDurationValidator();
        instance.initialize(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
