/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting;

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
public class ScriptExecutionTaskFactoryIT {
    
    public ScriptExecutionTaskFactoryIT() {
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
     * Test of setScriptingEventManagerAlias method, of class ScriptExecutionTaskFactory.
     */
    @Test
    public void testSetScriptingEventManagerAlias() {
        System.out.println("setScriptingEventManagerAlias");
        String eventManagerHookAlias = "";
        ScriptExecutionTaskFactory instance = new ScriptExecutionTaskFactory();
        instance.setScriptingEventManagerAlias(eventManagerHookAlias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newTask method, of class ScriptExecutionTaskFactory.
     */
    @Test
    public void testNewTask() throws Exception {
        System.out.println("newTask");
        ScriptUnit unit = null;
        ScriptExecutionTaskFactory instance = new ScriptExecutionTaskFactory();
        ScriptExecutionTask expResult = null;
        ScriptExecutionTask result = instance.newTask(unit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
