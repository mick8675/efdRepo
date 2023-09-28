/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs;

import java.io.File;
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
public class TransportIT {
    
    public TransportIT() {
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
     * Test of upload method, of class Transport.
     */
    @Test
    public void testUpload() throws Exception {
        System.out.println("upload");
        File file = null;
        Transport instance = new TransportImpl();
        instance.upload(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class Transport.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        Transport instance = new TransportImpl();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TransportImpl implements Transport {

        public void upload(File file) throws TransportException {
        }

        public void init() throws TransportException {
        }
    }
    
}
