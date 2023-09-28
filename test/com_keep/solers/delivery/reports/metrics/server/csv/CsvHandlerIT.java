/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.reports.metrics.server.csv;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.xml.sax.Attributes;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class CsvHandlerIT {
    
    public CsvHandlerIT() {
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
     * Test of characters method, of class CsvHandler.
     */
    @Test
    public void testCharacters() throws Exception {
        System.out.println("characters");
        char[] ch = null;
        int start = 0;
        int length = 0;
        CsvHandler instance = null;
        instance.characters(ch, start, length);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endElement method, of class CsvHandler.
     */
    @Test
    public void testEndElement() throws Exception {
        System.out.println("endElement");
        String uri = "";
        String localName = "";
        String name = "";
        CsvHandler instance = null;
        instance.endElement(uri, localName, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startElement method, of class CsvHandler.
     */
    @Test
    public void testStartElement() throws Exception {
        System.out.println("startElement");
        String uri = "";
        String localName = "";
        String name = "";
        Attributes attributes = null;
        CsvHandler instance = null;
        instance.startElement(uri, localName, name, attributes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endDocument method, of class CsvHandler.
     */
    @Test
    public void testEndDocument() throws Exception {
        System.out.println("endDocument");
        CsvHandler instance = null;
        instance.endDocument();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
