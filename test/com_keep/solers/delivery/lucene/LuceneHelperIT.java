/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.lucene;

import com.solers.lucene.DocumentResult;
import java.io.File;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.MergeScheduler;
import org.apache.lucene.search.Searchable;
import org.apache.lucene.store.Directory;
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
public class LuceneHelperIT {
    
    public LuceneHelperIT() {
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
     * Test of removeIndex method, of class LuceneHelper.
     */
    @Test
    public void testRemoveIndex() {
        System.out.println("removeIndex");
        long contentSetId = 0L;
        String syncId = "";
        LuceneHelper instance = null;
        instance.removeIndex(contentSetId, syncId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDocument method, of class LuceneHelper.
     */
    @Test
    public void testAddDocument_Directory_DocumentResult() throws Exception {
        System.out.println("addDocument");
        Directory index = null;
        DocumentResult r = null;
        LuceneHelper instance = null;
        instance.addDocument(index, r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDocument method, of class LuceneHelper.
     */
    @Test
    public void testAddDocument_Directory_Document() throws Exception {
        System.out.println("addDocument");
        Directory index = null;
        Document document = null;
        LuceneHelper instance = null;
        instance.addDocument(index, document);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDocument method, of class LuceneHelper.
     */
    @Test
    public void testAddDocument_3args() throws Exception {
        System.out.println("addDocument");
        Directory index = null;
        Document document = null;
        Analyzer analyzer = null;
        LuceneHelper instance = null;
        instance.addDocument(index, document, analyzer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDocument method, of class LuceneHelper.
     */
    @Test
    public void testAddDocument_4args() throws Exception {
        System.out.println("addDocument");
        Directory index = null;
        Document document = null;
        Analyzer analyzer = null;
        MergeScheduler scheduler = null;
        LuceneHelper instance = null;
        instance.addDocument(index, document, analyzer, scheduler);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexExists method, of class LuceneHelper.
     */
    @Test
    public void testIndexExists() {
        System.out.println("indexExists");
        Directory index = null;
        LuceneHelper instance = null;
        boolean expResult = false;
        boolean result = instance.indexExists(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndex method, of class LuceneHelper.
     */
    @Test
    public void testGetIndex_long() {
        System.out.println("getIndex");
        long contentSetId = 0L;
        LuceneHelper instance = null;
        Directory expResult = null;
        Directory result = instance.getIndex(contentSetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndex method, of class LuceneHelper.
     */
    @Test
    public void testGetIndex_long_String() {
        System.out.println("getIndex");
        long contentSetId = 0L;
        String syncId = "";
        LuceneHelper instance = null;
        Directory expResult = null;
        Directory result = instance.getIndex(contentSetId, syncId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndex method, of class LuceneHelper.
     */
    @Test
    public void testGetIndex_File() {
        System.out.println("getIndex");
        File index = null;
        Directory expResult = null;
        Directory result = LuceneHelper.getIndex(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of optimizeIndex method, of class LuceneHelper.
     */
    @Test
    public void testOptimizeIndex_long() {
        System.out.println("optimizeIndex");
        long contentSetId = 0L;
        LuceneHelper instance = null;
        instance.optimizeIndex(contentSetId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of optimizeIndex method, of class LuceneHelper.
     */
    @Test
    public void testOptimizeIndex_long_String() {
        System.out.println("optimizeIndex");
        long contentSetId = 0L;
        String syncId = "";
        LuceneHelper instance = null;
        instance.optimizeIndex(contentSetId, syncId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of optimizeIndex method, of class LuceneHelper.
     */
    @Test
    public void testOptimizeIndex_Directory() {
        System.out.println("optimizeIndex");
        Directory index = null;
        LuceneHelper instance = null;
        instance.optimizeIndex(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetDirectory method, of class LuceneHelper.
     */
    @Test
    public void testGetContentSetDirectory() {
        System.out.println("getContentSetDirectory");
        long contentSetId = 0L;
        LuceneHelper instance = null;
        File expResult = null;
        File result = instance.getContentSetDirectory(contentSetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventDirectory method, of class LuceneHelper.
     */
    @Test
    public void testGetEventDirectory() {
        System.out.println("getEventDirectory");
        LuceneHelper instance = null;
        File expResult = null;
        File result = instance.getEventDirectory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class LuceneHelper.
     */
    @Test
    public void testClose_Searchable() {
        System.out.println("close");
        Searchable s = null;
        LuceneHelper.close(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class LuceneHelper.
     */
    @Test
    public void testClose_IndexWriter() {
        System.out.println("close");
        IndexWriter writer = null;
        LuceneHelper.close(writer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class LuceneHelper.
     */
    @Test
    public void testClose_IndexReader() {
        System.out.println("close");
        IndexReader reader = null;
        LuceneHelper.close(reader);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
