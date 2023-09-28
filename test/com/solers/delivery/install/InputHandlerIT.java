/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.install;

import org.apache.tools.ant.input.InputRequest;
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
public class InputHandlerIT {
    
    public InputHandlerIT() {
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
     * Test of handleInput method, of class InputHandler.
     */
    @Test
    public void testHandleInput() {
        System.out.println("handleInput");
        InputRequest request = null;
        InputHandler instance = new InputHandler();
        instance.handleInput(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handlePasswordInput method, of class InputHandler.
     */
    @Test
    public void testHandlePasswordInput() {
        System.out.println("handlePasswordInput");
        InputRequest request = null;
        InputHandler instance = new InputHandler();
        instance.handlePasswordInput(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
