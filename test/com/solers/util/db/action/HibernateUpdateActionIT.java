/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.db.action;

import com.solers.util.db.Database;
import java.util.Properties;
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
public class HibernateUpdateActionIT {
    
    public HibernateUpdateActionIT() {
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
     * Test of setHibernateProperties method, of class HibernateUpdateAction.
     */
    @Test
    public void testSetHibernateProperties() {
        System.out.println("setHibernateProperties");
        Properties hibernateProperties = null;
        HibernateUpdateAction instance = new HibernateUpdateAction();
        instance.setHibernateProperties(hibernateProperties);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHibernateClasses method, of class HibernateUpdateAction.
     */
    @Test
    public void testSetHibernateClasses() {
        System.out.println("setHibernateClasses");
        Class[] hibernateClasses = null;
        HibernateUpdateAction instance = new HibernateUpdateAction();
        instance.setHibernateClasses(hibernateClasses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class HibernateUpdateAction.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        Database db = null;
        HibernateUpdateAction instance = new HibernateUpdateAction();
        instance.execute(db);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
