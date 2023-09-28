/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.jmx;

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
public class LoggerServiceIT {
    
    public LoggerServiceIT() {
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
     * Test of getCurrentLevel method, of class LoggerService.
     */
    @Test
    public void testGetCurrentLevel() {
        System.out.println("getCurrentLevel");
        LoggerService instance = new LoggerServiceImpl();
        String expResult = "";
        String result = instance.getCurrentLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useInfo method, of class LoggerService.
     */
    @Test
    public void testUseInfo() {
        System.out.println("useInfo");
        LoggerService instance = new LoggerServiceImpl();
        instance.useInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useDebug method, of class LoggerService.
     */
    @Test
    public void testUseDebug() {
        System.out.println("useDebug");
        LoggerService instance = new LoggerServiceImpl();
        instance.useDebug();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useTrace method, of class LoggerService.
     */
    @Test
    public void testUseTrace() {
        System.out.println("useTrace");
        LoggerService instance = new LoggerServiceImpl();
        instance.useTrace();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useError method, of class LoggerService.
     */
    @Test
    public void testUseError() {
        System.out.println("useError");
        LoggerService instance = new LoggerServiceImpl();
        instance.useError();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useWarn method, of class LoggerService.
     */
    @Test
    public void testUseWarn() {
        System.out.println("useWarn");
        LoggerService instance = new LoggerServiceImpl();
        instance.useWarn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LoggerServiceImpl implements LoggerService {

        public String getCurrentLevel() {
            return "";
        }

        public void useInfo() {
        }

        public void useDebug() {
        }

        public void useTrace() {
        }

        public void useError() {
        }

        public void useWarn() {
        }
    }
    
}
