/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.lucene;

import java.io.Reader;
import org.apache.lucene.analysis.TokenStream;
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
public class PathAnalyzerIT {
    
    public PathAnalyzerIT() {
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
     * Test of tokenStream method, of class PathAnalyzer.
     */
    @Test
    public void testTokenStream() {
        System.out.println("tokenStream");
        String fieldName = "";
        Reader reader = null;
        PathAnalyzer instance = new PathAnalyzer();
        TokenStream expResult = null;
        TokenStream result = instance.tokenStream(fieldName, reader);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reusableTokenStream method, of class PathAnalyzer.
     */
    @Test
    public void testReusableTokenStream() throws Exception {
        System.out.println("reusableTokenStream");
        String fieldName = "";
        Reader reader = null;
        PathAnalyzer instance = new PathAnalyzer();
        TokenStream expResult = null;
        TokenStream result = instance.reusableTokenStream(fieldName, reader);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
