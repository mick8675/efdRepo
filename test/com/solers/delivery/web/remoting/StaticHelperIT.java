/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.remoting;

import java.util.List;
import java.util.Map;
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
public class StaticHelperIT {
    
    public StaticHelperIT() {
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
     * Test of getTimeIntervals method, of class StaticHelper.
     */
    @Test
    public void testGetTimeIntervals() {
        System.out.println("getTimeIntervals");
        StaticHelper instance = null;
        Map<String, String> expResult = null;
        Map<String, String> result = instance.getTimeIntervals();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileSizeUnits method, of class StaticHelper.
     */
    @Test
    public void testGetFileSizeUnits() {
        System.out.println("getFileSizeUnits");
        StaticHelper instance = null;
        Map<String, String> expResult = null;
        Map<String, String> result = instance.getFileSizeUnits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilterTypes method, of class StaticHelper.
     */
    @Test
    public void testGetFilterTypes() {
        System.out.println("getFilterTypes");
        StaticHelper instance = null;
        Map<String, String> expResult = null;
        Map<String, String> result = instance.getFilterTypes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentEventActions method, of class StaticHelper.
     */
    @Test
    public void testGetContentEventActions() {
        System.out.println("getContentEventActions");
        StaticHelper instance = null;
        List<String> expResult = null;
        List<String> result = instance.getContentEventActions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class StaticHelper.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        StaticHelper instance = null;
        Map<String, Object> expResult = null;
        Map<String, Object> result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
