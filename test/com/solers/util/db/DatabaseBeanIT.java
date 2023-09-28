/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.db;

import com.solers.util.db.action.DatabaseAction;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
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
public class DatabaseBeanIT {
    
    public DatabaseBeanIT() {
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
     * Test of setDatabaseDirectory method, of class DatabaseBean.
     */
    @Test
    public void testSetDatabaseDirectory() {
        System.out.println("setDatabaseDirectory");
        File databaseDirectory = null;
        DatabaseBean instance = new DatabaseBeanImpl();
        instance.setDatabaseDirectory(databaseDirectory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActions method, of class DatabaseBean.
     */
    @Test
    public void testSetActions() {
        System.out.println("setActions");
        List<DatabaseAction> actions = null;
        DatabaseBean instance = new DatabaseBeanImpl();
        instance.setActions(actions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class DatabaseBean.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        DatabaseBean instance = new DatabaseBeanImpl();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class DatabaseBean.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        DatabaseBean instance = new DatabaseBeanImpl();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPort method, of class DatabaseBean.
     */
    @Test
    public void testGetPort() {
        System.out.println("getPort");
        DatabaseBean instance = new DatabaseBeanImpl();
        int expResult = 0;
        int result = instance.getPort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doStart method, of class DatabaseBean.
     */
    @Test
    public void testDoStart() {
        System.out.println("doStart");
        DatabaseBean instance = new DatabaseBeanImpl();
        instance.doStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doInitialize method, of class DatabaseBean.
     */
    @Test
    public void testDoInitialize() {
        System.out.println("doInitialize");
        DatabaseBean instance = new DatabaseBeanImpl();
        instance.doInitialize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doStop method, of class DatabaseBean.
     */
    @Test
    public void testDoStop() {
        System.out.println("doStop");
        DatabaseBean instance = new DatabaseBeanImpl();
        instance.doStop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onStart method, of class DatabaseBean.
     */
    @Test
    public void testOnStart() {
        System.out.println("onStart");
        DatabaseBean instance = new DatabaseBeanImpl();
        instance.onStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keepAlive method, of class DatabaseBean.
     */
    @Test
    public void testKeepAlive() {
        System.out.println("keepAlive");
        DatabaseBean instance = new DatabaseBeanImpl();
        boolean expResult = false;
        boolean result = instance.keepAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialized method, of class DatabaseBean.
     */
    @Test
    public void testInitialized() {
        System.out.println("initialized");
        DatabaseBean instance = new DatabaseBeanImpl();
        boolean expResult = false;
        boolean result = instance.initialized();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class DatabaseBean.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        String[] statements = null;
        DatabaseBean instance = new DatabaseBeanImpl();
        instance.execute(statements);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class DatabaseBean.
     */
    @Test
    public void testClose_Connection() {
        System.out.println("close");
        Connection conn = null;
        DatabaseBean instance = new DatabaseBeanImpl();
        instance.close(conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class DatabaseBean.
     */
    @Test
    public void testClose_Statement() {
        System.out.println("close");
        Statement stmt = null;
        DatabaseBean instance = new DatabaseBeanImpl();
        instance.close(stmt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DatabaseBeanImpl extends DatabaseBean {

        public int getPort() {
            return 0;
        }

        public void doStart() {
        }

        public void doInitialize() {
        }

        public void doStop() {
        }

        @Override
        public Connection getConnection() throws SQLException {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
