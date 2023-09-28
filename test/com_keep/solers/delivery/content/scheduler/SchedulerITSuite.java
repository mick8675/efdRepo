/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.content.scheduler;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.solers.delivery.content.scheduler.ScheduleUtilIT.class, com.solers.delivery.content.scheduler.CronTriggerIT.class, com.solers.delivery.content.scheduler.ScheduledJobStopperIT.class, com.solers.delivery.content.scheduler.AbstractContentSetSchedulerIT.class, com.solers.delivery.content.scheduler.QuartzSchedulerIT.class, com.solers.delivery.content.scheduler.ContentSetSchedulerIT.class, com.solers.delivery.content.scheduler.ContentSetSchedulerFactoryIT.class, com.solers.delivery.content.scheduler.SimpleSchedulerIT.class, com.solers.delivery.content.scheduler.ScheduledJobMonitorIT.class, com.solers.delivery.content.scheduler.ThreadPoolTaskExecutorIT.class})
public class SchedulerITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
