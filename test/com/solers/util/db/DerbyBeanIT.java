/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.db;

import java.io.OutputStream;
import java.sql.Connection;
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
public class DerbyBeanIT {
    
    public DerbyBeanIT() {
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
     * Test of getLogStream method, of class DerbyBean.
     */
    @Test
    public void testGetLogStream() {
        System.out.println("getLogStream");
        OutputStream expResult = null;
        OutputStream result = DerbyBean.getLogStream();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keepAlive method, of class DerbyBean.
     */
    @Test
    public void testKeepAlive() {
        System.out.println("keepAlive");
        DerbyBean instance = null;
        boolean expResult = false;
        boolean result = instance.keepAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doInitialize method, of class DerbyBean.
     */
    @Test
    public void testDoInitialize() {
        System.out.println("doInitialize");
        DerbyBean instance = null;
        instance.doInitialize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doStart method, of class DerbyBean.
     */
    @Test
    public void testDoStart() {
        System.out.println("doStart");
        DerbyBean instance = null;
        instance.doStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doStop method, of class DerbyBean.
     */
    @Test
    public void testDoStop() {
        System.out.println("doStop");
        DerbyBean instance = null;
        instance.doStop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class DerbyBean.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        DerbyBean instance = null;
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPort method, of class DerbyBean.
     */
    @Test
    public void testGetPort() {
        System.out.println("getPort");
        DerbyBean instance = null;
        int expResult = 0;
        int result = instance.getPort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onStart method, of class DerbyBean.
     */
    @Test
    public void testOnStart() {
        System.out.println("onStart");
        DerbyBean instance = null;
        instance.onStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
