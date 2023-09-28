/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util;

import java.security.MessageDigest;
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
public class HashFunctionIT {
    
    public HashFunctionIT() {
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
     * Test of values method, of class HashFunction.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        HashFunction[] expResult = null;
        HashFunction[] result = HashFunction.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class HashFunction.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        HashFunction expResult = null;
        HashFunction result = HashFunction.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hash method, of class HashFunction.
     */
    @Test
    public void testHash() {
        System.out.println("hash");
        String str = "";
        HashFunction instance = null;
        long expResult = 0L;
        long result = instance.hash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RSHash method, of class HashFunction.
     */
    @Test
    public void testRSHash() {
        System.out.println("RSHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.RSHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of JSHash method, of class HashFunction.
     */
    @Test
    public void testJSHash() {
        System.out.println("JSHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.JSHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PJWHash method, of class HashFunction.
     */
    @Test
    public void testPJWHash() {
        System.out.println("PJWHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.PJWHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ELFHash method, of class HashFunction.
     */
    @Test
    public void testELFHash() {
        System.out.println("ELFHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.ELFHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BKDRHash method, of class HashFunction.
     */
    @Test
    public void testBKDRHash() {
        System.out.println("BKDRHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.BKDRHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SDBMHash method, of class HashFunction.
     */
    @Test
    public void testSDBMHash() {
        System.out.println("SDBMHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.SDBMHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DJBHash method, of class HashFunction.
     */
    @Test
    public void testDJBHash() {
        System.out.println("DJBHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.DJBHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DEKHash method, of class HashFunction.
     */
    @Test
    public void testDEKHash() {
        System.out.println("DEKHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.DEKHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BPHash method, of class HashFunction.
     */
    @Test
    public void testBPHash() {
        System.out.println("BPHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.BPHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FNVHash method, of class HashFunction.
     */
    @Test
    public void testFNVHash() {
        System.out.println("FNVHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.FNVHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FNV1aHash method, of class HashFunction.
     */
    @Test
    public void testFNV1aHash() {
        System.out.println("FNV1aHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.FNV1aHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of APHash method, of class HashFunction.
     */
    @Test
    public void testAPHash() {
        System.out.println("APHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.APHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FORTHHash method, of class HashFunction.
     */
    @Test
    public void testFORTHHash() {
        System.out.println("FORTHHash");
        String str = "";
        long expResult = 0L;
        long result = HashFunction.FORTHHash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DigestHash method, of class HashFunction.
     */
    @Test
    public void testDigestHash() {
        System.out.println("DigestHash");
        MessageDigest digest = null;
        String str = "";
        long expResult = 0L;
        long result = HashFunction.DigestHash(digest, str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HashFunctionImpl extends HashFunctionIT {

        public long hash(String str) {
            return 0L;
        }
    }
    
}
