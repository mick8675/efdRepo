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
public class SynchronizationHistoryIT {
    
    public SynchronizationHistoryIT() {
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
     * Test of getSynchronizations method, of class SynchronizationHistory.
     */
    @Test
    public void testGetSynchronizations() {
        System.out.println("getSynchronizations");
        Long contentSetId = null;
        Date startTime = null;
        Date endTime = null;
        boolean showEmptyRecords = false;
        int pageSize = 0;
        SynchronizationHistory instance = new SynchronizationHistoryImpl();
        PaginatedList<Synchronization> expResult = null;
        PaginatedList<Synchronization> result = instance.getSynchronizations(contentSetId, startTime, endTime, showEmptyRecords, pageSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSynchronizationsAfter method, of class SynchronizationHistory.
     */
    @Test
    public void testGetSynchronizationsAfter() {
        System.out.println("getSynchronizationsAfter");
        Long contentSetId = null;
        Date endTime = null;
        boolean showEmptyRecords = false;
        int pageSize = 0;
        SynchronizationHistory instance = new SynchronizationHistoryImpl();
        PaginatedList<Synchronization> expResult = null;
        PaginatedList<Synchronization> result = instance.getSynchronizationsAfter(contentSetId, endTime, showEmptyRecords, pageSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSynchronizationDetails method, of class SynchronizationHistory.
     */
    @Test
    public void testGetSynchronizationDetails() {
        System.out.println("getSynchronizationDetails");
        Long contentSetId = null;
        String synchronizationId = "";
        String action = "";
        String path = "";
        int pageSize = 0;
        SynchronizationHistory instance = new SynchronizationHistoryImpl();
        PaginatedList<ReportDetail> expResult = null;
        PaginatedList<ReportDetail> result = instance.getSynchronizationDetails(contentSetId, synchronizationId, action, path, pageSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSynchronization method, of class SynchronizationHistory.
     */
    @Test
    public void testGetSynchronization() {
        System.out.println("getSynchronization");
        Long contentSetId = null;
        String id = "";
        SynchronizationHistory instance = new SynchronizationHistoryImpl();
        Synchronization expResult = null;
        Synchronization result = instance.getSynchronization(contentSetId, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SynchronizationHistoryImpl implements SynchronizationHistory {

        public PaginatedList<Synchronization> getSynchronizations(Long contentSetId, Date startTime, Date endTime, boolean showEmptyRecords, int pageSize) {
            return null;
        }

        public PaginatedList<Synchronization> getSynchronizationsAfter(Long contentSetId, Date endTime, boolean showEmptyRecords, int pageSize) {
            return null;
        }

        public PaginatedList<ReportDetail> getSynchronizationDetails(Long contentSetId, String synchronizationId, String action, String path, int pageSize) {
            return null;
        }

        public Synchronization getSynchronization(Long contentSetId, String id) {
            return null;
        }
    }

    public class SynchronizationHistoryImpl implements SynchronizationHistory {

        public PaginatedList<Synchronization> getSynchronizations(Long contentSetId, Date startTime, Date endTime, boolean showEmptyRecords, int pageSize) {
            return null;
        }

        public PaginatedList<Synchronization> getSynchronizationsAfter(Long contentSetId, Date endTime, boolean showEmptyRecords, int pageSize) {
            return null;
        }

        public PaginatedList<ReportDetail> getSynchronizationDetails(Long contentSetId, String synchronizationId, String action, String path, int pageSize) {
            return null;
        }

        public Synchronization getSynchronization(Long contentSetId, String id) {
            return null;
        }
    }
    
}
