/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.lucene;

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
@Suite.SuiteClasses({com.solers.delivery.lucene.SingleFieldSelectorIT.class, com.solers.delivery.lucene.OptimizeTaskIT.class, com.solers.delivery.lucene.LuceneLockCleanupTaskIT.class, com.solers.delivery.lucene.MultiFieldSelectorIT.class, com.solers.delivery.lucene.QueryBuilderIT.class, com.solers.delivery.lucene.LuceneHelperIT.class})
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
