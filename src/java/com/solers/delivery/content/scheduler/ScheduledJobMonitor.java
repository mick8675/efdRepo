/****************************************************************
 *
 * Solers, Inc. as the author of Enterprise File Delivery 2.1 (EFD 2.1)
 * source code submitted herewith to the Government under contract
 * retains those intellectual property rights as set forth by the Federal 
 * Acquisition Regulations agreement (FAR). The Government has 
 * unlimited rights to redistribute copies of the EFD 2.1 in 
 * executable or source format to support operational installation 
 * and software maintenance. Additionally, the executable or 
 * source may be used or modified for by third parties as 
 * directed by the government.
 *
 * (c) 2009 Solers, Inc.
 ***********************************************************/
package com.solers.delivery.content.scheduler;

import java.util.Date;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
//import org.quartz.impl.JobDetailImpl;

import org.quartz.JobExecutionContext;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.listeners.TriggerListenerSupport;

import static org.quartz.JobBuilder.newJob;
import org.quartz.TriggerBuilder;



public class ScheduledJobMonitor extends TriggerListenerSupport
{
    protected static final Logger log = Logger.getLogger(ScheduledJobMonitor.class);
    
    private Map<String,JobDetail> jobMap = Collections.synchronizedMap(new HashMap<>());
    
    public String getName() 
    {
        return "JobMonitor";
    }
  
    
    public void triggerFired(Trigger trigger, JobExecutionContext context) 
    { 
        //log.info("Trigger Fired: " + trigger.getName());
        log.info("Trigger Fired: " + trigger.getKey().getName());
        
        //Object obj = trigger.getJobDataMap().get(ScheduleUtil.getDurationKey(trigger.getName()));
        Object obj = trigger.getJobDataMap().get(ScheduleUtil.getDurationKey(trigger.getKey().getName()));
        
        if (obj != null) {
            Long duration = (Long)obj;
            Scheduler scheduler = context.getScheduler();            
            Date startDate = ScheduleUtil.getStartDate(duration);
            log.info("Current time: " + new Date() + ", going to stop job in: " +
                     duration/1000 + " seconds");
            try {
                Scheduler monitorScheduler = new StdSchedulerFactory().getScheduler();
                monitorScheduler.start();
                //JobDetail jobDetail = jobMap.get(trigger.getName());
                JobDetail jobDetail = jobMap.get(trigger.getKey().getName());
                if (jobDetail == null) 
                {
                    
                    //jobDetail = new JobDetail("monitorjob." + trigger.getJobName(), "MONITOR", ScheduledJobStopper.class) {};
                    jobDetail = newJob(ScheduledJobStopper.class)
                        .withIdentity("monitorjob." + trigger.getJobKey().getName(), "MONITOR")
                        .build();
                                   
                    JobDataMap map = jobDetail.getJobDataMap();
                    map.put(ScheduledJobStopper.SCHEDULER, scheduler);
                    map.put(ScheduledJobStopper.TRIGGER, trigger);
                    jobMap.put(trigger.getKey().getName(), jobDetail);
                }
                
                //Trigger simpleTrigger = new SimpleTrigger("monitorTrigger", "MONITOR", startDate);
                SimpleTrigger simpleTrigger = (SimpleTrigger) TriggerBuilder.newTrigger()
                    .withIdentity("monitorTrigger", "MONITOR")
                    .startAt(startDate)
                    .build();
                
                monitorScheduler.deleteJob(jobDetail.getKey());
                monitorScheduler.scheduleJob(jobDetail, simpleTrigger);
            } 
            catch (SchedulerException ex) 
            {
                log.error("Failed to create scheduler for job monitor", ex);
            }        
        } 
        else 
        {
            log.info("There is no time limit for executing the job: " + trigger.getKey().getName());
        }
    }              
    
    
    
     public void triggerFiredTest(Trigger trigger, JobExecutionContext context) 
     { 
        //log.info("Trigger Fired: " + trigger.getName());
        log.info("Trigger Fired: " + trigger.getKey().getName());
        
        //Object obj = trigger.getJobDataMap().get(ScheduleUtil.getDurationKey(trigger.getName()));
        Object obj = trigger.getJobDataMap().get(ScheduleUtil.getDurationKey(trigger.getKey().getName()));
        
        if (obj != null) {
            Long duration = (Long)obj;
            Scheduler scheduler = context.getScheduler();            
            Date startDate = ScheduleUtil.getStartDate(duration);
            log.info("Current time: " + new Date() + ", going to stop job in: " +
                     duration/1000 + " seconds");
            try {
                Scheduler monitorScheduler = new StdSchedulerFactory().getScheduler();
                monitorScheduler.start();
                //JobDetail jobDetail = jobMap.get(trigger.getName());
                JobDetail jobDetail = jobMap.get(trigger.getKey().getName());
                if (jobDetail == null) 
                {
                    //jobDetail = new JobDetail("monitorjob." + trigger.getJobName(), "MONITOR", ScheduledJobStopper.class) {};
                    jobDetail = newJob(ScheduledJobStopper.class)
                        .withIdentity("monitorjob." + trigger.getJobKey().getName(), "MONITOR")
                        .build();
                    JobDataMap map = jobDetail.getJobDataMap();
                    map.put(ScheduledJobStopper.SCHEDULER, scheduler);
                    map.put(ScheduledJobStopper.TRIGGER, trigger);
                    jobMap.put(trigger.getJobKey().getName(), jobDetail);
                }
                
                //Trigger simpleTrigger = new SimpleTrigger("monitorTrigger", "MONITOR", startDate);
                SimpleTrigger simpleTrigger = (SimpleTrigger) TriggerBuilder.newTrigger()
                    .withIdentity("monitorTrigger", "MONITOR")
                    .startAt(startDate)
                    .build();
                        
                       
                //monitorScheduler.deleteJob(jobDetail.getName(), jobDetail.getGroup());
                //monitorScheduler.scheduleJob(jobDetail, simpleTrigger);
                monitorScheduler.deleteJob(jobDetail.getKey());
                monitorScheduler.scheduleJob(jobDetail, simpleTrigger);
            } 
            catch (SchedulerException ex) 
            {
                log.error("Failed to create scheduler for job monitor", ex);
            }        
        } 
        else 
        {
            log.info("There is no time limit for executing the job: " + trigger.getKey().getName());
        }
    }              
    
    public void triggerComplete(Trigger trigger, JobExecutionContext context, int triggerInstructionCode) 
    {
        log.debug("Trigger Complete: " + trigger.getKey().getName()); 
    }
}