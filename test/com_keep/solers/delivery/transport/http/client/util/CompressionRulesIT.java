/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client.util;

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
public class CompressionRulesIT {
    
    public CompressionRulesIT() {
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
     * Test of setCompressibleExtensions method, of class CompressionRules.
     */
    @Test
    public void testSetCompressibleExtensions() {
        System.out.println("setCompressibleExtensions");
        String compressibleExtensions = "";
        CompressionRules instance = new CompressionRules();
        instance.setCompressibleExtensions(compressibleExtensions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinimumFileSizeBytes method, of class CompressionRules.
     */
    @Test
    public void testSetMinimumFileSizeBytes() {
        System.out.println("setMinimumFileSizeBytes");
        long minimumSizeBytes = 0L;
        CompressionRules instance = new CompressionRules();
        instance.setMinimumFileSizeBytes(minimumSizeBytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shouldBeCompressed method, of class CompressionRules.
     */
    @Test
    public void testShouldBeCompressed() {
        System.out.println("shouldBeCompressed");
        String path = "";
        long bytes = 0L;
        CompressionRules instance = new CompressionRules();
        boolean expResult = false;
        boolean result = instance.shouldBeCompressed(path, bytes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
