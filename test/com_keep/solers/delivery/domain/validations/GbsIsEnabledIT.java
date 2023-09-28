/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain.validations;

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
public class GbsIsEnabledIT {
    
    public GbsIsEnabledIT() {
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
     * Test of message method, of class GbsIsEnabled.
     */
    @Test
    public void testMessage() {
        System.out.println("message");
        GbsIsEnabled instance = new GbsIsEnabledImpl();
        String expResult = "";
        String result = instance.message();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of groups method, of class GbsIsEnabled.
     */
    @Test
    public void testGroups() {
        System.out.println("groups");
        GbsIsEnabled instance = new GbsIsEnabledImpl();
        Class[] expResult = null;
        Class[] result = instance.groups();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payload method, of class GbsIsEnabled.
     */
    @Test
    public void testPayload() {
        System.out.println("payload");
        GbsIsEnabled instance = new GbsIsEnabledImpl();
        Class[] expResult = null;
        Class[] result = instance.payload();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GbsIsEnabledImpl implements GbsIsEnabled {

        public String message() {
            return "";
        }

        public Class<?>[] groups() {
            return null;
        }

        public Class<? extends Payload>[] payload() {
            return null;
        }
    }

    public class GbsIsEnabledImpl implements GbsIsEnabled {

        public String message() {
            return "";
        }

        public Class<?>[] groups() {
            return null;
        }

        public Class<? extends Payload>[] payload() {
            return null;
        }
    }
    
}
