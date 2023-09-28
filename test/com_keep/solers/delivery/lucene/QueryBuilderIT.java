/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.lucene;

import java.util.Date;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.search.Query;
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
public class QueryBuilderIT {
    
    public QueryBuilderIT() {
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
     * Test of addDate method, of class QueryBuilder.
     */
    @Test
    public void testAddDate() {
        System.out.println("addDate");
        String field = "";
        Date start = null;
        Date end = null;
        QueryBuilder instance = new QueryBuilder();
        QueryBuilder expResult = null;
        QueryBuilder result = instance.addDate(field, start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEquals method, of class QueryBuilder.
     */
    @Test
    public void testAddEquals() {
        System.out.println("addEquals");
        String field = "";
        String value = "";
        QueryBuilder instance = new QueryBuilder();
        QueryBuilder expResult = null;
        QueryBuilder result = instance.addEquals(field, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLike method, of class QueryBuilder.
     */
    @Test
    public void testAddLike() {
        System.out.println("addLike");
        String field = "";
        String value = "";
        QueryBuilder instance = new QueryBuilder();
        QueryBuilder expResult = null;
        QueryBuilder result = instance.addLike(field, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class QueryBuilder.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        QueryBuilder instance = new QueryBuilder();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toQuery method, of class QueryBuilder.
     */
    @Test
    public void testToQuery_0args() {
        System.out.println("toQuery");
        QueryBuilder instance = new QueryBuilder();
        Query expResult = null;
        Query result = instance.toQuery();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toQuery method, of class QueryBuilder.
     */
    @Test
    public void testToQuery_Analyzer() {
        System.out.println("toQuery");
        Analyzer analyer = null;
        QueryBuilder instance = new QueryBuilder();
        Query expResult = null;
        Query result = instance.toQuery(analyer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
