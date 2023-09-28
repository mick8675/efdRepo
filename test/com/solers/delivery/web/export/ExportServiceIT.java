/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.export;

import java.io.File;
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
public class ExportServiceIT {
    
    public ExportServiceIT() {
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
     * Test of getExportPath method, of class ExportService.
     */
    @Test
    public void testGetExportPath() {
        System.out.println("getExportPath");
        ExportService instance = null;
        String expResult = "";
        String result = instance.getExportPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of export method, of class ExportService.
     */
    @Test
    public void testExport() {
        System.out.println("export");
        ExportService instance = null;
        instance.export(null,null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shutdown method, of class ExportService.
     */
    @Test
    public void testShutdown() {
        System.out.println("shutdown");
        ExportService instance = null;
        instance.shutdown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExportFile method, of class ExportService.
     */
    @Test
    public void testGetExportFile() {
        System.out.println("getExportFile");
        ExportService instance = null;
        File expResult = null;
        File result = instance.getExportFile(null,null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
