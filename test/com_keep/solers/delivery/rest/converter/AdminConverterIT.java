/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.converter;

import com.solers.delivery.domain.User;
import com.thoughtworks.xstream.XStream;
import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.restlet.resource.Representation;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class AdminConverterIT {
    
    public AdminConverterIT() {
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
     * Test of convertUser method, of class AdminConverter.
     */
    @Test
    public void testConvertUser() {
        System.out.println("convertUser");
        Representation r = null;
        AdminConverter instance = null;
        User expResult = null;
        User result = instance.convertUser(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertPasswords method, of class AdminConverter.
     */
    @Test
    public void testConvertPasswords() {
        System.out.println("convertPasswords");
        Representation r = null;
        AdminConverter instance = null;
        String[] expResult = null;
        String[] result = instance.convertPasswords(r);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class AdminConverter.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        XStream stream = null;
        AdminConverter instance = null;
        XStream expResult = null;
        XStream result = instance.initialize(stream);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInputStream method, of class AdminConverter.
     */
    @Test
    public void testGetInputStream() {
        System.out.println("getInputStream");
        Representation r = null;
        AdminConverter instance = null;
        InputStream expResult = null;
        InputStream result = instance.getInputStream(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AdminConverter.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        XStream stream = null;
        Object arg = null;
        AdminConverter instance = null;
        String expResult = "";
        String result = instance.toString(stream, arg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
