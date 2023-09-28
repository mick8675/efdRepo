/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.export;

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
public class ExportDataIT {
    
    public ExportDataIT() {
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
     * Test of getHeader method, of class ExportData.
     */
    @Test
    public void testGetHeader() {
        System.out.println("getHeader");
        ExportData instance = new ExportDataImpl();
        String expResult = "";
        String result = instance.getHeader();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRow method, of class ExportData.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Object row = null;
        ExportData instance = new ExportDataImpl();
        String expResult = "";
        String result = instance.getRow(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExportFileName method, of class ExportData.
     */
    @Test
    public void testGetExportFileName() {
        System.out.println("getExportFileName");
        ExportData instance = new ExportDataImpl();
        String expResult = "";
        String result = instance.getExportFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ExportDataImpl implements ExportData {

        public String getHeader() {
            return "";
        }

        public String getRow(T row) {
            return "";
        }

        public String getExportFileName() {
            return "";
        }
    }

    public class ExportDataImpl implements ExportData {

        public String getHeader() {
            return "";
        }

        public String getRow(T row) {
            return "";
        }

        public String getExportFileName() {
            return "";
        }
    }
    
}
