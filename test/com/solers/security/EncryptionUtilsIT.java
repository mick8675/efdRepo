/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.security;

import java.io.Serializable;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
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
public class EncryptionUtilsIT {
    
    public EncryptionUtilsIT() {
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
     * Test of generateKey method, of class EncryptionUtils.
     */
    @Test
    public void testGenerateKey() {
        System.out.println("generateKey");
        Key expResult = null;
        Key result = EncryptionUtils.generateKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toHex method, of class EncryptionUtils.
     */
    @Test
    public void testToHex() {
        System.out.println("toHex");
        byte[] data = null;
        String expResult = "";
        String result = EncryptionUtils.toHex(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromHex method, of class EncryptionUtils.
     */
    @Test
    public void testFromHex() {
        System.out.println("fromHex");
        String hex = "";
        byte[] expResult = null;
        byte[] result = EncryptionUtils.fromHex(hex);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encryptAsHex method, of class EncryptionUtils.
     */
    @Test
    public void testEncryptAsHex() {
        System.out.println("encryptAsHex");
        char[] password = null;
        byte[] plaintext = null;
        String expResult = "";
        String result = EncryptionUtils.encryptAsHex(password, plaintext);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decryptFromHex method, of class EncryptionUtils.
     */
    @Test
    public void testDecryptFromHex() {
        System.out.println("decryptFromHex");
        char[] password = null;
        String hexCipherText = "";
        String expResult = "";
        String result = EncryptionUtils.decryptFromHex(password, hexCipherText);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encrypt method, of class EncryptionUtils.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        char[] password = null;
        byte[] plaintext = null;
        byte[] expResult = null;
        byte[] result = EncryptionUtils.encrypt(password, plaintext);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class EncryptionUtils.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        char[] password = null;
        byte[] ciphertext = null;
        byte[] expResult = null;
        byte[] result = EncryptionUtils.decrypt(password, ciphertext);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seal method, of class EncryptionUtils.
     */
    @Test
    public void testSeal() throws Exception {
        System.out.println("seal");
        Serializable obj = null;
        char[] password = null;
        SealedObject expResult = null;
        SealedObject result = EncryptionUtils.seal(obj, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unseal method, of class EncryptionUtils.
     */
    @Test
    public void testUnseal() throws Exception {
        System.out.println("unseal");
        SealedObject sealed = null;
        char[] password = null;
        Object expResult = null;
        Object result = EncryptionUtils.unseal(sealed, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMacKey method, of class EncryptionUtils.
     */
    @Test
    public void testGetMacKey() throws Exception {
        System.out.println("getMacKey");
        SecretKey expResult = null;
        SecretKey result = EncryptionUtils.getMacKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMac method, of class EncryptionUtils.
     */
    @Test
    public void testGetMac() throws Exception {
        System.out.println("getMac");
        SecretKey key = null;
        Mac expResult = null;
        Mac result = EncryptionUtils.getMac(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectArray method, of class EncryptionUtils.
     */
    @Test
    public void testGetObjectArray() throws Exception {
        System.out.println("getObjectArray");
        Object object = null;
        byte[] expResult = null;
        byte[] result = EncryptionUtils.getObjectArray(object);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStringFromBytes method, of class EncryptionUtils.
     */
    @Test
    public void testGetStringFromBytes() {
        System.out.println("getStringFromBytes");
        byte[] bytes = null;
        String expResult = "";
        String result = EncryptionUtils.getStringFromBytes(bytes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
