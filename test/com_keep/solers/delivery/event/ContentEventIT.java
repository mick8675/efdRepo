/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.event;

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
public class ContentEventIT {
    
    public ContentEventIT() {
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
     * Test of isSuccessful method, of class ContentEvent.
     */
    @Test
    public void testIsSuccessful() {
        System.out.println("isSuccessful");
        ContentEvent instance = null;
        boolean expResult = false;
        boolean result = instance.isSuccessful();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class ContentEvent.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        ContentEvent instance = null;
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class ContentEvent.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        ContentEvent instance = null;
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetId method, of class ContentEvent.
     */
    @Test
    public void testGetContentSetId() {
        System.out.println("getContentSetId");
        ContentEvent instance = null;
        long expResult = 0L;
        long result = instance.getContentSetId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSynchronizationId method, of class ContentEvent.
     */
    @Test
    public void testGetSynchronizationId() {
        System.out.println("getSynchronizationId");
        ContentEvent instance = null;
        String expResult = "";
        String result = instance.getSynchronizationId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSynchronizationId method, of class ContentEvent.
     */
    @Test
    public void testSetSynchronizationId() {
        System.out.println("setSynchronizationId");
        String synchronizationId = "";
        ContentEvent instance = null;
        instance.setSynchronizationId(synchronizationId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesManipulated method, of class ContentEvent.
     */
    @Test
    public void testGetBytesManipulated() {
        System.out.println("getBytesManipulated");
        ContentEvent instance = null;
        long expResult = 0L;
        long result = instance.getBytesManipulated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesRequested method, of class ContentEvent.
     */
    @Test
    public void testGetBytesRequested() {
        System.out.println("getBytesRequested");
        ContentEvent instance = null;
        long expResult = 0L;
        long result = instance.getBytesRequested();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBytesRequested method, of class ContentEvent.
     */
    @Test
    public void testSetBytesRequested() {
        System.out.println("setBytesRequested");
        long bytesRequested = 0L;
        ContentEvent instance = null;
        instance.setBytesRequested(bytesRequested);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBytesManipulated method, of class ContentEvent.
     */
    @Test
    public void testSetBytesManipulated() {
        System.out.println("setBytesManipulated");
        long bytesTransfered = 0L;
        ContentEvent instance = null;
        instance.setBytesManipulated(bytesTransfered);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesFailed method, of class ContentEvent.
     */
    @Test
    public void testGetBytesFailed() {
        System.out.println("getBytesFailed");
        ContentEvent instance = null;
        long expResult = 0L;
        long result = instance.getBytesFailed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAction method, of class ContentEvent.
     */
    @Test
    public void testGetAction() {
        System.out.println("getAction");
        ContentEvent instance = null;
        String expResult = "";
        String result = instance.getAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActionValue method, of class ContentEvent.
     */
    @Test
    public void testGetActionValue() {
        System.out.println("getActionValue");
        ContentEvent instance = null;
        ContentEvent.ContentEventAction expResult = null;
        ContentEvent.ContentEventAction result = instance.getActionValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAction method, of class ContentEvent.
     */
    @Test
    public void testSetAction_ContentEventContentEventAction() {
        System.out.println("setAction");
        ContentEvent.ContentEventAction action = null;
        ContentEvent instance = null;
        instance.setAction(action);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAction method, of class ContentEvent.
     */
    @Test
    public void testSetAction_String() {
        System.out.println("setAction");
        String value = "";
        ContentEvent instance = null;
        instance.setAction(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultValue method, of class ContentEvent.
     */
    @Test
    public void testGetResultValue() {
        System.out.println("getResultValue");
        ContentEvent instance = null;
        ContentEvent.ContentEventResult expResult = null;
        ContentEvent.ContentEventResult result = instance.getResultValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class ContentEvent.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        ContentEvent instance = null;
        String expResult = "";
        String result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class ContentEvent.
     */
    @Test
    public void testSetResult_ContentEventContentEventResult() {
        System.out.println("setResult");
        ContentEvent.ContentEventResult result_2 = null;
        ContentEvent instance = null;
        instance.setResult(result_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class ContentEvent.
     */
    @Test
    public void testSetResult_String() {
        System.out.println("setResult");
        String result_2 = "";
        ContentEvent instance = null;
        instance.setResult(result_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPath method, of class ContentEvent.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        ContentEvent instance = null;
        String expResult = "";
        String result = instance.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPathKey method, of class ContentEvent.
     */
    @Test
    public void testGetPathKey() {
        System.out.println("getPathKey");
        ContentEvent instance = null;
        String expResult = "";
        String result = instance.getPathKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPath method, of class ContentEvent.
     */
    @Test
    public void testSetPath() {
        System.out.println("setPath");
        String path = "";
        ContentEvent instance = null;
        instance.setPath(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDirectory method, of class ContentEvent.
     */
    @Test
    public void testIsDirectory() {
        System.out.println("isDirectory");
        ContentEvent instance = null;
        boolean expResult = false;
        boolean result = instance.isDirectory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirectory method, of class ContentEvent.
     */
    @Test
    public void testSetDirectory() {
        System.out.println("setDirectory");
        boolean directory = false;
        ContentEvent instance = null;
        instance.setDirectory(directory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPathMtime method, of class ContentEvent.
     */
    @Test
    public void testGetPathMtime() {
        System.out.println("getPathMtime");
        ContentEvent instance = null;
        long expResult = 0L;
        long result = instance.getPathMtime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPathMtime method, of class ContentEvent.
     */
    @Test
    public void testSetPathMtime() {
        System.out.println("setPathMtime");
        long pathMtime = 0L;
        ContentEvent instance = null;
        instance.setPathMtime(pathMtime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentSize method, of class ContentEvent.
     */
    @Test
    public void testGetCurrentSize() {
        System.out.println("getCurrentSize");
        ContentEvent instance = null;
        long expResult = 0L;
        long result = instance.getCurrentSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentSize method, of class ContentEvent.
     */
    @Test
    public void testSetCurrentSize() {
        System.out.println("setCurrentSize");
        long currentSize = 0L;
        ContentEvent instance = null;
        instance.setCurrentSize(currentSize);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetName method, of class ContentEvent.
     */
    @Test
    public void testGetContentSetName() {
        System.out.println("getContentSetName");
        ContentEvent instance = null;
        String expResult = "";
        String result = instance.getContentSetName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContentSetName method, of class ContentEvent.
     */
    @Test
    public void testSetContentSetName() {
        System.out.println("setContentSetName");
        String contentSetName = "";
        ContentEvent instance = null;
        instance.setContentSetName(contentSetName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHostname method, of class ContentEvent.
     */
    @Test
    public void testGetHostname() {
        System.out.println("getHostname");
        ContentEvent instance = null;
        String expResult = "";
        String result = instance.getHostname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHostname method, of class ContentEvent.
     */
    @Test
    public void testSetHostname() {
        System.out.println("setHostname");
        String hostname = "";
        ContentEvent instance = null;
        instance.setHostname(hostname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ContentEvent.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ContentEvent instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
