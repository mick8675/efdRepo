/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.remoting;

import com.solers.delivery.reports.history.ReportDetail;
import com.solers.delivery.reports.history.Synchronization;
import com.solers.util.Page;
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
public class SynchronizationHistoryHelperIT {
    
    public SynchronizationHistoryHelperIT() {
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
     * Test of resolve method, of class SynchronizationHistoryHelper.
     */
    @Test
    public void testResolve() {
        System.out.println("resolve");
        String ip = "";
        SynchronizationHistoryHelper instance = null;
        String expResult = "";
        String result = instance.resolve(ip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lookup method, of class SynchronizationHistoryHelper.
     */
    @Test
    public void testLookup() {
        System.out.println("lookup");
        String ip = "";
        SynchronizationHistoryHelper instance = null;
        String expResult = "";
        String result = instance.lookup(ip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSynchronizations method, of class SynchronizationHistoryHelper.
     */
    @Test
    public void testGetSynchronizations() {
        System.out.println("getSynchronizations");
        Long contentSetId = null;
        Date startTime = null;
        Date endTime = null;
        boolean showEmptyRecords = false;
        int startIndex = 0;
        int pageSize = 0;
        SynchronizationHistoryHelper instance = null;
        Page<Synchronization> expResult = null;
        Page<Synchronization> result = instance.getSynchronizations(contentSetId, startTime, endTime, showEmptyRecords, startIndex, pageSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSynchronizationDetails method, of class SynchronizationHistoryHelper.
     */
    @Test
    public void testGetSynchronizationDetails() {
        System.out.println("getSynchronizationDetails");
        Long contentSetId = null;
        String synchronizationId = "";
        String action = "";
        String path = "";
        int startIndex = 0;
        int pageSize = 0;
        SynchronizationHistoryHelper instance = null;
        Page<ReportDetail> expResult = null;
        Page<ReportDetail> result = instance.getSynchronizationDetails(contentSetId, synchronizationId, action, path, startIndex, pageSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
