/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.reports.history;

import com.solers.util.PaginatedList;
import java.util.Date;
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
public class LuceneSynchronizationHistoryIT {
    
    public LuceneSynchronizationHistoryIT() {
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
     * Test of getSynchronization method, of class LuceneSynchronizationHistory.
     */
    @Test
    public void testGetSynchronization() {
        System.out.println("getSynchronization");
        Long contentSetId = null;
        String id = "";
        LuceneSynchronizationHistory instance = null;
        Synchronization expResult = null;
        Synchronization result = instance.getSynchronization(contentSetId, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSynchronizationDetails method, of class LuceneSynchronizationHistory.
     */
    @Test
    public void testGetSynchronizationDetails() {
        System.out.println("getSynchronizationDetails");
        Long contentSetId = null;
        String synchronizationId = "";
        String action = "";
        String path = "";
        int pageSize = 0;
        LuceneSynchronizationHistory instance = null;
        PaginatedList<ReportDetail> expResult = null;
        PaginatedList<ReportDetail> result = instance.getSynchronizationDetails(contentSetId, synchronizationId, action, path, pageSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSynchronizationsAfter method, of class LuceneSynchronizationHistory.
     */
    @Test
    public void testGetSynchronizationsAfter() {
        System.out.println("getSynchronizationsAfter");
        Long contentSetId = null;
        Date endTime = null;
        boolean showEmptyRecords = false;
        int pageSize = 0;
        LuceneSynchronizationHistory instance = null;
        PaginatedList<Synchronization> expResult = null;
        PaginatedList<Synchronization> result = instance.getSynchronizationsAfter(contentSetId, endTime, showEmptyRecords, pageSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSynchronizations method, of class LuceneSynchronizationHistory.
     */
    @Test
    public void testGetSynchronizations() {
        System.out.println("getSynchronizations");
        Long contentSetId = null;
        Date startTime = null;
        Date endTime = null;
        boolean showEmptyRecords = false;
        int pageSize = 0;
        LuceneSynchronizationHistory instance = null;
        PaginatedList<Synchronization> expResult = null;
        PaginatedList<Synchronization> result = instance.getSynchronizations(contentSetId, startTime, endTime, showEmptyRecords, pageSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
