/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.combine;

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
public class ProcessorIT {
    
    public ProcessorIT() {
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
     * Test of process method, of class Processor.
     */
    @Test
    public void testProcess() {
        System.out.println("process");
        String input = "";
        Processor instance = new ProcessorImpl();
        String expResult = "";
        String result = instance.process(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ProcessorImpl implements Processor {

        public String process(String input) {
            return "";
        }
    }
    
}
