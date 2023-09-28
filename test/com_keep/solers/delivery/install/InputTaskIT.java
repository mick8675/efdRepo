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
public class InputTaskIT {
    
    public InputTaskIT() {
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
     * Test of setNewPath method, of class InputTask.
     */
    @Test
    public void testSetNewPath() {
        System.out.println("setNewPath");
        boolean arg = false;
        InputTask instance = new InputTask();
        instance.setNewPath(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValidargs method, of class InputTask.
     */
    @Test
    public void testSetValidargs() {
        System.out.println("setValidargs");
        String validargs = "";
        InputTask instance = new InputTask();
        instance.setValidargs(validargs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddproperty method, of class InputTask.
     */
    @Test
    public void testSetAddproperty() {
        System.out.println("setAddproperty");
        String addproperty = "";
        InputTask instance = new InputTask();
        instance.setAddproperty(addproperty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class InputTask.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        InputTask instance = new InputTask();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDefaultvalue method, of class InputTask.
     */
    @Test
    public void testSetDefaultvalue() {
        System.out.println("setDefaultvalue");
        String defaultvalue = "";
        InputTask instance = new InputTask();
        instance.setDefaultvalue(defaultvalue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInputtype method, of class InputTask.
     */
    @Test
    public void testSetInputtype() {
        System.out.println("setInputtype");
        String inputType = "";
        InputTask instance = new InputTask();
        instance.setInputtype(inputType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addText method, of class InputTask.
     */
    @Test
    public void testAddText() {
        System.out.println("addText");
        String msg = "";
        InputTask instance = new InputTask();
        instance.addText(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class InputTask.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        InputTask instance = new InputTask();
        instance.execute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInputRequest method, of class InputTask.
     */
    @Test
    public void testGetInputRequest() {
        System.out.println("getInputRequest");
        InputTask instance = new InputTask();
        InputRequest expResult = null;
        InputRequest result = instance.getInputRequest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
