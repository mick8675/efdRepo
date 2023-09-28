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

import java.text.ParseException;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobDataMap;

import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerKey;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.quartz.CronTrigger;
import org.quartz.Trigger.TriggerState;


public class ScheduledJobStopper implements Job 
{
    private static final Logger log = Logger.getLogger(ScheduledJobStopper.class);
    
    public static final String SCHEDULER = "scheduler";
    public static final String TRIGGER = "trigger";

    public ScheduledJobStopper() 
    {
    }
    
    
    public void execute(JobExecutionContext context) throws JobExecutionException
    {
        try 
        {
            JobDetail jobDetail = context.getJobDetail();                
            JobDataMap map = jobDetail.getJobDataMap();
            
            //CronTrigger oldTrigger = (CronTrigger)map.get(TRIGGER);
            CronTriggerImpl oldTrigger = (CronTriggerImpl)map.get(TRIGGER);
            
            
            
            Scheduler scheduler = (Scheduler)map.get(SCHEDULER);
            JobExecutionException result;
            //Status=oldTrigger.executionComplete(context, result);
            
                        
            
            TriggerState isTriggerComplete=scheduler.getTriggerState(oldTrigger.getKey()); //triggerstate is enum (NONE, NORMAL, PAUSED, COMPLETE, ERROR, BLOCKED)
            //if (oldTrigger.isExecutionCompleted())
            if ((isTriggerComplete == TriggerState.COMPLETE) || (isTriggerComplete == TriggerState.NONE))
            {
                 log.info("Job : " + oldTrigger.getJobName() + " is complete, no need to reschedule.");
                           
            } 
            else 
            {                
               String oldTriggerName=oldTrigger.getJobName();
                log.info("Job : " + oldTriggerName + " is not complete, reschedule it...");
                
                //CronTrigger newTrigger = new CronTrigger();
                CronTriggerImpl newTrigger=new CronTriggerImpl();
                
                newTrigger.setCronExpression(oldTrigger.getCronExpression());   
                
                newTrigger.setName(oldTrigger.getName());//getObject().getJobKey().getName());
                newTrigger.setJobName(oldTrigger.getJobName());
                newTrigger.setJobGroup(oldTrigger.getJobGroup());
                
                scheduler.rescheduleJob(oldTrigger.getKey(), newTrigger);
                //scheduler.rescheduleJob(newTrigger.getName(), oldTrigger.getGroup(), newTrigger);
            }    
            
        } 
        catch(SchedulerException e) 
        {
            log.error("Failed to reschedule the job", e);              
        } 
        catch (ParseException ex) 
        {
            java.util.logging.Logger.getLogger(ScheduledJobStopper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}


/* //old code from quartz 1.7x - tried to duplicate above as best as I could - needs tested
package com.solers.delivery.content.scheduler;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;

public class ScheduledJobStopper implements Job {
    private static final Logger log = Logger.getLogger(ScheduledJobStopper.class);
    
    public static final String SCHEDULER = "scheduler";
    public static final String TRIGGER = "trigger";
    
    public void execute(JobExecutionContext context) {
        try {
            JobDetail jobDetail = context.getJobDetail();                
            JobDataMap map = jobDetail.getJobDataMap();
            
            CronTrigger oldTrigger = (CronTrigger)map.get(TRIGGER);
            Scheduler scheduler = (Scheduler)map.get(SCHEDULER);
            if (!oldTrigger.isExecutionCompleted()) {
                log.info("Job : " + oldTrigger.getJobName() + " is not complete, reschedule it...");
                CronTrigger newTrigger = new CronTrigger();
                newTrigger.setCronExpression(oldTrigger.getCronExpression());   
                
                newTrigger.setName(oldTrigger.getName());
                newTrigger.setJobName(oldTrigger.getJobName());
                newTrigger.setJobGroup(oldTrigger.getJobGroup());
                scheduler.rescheduleJob(newTrigger.getName(), oldTrigger.getGroup(), newTrigger);
            } else {                
                log.info("Job : " + oldTrigger.getJobName() + " is complte, no need to reschedule.");
            }                
        } catch(SchedulerException e) {
            log.error("Failed to reschedule the job", e);              
        }
    }  
}

*/