/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.converter;

import com.thoughtworks.xstream.XStream;
import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.restlet.data.MediaType;
import org.restlet.resource.Representation;
import org.restlet.resource.Variant;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class ConverterIT {
    
    public ConverterIT() {
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
     * Test of registerStream method, of class Converter.
     */
    @Test
    public void testRegisterStream() {
        System.out.println("registerStream");
        MediaType mediaType = null;
        XStream stream = null;
        Converter instance = new Converter();
        instance.registerStream(mediaType, stream);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of to method, of class Converter.
     */
    @Test
    public void testTo_Variant_Object() {
        System.out.println("to");
        Variant variant = null;
        Object arg = null;
        Converter instance = new Converter();
        Representation expResult = null;
        Representation result = instance.to(variant, arg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of to method, of class Converter.
     */
    @Test
    public void testTo_MediaType_Object() {
        System.out.println("to");
        MediaType mediaType = null;
        Object arg = null;
        Converter instance = new Converter();
        Representation expResult = null;
        Representation result = instance.to(mediaType, arg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStream method, of class Converter.
     */
    @Test
    public void testGetStream() {
        System.out.println("getStream");
        MediaType mediaType = null;
        Converter instance = new Converter();
        XStream expResult = null;
        XStream result = instance.getStream(mediaType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convert method, of class Converter.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        Representation r = null;
        Converter instance = new Converter();
        Object expResult = null;
        Object result = instance.convert(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class Converter.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        XStream stream = null;
        Converter instance = new Converter();
        XStream expResult = null;
        XStream result = instance.initialize(stream);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInputStream method, of class Converter.
     */
    @Test
    public void testGetInputStream() throws Exception {
        System.out.println("getInputStream");
        Representation r = null;
        Converter instance = new Converter();
        InputStream expResult = null;
        InputStream result = instance.getInputStream(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Converter.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        XStream stream = null;
        Object arg = null;
        Converter instance = new Converter();
        String expResult = "";
        String result = instance.toString(stream, arg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
