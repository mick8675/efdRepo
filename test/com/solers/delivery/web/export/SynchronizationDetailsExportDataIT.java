/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.export;

import com.solers.delivery.reports.history.ReportDetail;
import java.util.Iterator;
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
public class SynchronizationDetailsExportDataIT {
    
    public SynchronizationDetailsExportDataIT() {
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
     * Test of getHeader method, of class SynchronizationDetailsExportData.
     */
    @Test
    public void testGetHeader() {
        System.out.println("getHeader");
        SynchronizationDetailsExportData instance = null;
        String expResult = "";
        String result = instance.getHeader();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRow method, of class SynchronizationDetailsExportData.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        ReportDetail row = null;
        SynchronizationDetailsExportData instance = null;
        String expResult = "";
        String result = instance.getRow(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class SynchronizationDetailsExportData.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        SynchronizationDetailsExportData instance = null;
        Iterator<ReportDetail> expResult = null;
        Iterator<ReportDetail> result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExportFileName method, of class SynchronizationDetailsExportData.
     */
    @Test
    public void testGetExportFileName() {
        System.out.println("getExportFileName");
        SynchronizationDetailsExportData instance = null;
        String expResult = "";
        String result = instance.getExportFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
