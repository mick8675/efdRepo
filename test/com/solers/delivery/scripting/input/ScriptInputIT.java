/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.scripting.input;

import com.thoughtworks.xstream.XStream;
import java.util.List;
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
public class ScriptInputIT {
    
    public ScriptInputIT() {
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
     * Test of getDirectoryList method, of class ScriptInput.
     */
    @Test
    public void testGetDirectoryList() {
        System.out.println("getDirectoryList");
        ScriptInput instance = new ScriptInput();
        List<ScriptInput.DirectoryRecord> expResult = null;
        List<ScriptInput.DirectoryRecord> result = instance.getDirectoryList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirectoryList method, of class ScriptInput.
     */
    @Test
    public void testSetDirectoryList() {
        System.out.println("setDirectoryList");
        List<ScriptInput.DirectoryRecord> directoryList = null;
        ScriptInput instance = new ScriptInput();
        instance.setDirectoryList(directoryList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignGroupId method, of class ScriptInput.
     */
    @Test
    public void testAssignGroupId() {
        System.out.println("assignGroupId");
        int startNumber = 0;
        ScriptInput instance = new ScriptInput();
        instance.assignGroupId(startNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class ScriptInput.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        ScriptInput instance = new ScriptInput();
        List<String> expResult = null;
        List<String> result = instance.validate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toXml method, of class ScriptInput.
     */
    @Test
    public void testToXml() {
        System.out.println("toXml");
        ScriptInput instance = new ScriptInput();
        String expResult = "";
        String result = instance.toXml();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromXml method, of class ScriptInput.
     */
    @Test
    public void testFromXml() {
        System.out.println("fromXml");
        String xml = "";
        ScriptInput expResult = null;
        ScriptInput result = ScriptInput.fromXml(xml);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeToFile method, of class ScriptInput.
     */
    @Test
    public void testWriteToFile() throws Exception {
        System.out.println("writeToFile");
        String fileName = "";
        ScriptInput instance = new ScriptInput();
        instance.writeToFile(fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readFromFile method, of class ScriptInput.
     */
    @Test
    public void testReadFromFile() throws Exception {
        System.out.println("readFromFile");
        String fileName = "";
        ScriptInput expResult = null;
        ScriptInput result = ScriptInput.readFromFile(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createXStream method, of class ScriptInput.
     */
    @Test
    public void testCreateXStream() {
        System.out.println("createXStream");
        XStream expResult = null;
        XStream result = ScriptInput.createXStream();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateSampleXmlFile method, of class ScriptInput.
     */
    @Test
    public void testGenerateSampleXmlFile() throws Exception {
        System.out.println("generateSampleXmlFile");
        String fileName = "";
        ScriptInput.generateSampleXmlFile(fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
