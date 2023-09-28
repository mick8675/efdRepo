/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http;

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
public class TransferStatusIT {
    
    public TransferStatusIT() {
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
     * Test of getPercentComplete method, of class TransferStatus.
     */
    @Test
    public void testGetPercentComplete() {
        System.out.println("getPercentComplete");
        TransferStatus instance = new TransferStatusImpl();
        double expResult = 0.0;
        double result = instance.getPercentComplete();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesRequested method, of class TransferStatus.
     */
    @Test
    public void testGetBytesRequested() {
        System.out.println("getBytesRequested");
        TransferStatus instance = new TransferStatusImpl();
        long expResult = 0L;
        long result = instance.getBytesRequested();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesTransferred method, of class TransferStatus.
     */
    @Test
    public void testGetBytesTransferred() {
        System.out.println("getBytesTransferred");
        TransferStatus instance = new TransferStatusImpl();
        long expResult = 0L;
        long result = instance.getBytesTransferred();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileName method, of class TransferStatus.
     */
    @Test
    public void testGetFileName() {
        System.out.println("getFileName");
        TransferStatus instance = new TransferStatusImpl();
        String expResult = "";
        String result = instance.getFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransferType method, of class TransferStatus.
     */
    @Test
    public void testGetTransferType() {
        System.out.println("getTransferType");
        TransferStatus instance = new TransferStatusImpl();
        TransferType expResult = null;
        TransferType result = instance.getTransferType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TransferStatusImpl implements TransferStatus {

        public double getPercentComplete() {
            return 0.0;
        }

        public long getBytesRequested() {
            return 0L;
        }

        public long getBytesTransferred() {
            return 0L;
        }

        public String getFileName() {
            return "";
        }

        public TransferType getTransferType() {
            return null;
        }
    }

    public class TransferStatusImpl implements TransferStatus {

        public double getPercentComplete() {
            return 0.0;
        }

        public long getBytesRequested() {
            return 0L;
        }

        public long getBytesTransferred() {
            return 0L;
        }

        public String getFileName() {
            return "";
        }

        public TransferType getTransferType() {
            return null;
        }
    }
    
}
