/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web;

import org.directwebremoting.extend.InboundVariable;
import org.directwebremoting.extend.OutboundContext;
import org.directwebremoting.extend.OutboundVariable;
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
public class EnumConverterIT {
    
    public EnumConverterIT() {
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
     * Test of convertInbound method, of class EnumConverter.
     */
    @Test
    public void testConvertInbound() {
        System.out.println("convertInbound");
        Class paramType = null;
        InboundVariable data = null;
        EnumConverter instance = new EnumConverter();
        Object expResult = null;
        Object result = instance.convertInbound(paramType, data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertOutbound method, of class EnumConverter.
     */
    @Test
    public void testConvertOutbound() {
        System.out.println("convertOutbound");
        Object data = null;
        OutboundContext ctx = null;
        EnumConverter instance = new EnumConverter();
        OutboundVariable expResult = null;
        OutboundVariable result = instance.convertOutbound(data, ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
