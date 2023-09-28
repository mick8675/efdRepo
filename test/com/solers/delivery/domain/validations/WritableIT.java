/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain.validations;

import java.lang.annotation.Annotation;
import javax.validation.Payload;
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
public class WritableIT {
    
    public WritableIT() {
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
     * Test of message method, of class Writable.
     */
    @Test
    public void testMessage() {
        System.out.println("message");
        Writable instance = new WritableImpl();
        String expResult = "";
        String result = instance.message();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of groups method, of class Writable.
     */
    @Test
    public void testGroups() {
        System.out.println("groups");
        Writable instance = new WritableImpl();
        Class[] expResult = null;
        Class[] result = instance.groups();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payload method, of class Writable.
     */
    @Test
    public void testPayload() {
        System.out.println("payload");
        Writable instance = new WritableImpl();
        Class[] expResult = null;
        Class[] result = instance.payload();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class WritableImpl implements Writable {

        public String message() {
            return "";
        }

        public Class<?>[] groups() {
            return null;
        }

        public Class<? extends Payload>[] payload() {
            return null;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
