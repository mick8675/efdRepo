/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.install;

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
public class VerifyJavaTaskIT {
    
    public VerifyJavaTaskIT() {
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
     * Test of setIsUnix method, of class VerifyJavaTask.
     */
    @Test
    public void testSetIsUnix() {
        System.out.println("setIsUnix");
        boolean isUnix = false;
        VerifyJavaTask instance = new VerifyJavaTask();
        instance.setIsUnix(isUnix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class VerifyJavaTask.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        VerifyJavaTask instance = new VerifyJavaTask();
        instance.execute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parseVersionData method, of class VerifyJavaTask.
     */
    @Test
    public void testParseVersionData() {
        System.out.println("parseVersionData");
        String str = "";
        VerifyJavaTask instance = new VerifyJavaTask();
        int[] expResult = null;
        int[] result = instance.parseVersionData(str);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class VerifyJavaTask.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VerifyJavaTask.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
