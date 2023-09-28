/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.util;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
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
public class FileBackedQueueIT {
    
    public FileBackedQueueIT() {
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
     * Test of getFileBacking method, of class FileBackedQueue.
     */
    @Test
    public void testGetFileBacking() {
        System.out.println("getFileBacking");
        FileBackedQueue instance = new FileBackedQueue();
        File expResult = null;
        File result = instance.getFileBacking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class FileBackedQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class FileBackedQueue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        FileBackedQueue instance = new FileBackedQueue();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalize method, of class FileBackedQueue.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        FileBackedQueue instance = new FileBackedQueue();
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class FileBackedQueue.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object e = null;
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of element method, of class FileBackedQueue.
     */
    @Test
    public void testElement() {
        System.out.println("element");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.element();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of offer method, of class FileBackedQueue.
     */
    @Test
    public void testOffer() {
        System.out.println("offer");
        Object e = null;
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.offer(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class FileBackedQueue.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poll method, of class FileBackedQueue.
     */
    @Test
    public void testPoll() {
        System.out.println("poll");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.poll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class FileBackedQueue.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class FileBackedQueue.
     */
    @Test
    public void testAddAll() {
        System.out.println("addAll");
        Collection c = null;
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.addAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class FileBackedQueue.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        FileBackedQueue instance = new FileBackedQueue();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class FileBackedQueue.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object o = null;
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.contains(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsAll method, of class FileBackedQueue.
     */
    @Test
    public void testContainsAll() {
        System.out.println("containsAll");
        Collection c = null;
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.containsAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class FileBackedQueue.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        FileBackedQueue instance = new FileBackedQueue();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class FileBackedQueue.
     */
    @Test
    public void testRemove_Object() {
        System.out.println("remove");
        Object o = null;
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.remove(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class FileBackedQueue.
     */
    @Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        Collection c = null;
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.removeAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retainAll method, of class FileBackedQueue.
     */
    @Test
    public void testRetainAll() {
        System.out.println("retainAll");
        Collection c = null;
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.retainAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class FileBackedQueue.
     */
    @Test
    public void testToArray_0args() {
        System.out.println("toArray");
        FileBackedQueue instance = new FileBackedQueue();
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class FileBackedQueue.
     */
    @Test
    public void testToArray_GenericType() {
        System.out.println("toArray");
        Object[] a = null;
        FileBackedQueue instance = new FileBackedQueue();
        Object[] expResult = null;
        Object[] result = instance.toArray(a);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class FileBackedQueue.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object e = null;
        FileBackedQueue instance = new FileBackedQueue();
        instance.addFirst(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class FileBackedQueue.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object e = null;
        FileBackedQueue instance = new FileBackedQueue();
        instance.addLast(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of descendingIterator method, of class FileBackedQueue.
     */
    @Test
    public void testDescendingIterator() {
        System.out.println("descendingIterator");
        FileBackedQueue instance = new FileBackedQueue();
        Iterator expResult = null;
        Iterator result = instance.descendingIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class FileBackedQueue.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class FileBackedQueue.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of offerFirst method, of class FileBackedQueue.
     */
    @Test
    public void testOfferFirst() {
        System.out.println("offerFirst");
        Object e = null;
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.offerFirst(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of offerLast method, of class FileBackedQueue.
     */
    @Test
    public void testOfferLast() {
        System.out.println("offerLast");
        Object e = null;
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.offerLast(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peekFirst method, of class FileBackedQueue.
     */
    @Test
    public void testPeekFirst() {
        System.out.println("peekFirst");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.peekFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peekLast method, of class FileBackedQueue.
     */
    @Test
    public void testPeekLast() {
        System.out.println("peekLast");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.peekLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pollFirst method, of class FileBackedQueue.
     */
    @Test
    public void testPollFirst() {
        System.out.println("pollFirst");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.pollFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pollLast method, of class FileBackedQueue.
     */
    @Test
    public void testPollLast() {
        System.out.println("pollLast");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.pollLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class FileBackedQueue.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class FileBackedQueue.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object e = null;
        FileBackedQueue instance = new FileBackedQueue();
        instance.push(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class FileBackedQueue.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirstOccurrence method, of class FileBackedQueue.
     */
    @Test
    public void testRemoveFirstOccurrence() {
        System.out.println("removeFirstOccurrence");
        Object o = null;
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.removeFirstOccurrence(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class FileBackedQueue.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        FileBackedQueue instance = new FileBackedQueue();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLastOccurrence method, of class FileBackedQueue.
     */
    @Test
    public void testRemoveLastOccurrence() {
        System.out.println("removeLastOccurrence");
        Object o = null;
        FileBackedQueue instance = new FileBackedQueue();
        boolean expResult = false;
        boolean result = instance.removeLastOccurrence(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
