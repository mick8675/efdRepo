/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.daos;

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
public class DAOFactoryIT {
    
    public DAOFactoryIT() {
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
     * Test of getContentSetDAO method, of class DAOFactory.
     */
    @Test
    public void testGetContentSetDAO() {
        System.out.println("getContentSetDAO");
        DAOFactory instance = new DAOFactoryImpl();
        ContentSetDAO expResult = null;
        ContentSetDAO result = instance.getContentSetDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsumerContentSetDAO method, of class DAOFactory.
     */
    @Test
    public void testGetConsumerContentSetDAO() {
        System.out.println("getConsumerContentSetDAO");
        DAOFactory instance = new DAOFactoryImpl();
        ConsumerContentSetDAO expResult = null;
        ConsumerContentSetDAO result = instance.getConsumerContentSetDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPendingDeleteDAO method, of class DAOFactory.
     */
    @Test
    public void testGetPendingDeleteDAO() {
        System.out.println("getPendingDeleteDAO");
        DAOFactory instance = new DAOFactoryImpl();
        PendingDeleteDAO expResult = null;
        PendingDeleteDAO result = instance.getPendingDeleteDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserDAO method, of class DAOFactory.
     */
    @Test
    public void testGetUserDAO() {
        System.out.println("getUserDAO");
        DAOFactory instance = new DAOFactoryImpl();
        UserDAO expResult = null;
        UserDAO result = instance.getUserDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswordDAO method, of class DAOFactory.
     */
    @Test
    public void testGetPasswordDAO() {
        System.out.println("getPasswordDAO");
        DAOFactory instance = new DAOFactoryImpl();
        PasswordDAO expResult = null;
        PasswordDAO result = instance.getPasswordDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllowedHostDAO method, of class DAOFactory.
     */
    @Test
    public void testGetAllowedHostDAO() {
        System.out.println("getAllowedHostDAO");
        DAOFactory instance = new DAOFactoryImpl();
        AllowedHostDAO expResult = null;
        AllowedHostDAO result = instance.getAllowedHostDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlertDAO method, of class DAOFactory.
     */
    @Test
    public void testGetAlertDAO() {
        System.out.println("getAlertDAO");
        DAOFactory instance = new DAOFactoryImpl();
        AlertDAO expResult = null;
        AlertDAO result = instance.getAlertDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DAOFactoryImpl implements DAOFactory {

        public ContentSetDAO getContentSetDAO() {
            return null;
        }

        public ConsumerContentSetDAO getConsumerContentSetDAO() {
            return null;
        }

        public PendingDeleteDAO getPendingDeleteDAO() {
            return null;
        }

        public UserDAO getUserDAO() {
            return null;
        }

        public PasswordDAO getPasswordDAO() {
            return null;
        }

        public AllowedHostDAO getAllowedHostDAO() {
            return null;
        }

        public AlertDAO getAlertDAO() {
            return null;
        }
    }

    public class DAOFactoryImpl implements DAOFactory {

        public ContentSetDAO getContentSetDAO() {
            return null;
        }

        public ConsumerContentSetDAO getConsumerContentSetDAO() {
            return null;
        }

        public PendingDeleteDAO getPendingDeleteDAO() {
            return null;
        }

        public UserDAO getUserDAO() {
            return null;
        }

        public PasswordDAO getPasswordDAO() {
            return null;
        }

        public AllowedHostDAO getAllowedHostDAO() {
            return null;
        }

        public AlertDAO getAlertDAO() {
            return null;
        }
    }
    
}
