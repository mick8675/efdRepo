/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.lucene;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.solers.lucene.ObjectCreatorIT.class, com.solers.lucene.PathAnalyzerIT.class, com.solers.lucene.PathTokenizerIT.class, com.solers.lucene.LuceneFieldIT.class, com.solers.lucene.IndexIT.class, com.solers.lucene.DocumentCreatorIT.class, com.solers.lucene.ConverterIT.class, com.solers.lucene.PaginatedHitsListIT.class, com.solers.lucene.DocumentResultIT.class})
public class LuceneITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
