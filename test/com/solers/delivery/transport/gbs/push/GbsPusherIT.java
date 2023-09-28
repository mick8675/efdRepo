/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs.push;

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
public class GbsPusherIT {
    
    public GbsPusherIT() {
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
     * Test of init method, of class GbsPusher.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        GbsPusher instance = null;
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class GbsPusher.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        GbsPusher instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFile method, of class GbsPusher.
     */
    @Test
    public void testAddFile() {
        System.out.println("addFile");
        String consumerContentSet = "";
        String syncKey = "";
        String supplierContentSet = "";
        String host = "";
        File file = null;
        String path = "";
        GbsPusher instance = null;
        instance.addFile(consumerContentSet, syncKey, supplierContentSet, host, file, path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doStart method, of class GbsPusher.
     */
    @Test
    public void testDoStart() {
        System.out.println("doStart");
        Long id = null;
        GbsPusher instance = null;
        instance.doStart(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doStop method, of class GbsPusher.
     */
    @Test
    public void testDoStop() {
        System.out.println("doStop");
        Long id = null;
        GbsPusher instance = null;
        instance.doStop(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class GbsPusher.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        GbsPusher instance = null;
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
