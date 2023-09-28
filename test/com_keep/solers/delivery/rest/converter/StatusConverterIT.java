/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.converter;

import com.solers.delivery.content.status.CurrentSynchronization;
import com.thoughtworks.xstream.XStream;
import java.util.List;
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
public class StatusConverterIT {
    
    public StatusConverterIT() {
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
     * Test of from method, of class StatusConverter.
     */
    @Test
    public void testFrom() throws Exception {
        System.out.println("from");
        StatusConverter instance = new StatusConverter();
        Object expResult = null;
        Object result = instance.from(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromList method, of class StatusConverter.
     */
    @Test
    public void testFromList() throws Exception {
        System.out.println("fromList");
        Representation r = null;
        StatusConverter instance = new StatusConverter();
        List<CurrentSynchronization> expResult = null;
        List<CurrentSynchronization> result = instance.fromList(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class StatusConverter.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        XStream stream = null;
        StatusConverter instance = new StatusConverter();
        XStream expResult = null;
        XStream result = instance.initialize(stream);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
