/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.install;

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
public class ClasspathTaskIT {
    
    public ClasspathTaskIT() {
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
     * Test of addEntry method, of class ClasspathTask.
     */
    @Test
    public void testAddEntry() {
        System.out.println("addEntry");
        ClasspathTask.Entry entry = null;
        ClasspathTask instance = new ClasspathTask();
        instance.addEntry(entry);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createEntry method, of class ClasspathTask.
     */
    @Test
    public void testCreateEntry() {
        System.out.println("createEntry");
        ClasspathTask instance = new ClasspathTask();
        ClasspathTask.Entry expResult = null;
        ClasspathTask.Entry result = instance.createEntry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormat method, of class ClasspathTask.
     */
    @Test
    public void testSetFormat() {
        System.out.println("setFormat");
        String arg = "";
        ClasspathTask instance = new ClasspathTask();
        instance.setFormat(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProperty method, of class ClasspathTask.
     */
    @Test
    public void testSetProperty() {
        System.out.println("setProperty");
        String arg = "";
        ClasspathTask instance = new ClasspathTask();
        instance.setProperty(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class ClasspathTask.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        ClasspathTask instance = new ClasspathTask();
        instance.execute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
