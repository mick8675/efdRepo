/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.restlet.Context;
import org.restlet.data.Request;
import org.restlet.data.Response;
import org.restlet.resource.Representation;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class BaseEnableResourceIT {
    
    public BaseEnableResourceIT() {
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
     * Test of allowPut method, of class BaseEnableResource.
     */
    @Test
    public void testAllowPut() {
        System.out.println("allowPut");
        BaseEnableResource instance = new BaseEnableResourceImpl();
        boolean expResult = false;
        boolean result = instance.allowPut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allowGet method, of class BaseEnableResource.
     */
    @Test
    public void testAllowGet() {
        System.out.println("allowGet");
        BaseEnableResource instance = new BaseEnableResourceImpl();
        boolean expResult = false;
        boolean result = instance.allowGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class BaseEnableResource.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Context context = null;
        Request request = null;
        Response response = null;
        BaseEnableResource instance = new BaseEnableResourceImpl();
        instance.init(context, request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeRepresentation method, of class BaseEnableResource.
     */
    @Test
    public void testStoreRepresentation() {
        System.out.println("storeRepresentation");
        Representation entity = null;
        BaseEnableResource instance = new BaseEnableResourceImpl();
        instance.storeRepresentation(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class BaseEnableResource.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Representation entity = null;
        BaseEnableResource instance = new BaseEnableResourceImpl();
        String expResult = "";
        String result = instance.getText(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enabling method, of class BaseEnableResource.
     */
    @Test
    public void testEnabling() {
        System.out.println("enabling");
        String text = "";
        BaseEnableResource instance = new BaseEnableResourceImpl();
        boolean expResult = false;
        boolean result = instance.enabling(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disabling method, of class BaseEnableResource.
     */
    @Test
    public void testDisabling() {
        System.out.println("disabling");
        String text = "";
        BaseEnableResource instance = new BaseEnableResourceImpl();
        boolean expResult = false;
        boolean result = instance.disabling(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lookup method, of class BaseEnableResource.
     */
    @Test
    public void testLookup() {
        System.out.println("lookup");
        long id = 0L;
        BaseEnableResource instance = new BaseEnableResourceImpl();
        Object expResult = null;
        Object result = instance.lookup(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enable method, of class BaseEnableResource.
     */
    @Test
    public void testEnable() {
        System.out.println("enable");
        Object item = null;
        BaseEnableResource instance = new BaseEnableResourceImpl();
        instance.enable(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disable method, of class BaseEnableResource.
     */
    @Test
    public void testDisable() {
        System.out.println("disable");
        Object item = null;
        BaseEnableResource instance = new BaseEnableResourceImpl();
        instance.disable(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BaseEnableResourceImpl extends BaseEnableResource {

        public T lookup(long id) {
            return null;
        }

        public void enable(T item) {
        }

        public void disable(T item) {
        }
    }

    public class BaseEnableResourceImpl extends BaseEnableResource {

        public T lookup(long id) {
            return null;
        }

        public void enable(T item) {
        }

        public void disable(T item) {
        }
    }
    
}
