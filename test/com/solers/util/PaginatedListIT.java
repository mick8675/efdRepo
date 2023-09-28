/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
public class PaginatedListIT {
    
    public PaginatedListIT() {
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
     * Test of emptyList method, of class PaginatedList.
     */
    @Test
    public void testEmptyList() {
        System.out.println("emptyList");
        PaginatedList expResult = null;
        PaginatedList result = PaginatedList.emptyList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subList method, of class PaginatedList.
     */
    @Test
    public void testSubList_int() {
        System.out.println("subList");
        int fromIndex = 0;
        PaginatedList instance = null;
        List expResult = null;
        List result = instance.subList(fromIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class PaginatedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PaginatedList instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class PaginatedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PaginatedList instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class PaginatedList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        PaginatedList instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subList method, of class PaginatedList.
     */
    @Test
    public void testSubList_int_int() {
        System.out.println("subList");
        int fromIndex = 0;
        int toIndex = 0;
        PaginatedList instance = null;
        List expResult = null;
        List result = instance.subList(fromIndex, toIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class PaginatedList.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        PaginatedList instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialized method, of class PaginatedList.
     */
    @Test
    public void testInitialized() {
        System.out.println("initialized");
        int size = 0;
        PaginatedList instance = null;
        instance.initialized(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkInitialized method, of class PaginatedList.
     */
    @Test
    public void testCheckInitialized() {
        System.out.println("checkInitialized");
        PaginatedList instance = null;
        instance.checkInitialized();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPageSize method, of class PaginatedList.
     */
    @Test
    public void testGetPageSize() {
        System.out.println("getPageSize");
        PaginatedList instance = null;
        int expResult = 0;
        int result = instance.getPageSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class PaginatedList.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        PaginatedList instance = null;
        instance.initialize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubList method, of class PaginatedList.
     */
    @Test
    public void testGetSubList() {
        System.out.println("getSubList");
        int fromIndex = 0;
        int toIndex = 0;
        PaginatedList instance = null;
        List expResult = null;
        List result = instance.getSubList(fromIndex, toIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class PaginatedList.
     */
    @Test
    public void testAdd_int_GenericType() {
        System.out.println("add");
        int index = 0;
        Object element = null;
        PaginatedList instance = null;
        instance.add(index, element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class PaginatedList.
     */
    @Test
    public void testAddAll_int_Collection() {
        System.out.println("addAll");
        int index = 0;
        Collection c = null;
        PaginatedList instance = null;
        boolean expResult = false;
        boolean result = instance.addAll(index, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class PaginatedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        PaginatedList instance = null;
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class PaginatedList.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object o = null;
        PaginatedList instance = null;
        int expResult = 0;
        int result = instance.indexOf(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastIndexOf method, of class PaginatedList.
     */
    @Test
    public void testLastIndexOf() {
        System.out.println("lastIndexOf");
        Object o = null;
        PaginatedList instance = null;
        int expResult = 0;
        int result = instance.lastIndexOf(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listIterator method, of class PaginatedList.
     */
    @Test
    public void testListIterator_0args() {
        System.out.println("listIterator");
        PaginatedList instance = null;
        ListIterator expResult = null;
        ListIterator result = instance.listIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listIterator method, of class PaginatedList.
     */
    @Test
    public void testListIterator_int() {
        System.out.println("listIterator");
        int index = 0;
        PaginatedList instance = null;
        ListIterator expResult = null;
        ListIterator result = instance.listIterator(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class PaginatedList.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        PaginatedList instance = null;
        Object expResult = null;
        Object result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class PaginatedList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int index = 0;
        Object element = null;
        PaginatedList instance = null;
        Object expResult = null;
        Object result = instance.set(index, element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class PaginatedList.
     */
    @Test
    public void testAdd_GenericType() {
        System.out.println("add");
        Object o = null;
        PaginatedList instance = null;
        boolean expResult = false;
        boolean result = instance.add(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class PaginatedList.
     */
    @Test
    public void testAddAll_Collection() {
        System.out.println("addAll");
        Collection c = null;
        PaginatedList instance = null;
        boolean expResult = false;
        boolean result = instance.addAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class PaginatedList.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        PaginatedList instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class PaginatedList.
     */
    @Test
    public void testRemove_Object() {
        System.out.println("remove");
        Object o = null;
        PaginatedList instance = null;
        boolean expResult = false;
        boolean result = instance.remove(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class PaginatedList.
     */
    @Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        Collection c = null;
        PaginatedList instance = null;
        boolean expResult = false;
        boolean result = instance.removeAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retainAll method, of class PaginatedList.
     */
    @Test
    public void testRetainAll() {
        System.out.println("retainAll");
        Collection c = null;
        PaginatedList instance = null;
        boolean expResult = false;
        boolean result = instance.retainAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class PaginatedList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object o = null;
        PaginatedList instance = null;
        boolean expResult = false;
        boolean result = instance.contains(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsAll method, of class PaginatedList.
     */
    @Test
    public void testContainsAll() {
        System.out.println("containsAll");
        Collection c = null;
        PaginatedList instance = null;
        boolean expResult = false;
        boolean result = instance.containsAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class PaginatedList.
     */
    @Test
    public void testToArray_0args() {
        System.out.println("toArray");
        PaginatedList instance = null;
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class PaginatedList.
     */
    @Test
    public void testToArray_GenericType() {
        System.out.println("toArray");
        Object[] a = null;
        PaginatedList instance = null;
        Object[] expResult = null;
        Object[] result = instance.toArray(a);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PaginatedListImpl extends PaginatedList {

        public PaginatedListImpl() {
            super(0);
        }

        public void initialize() {
        }

        public List<Object> getSubList(int fromIndex, int toIndex) {
            return null;
        }
    }
    
}
