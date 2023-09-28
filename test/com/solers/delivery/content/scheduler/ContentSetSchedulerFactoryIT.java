/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.scheduler;

import com.solers.delivery.domain.ContentSet;
import com.solers.delivery.domain.ScheduleExpression;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.quartz.JobDetail;
import org.quartz.Scheduler;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class ContentSetSchedulerFactoryIT {
    
    public ContentSetSchedulerFactoryIT() {
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
     * Test of newScheduler method, of class ContentSetSchedulerFactory.
     */
    @Test
    public void testNewScheduler() {
        System.out.println("newScheduler");
        Runnable task = null;
        ContentSet config = null;
        ContentSetSchedulerFactory instance = new ContentSetSchedulerFactory();
        ContentSetScheduler expResult = null;
        ContentSetScheduler result = instance.newScheduler(task, config);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScheduler method, of class ContentSetSchedulerFactory.
     */
    @Test
    public void testGetScheduler() {
        System.out.println("getScheduler");
        String name = "";
        ContentSetSchedulerFactory instance = new ContentSetSchedulerFactory();
        Scheduler expResult = null;
        Scheduler result = instance.getScheduler(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobDetail method, of class ContentSetSchedulerFactory.
     */
    @Test
    public void testGetJobDetail() {
        System.out.println("getJobDetail");
        Runnable task = null;
        String name = "";
        String group = "";
        ContentSetSchedulerFactory instance = new ContentSetSchedulerFactory();
        JobDetail expResult = null;
        JobDetail result = instance.getJobDetail(task, name, group);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTriggers method, of class ContentSetSchedulerFactory.
     */
    @Test
    public void testGetTriggers() {
        System.out.println("getTriggers");
        ContentSet config = null;
        String group = "";
        ContentSetSchedulerFactory instance = new ContentSetSchedulerFactory();
        List<CronTrigger> expResult = null;
        List<CronTrigger> result = instance.getTriggers(config, group);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrigger method, of class ContentSetSchedulerFactory.
     */
    @Test
    public void testGetTrigger() {
        System.out.println("getTrigger");
        ScheduleExpression expression = null;
        String name = "";
        String group = "";
        ContentSetSchedulerFactory instance = new ContentSetSchedulerFactory();
        CronTrigger expResult = null;
        CronTrigger result = instance.getTrigger(expression, name, group);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
