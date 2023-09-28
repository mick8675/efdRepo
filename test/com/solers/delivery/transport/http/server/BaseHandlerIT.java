/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.server;

import com.solers.delivery.content.supplier.ContentSetMapper;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class BaseHandlerIT {
    
    public BaseHandlerIT() {
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
     * Test of setCm method, of class BaseHandler.
     */
    @Test
    public void testSetCm() {
        System.out.println("setCm");
        ContentSetMapper cm = null;
        BaseHandler instance = new BaseHandlerImpl();
        instance.setCm(cm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetName method, of class BaseHandler.
     */
    @Test
    public void testGetContentSetName() {
        System.out.println("getContentSetName");
        HttpServletRequest request = null;
        BaseHandler instance = new BaseHandlerImpl();
        String expResult = "";
        String result = instance.getContentSetName(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSyncKey method, of class BaseHandler.
     */
    @Test
    public void testGetSyncKey() {
        System.out.println("getSyncKey");
        HttpServletRequest request = null;
        BaseHandler instance = new BaseHandlerImpl();
        String expResult = "";
        String result = instance.getSyncKey(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequestHandled method, of class BaseHandler.
     */
    @Test
    public void testSetRequestHandled() {
        System.out.println("setRequestHandled");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        BaseHandler instance = new BaseHandlerImpl();
        instance.setRequestHandled(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPathInfo method, of class BaseHandler.
     */
    @Test
    public void testGetPathInfo() {
        System.out.println("getPathInfo");
        HttpServletRequest request = null;
        BaseHandler instance = new BaseHandlerImpl();
        String expResult = "";
        String result = instance.getPathInfo(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BaseHandlerImpl extends BaseHandler {

        @Override
        public void handle(String string, HttpServletRequest hsr, HttpServletResponse hsr1, int i) throws IOException, ServletException {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
