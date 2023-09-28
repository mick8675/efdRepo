/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.lucene;

import java.lang.annotation.Annotation;
import org.apache.lucene.analysis.Analyzer;
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
public class LuceneFieldIT {
    
    public LuceneFieldIT() {
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
     * Test of store method, of class LuceneField.
     */
    @Test
    public void testStore() {
        System.out.println("store");
        LuceneField instance = new LuceneFieldImpl();
        boolean expResult = false;
        boolean result = instance.store();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of index method, of class LuceneField.
     */
    @Test
    public void testIndex() {
        System.out.println("index");
        LuceneField instance = new LuceneFieldImpl();
        Index expResult = null;
        Index result = instance.index();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of converter method, of class LuceneField.
     */
    @Test
    public void testConverter() {
        System.out.println("converter");
        LuceneField instance = new LuceneFieldImpl();
        Converter expResult = null;
        Converter result = instance.converter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of name method, of class LuceneField.
     */
    @Test
    public void testName() {
        System.out.println("name");
        LuceneField instance = new LuceneFieldImpl();
        String expResult = "";
        String result = instance.name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of analyzer method, of class LuceneField.
     */
    @Test
    public void testAnalyzer() {
        System.out.println("analyzer");
        LuceneField instance = new LuceneFieldImpl();
        Class<? extends Analyzer> expResult = null;
        Class<? extends Analyzer> result = instance.analyzer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LuceneFieldImpl implements LuceneField {

        public boolean store() {
            return false;
        }

        public Index index() {
            return null;
        }

        public Converter converter() {
            return null;
        }

        public String name() {
            return "";
        }

        public Class<? extends Analyzer> analyzer() {
            return null;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
