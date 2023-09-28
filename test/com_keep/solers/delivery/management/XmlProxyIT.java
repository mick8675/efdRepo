/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.management;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.Node;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class XmlProxyIT {
    
    public XmlProxyIT() {
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
     * Test of proxy method, of class XmlProxy.
     */
    @Test
    public void testProxy_Class_String() {
        System.out.println("proxy");
        Object expResult = null;
        Object result = XmlProxy.proxy(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of proxy method, of class XmlProxy.
     */
    @Test
    public void testProxy_Class_Node() {
        System.out.println("proxy");
        Object expResult = null;
        Object result = XmlProxy.proxy(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of proxyBean method, of class XmlProxy.
     */
    @Test
    public void testProxyBean_Class() throws Exception {
        System.out.println("proxyBean");
        Class clazz = null;
        XmlProxy instance = null;
        Object expResult = null;
        Object result = instance.proxyBean(clazz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of proxyBean method, of class XmlProxy.
     */
    @Test
    public void testProxyBean_Node_Class() throws Exception {
        System.out.println("proxyBean");
        Node node = null;
        Class clazz = null;
        XmlProxy instance = null;
        Object expResult = null;
        Object result = instance.proxyBean(node, clazz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invoke method, of class XmlProxy.
     */
    @Test
    public void testInvoke() throws Exception {
        System.out.println("invoke");
        Object proxy = null;
        Method m = null;
        Object[] args = null;
        XmlProxy instance = null;
        Object expResult = null;
        Object result = instance.invoke(proxy, m, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class XmlProxy.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Type gType = null;
        XmlProxy instance = null;
        Class expResult = null;
        Class result = instance.getType(gType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isReadable method, of class XmlProxy.
     */
    @Test
    public void testIsReadable_Method() {
        System.out.println("isReadable");
        Method method = null;
        XmlProxy instance = null;
        boolean expResult = false;
        boolean result = instance.isReadable(method);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isReadable method, of class XmlProxy.
     */
    @Test
    public void testIsReadable_String() {
        System.out.println("isReadable");
        String methodName = "";
        XmlProxy instance = null;
        boolean expResult = false;
        boolean result = instance.isReadable(methodName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returning method, of class XmlProxy.
     */
    @Test
    public void testReturning() {
        System.out.println("returning");
        Class returnType = null;
        Class type = null;
        XmlProxy instance = null;
        boolean expResult = false;
        boolean result = instance.returning(returnType, type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returningInterface method, of class XmlProxy.
     */
    @Test
    public void testReturningInterface() {
        System.out.println("returningInterface");
        Class returnType = null;
        XmlProxy instance = null;
        boolean expResult = false;
        boolean result = instance.returningInterface(returnType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returningEnum method, of class XmlProxy.
     */
    @Test
    public void testReturningEnum() {
        System.out.println("returningEnum");
        Class returnType = null;
        XmlProxy instance = null;
        boolean expResult = false;
        boolean result = instance.returningEnum(returnType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class XmlProxy.
     */
    @Test
    public void testGetName_Method() {
        System.out.println("getName");
        Method method = null;
        XmlProxy instance = null;
        String expResult = "";
        String result = instance.getName(method);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class XmlProxy.
     */
    @Test
    public void testGetName_String() {
        System.out.println("getName");
        String methodName = "";
        XmlProxy instance = null;
        String expResult = "";
        String result = instance.getName(methodName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getString method, of class XmlProxy.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        Node node = null;
        String propertyName = "";
        XmlProxy instance = null;
        String expResult = "";
        String result = instance.getString(node, propertyName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChildNode method, of class XmlProxy.
     */
    @Test
    public void testGetChildNode() {
        System.out.println("getChildNode");
        Node node = null;
        String propertyName = "";
        int index = 0;
        XmlProxy instance = null;
        Node expResult = null;
        Node result = instance.getChildNode(node, propertyName, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
