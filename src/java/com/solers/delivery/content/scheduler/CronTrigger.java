package com.solers.delivery.content.scheduler;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Trigger;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;

public class CronTrigger extends CronTriggerFactoryBean  {
    
    public static final String DEFAULT_EXPRESSION = "0 0 0 ? * SAT";
    
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(CronTrigger.class);

    private boolean executionCompleted;
    private String cronExpression;
    
    
    @Override
    public void setCronExpression(String expression) {
        try 
        {
            super.setCronExpression(expression);
            
        } 
        catch  (Exception e) 
        {
            log.error(String.format("Invalid cron expression supplied [%s]", expression), e);
            // If an exception occurs, set the default expression
            super.setCronExpression(DEFAULT_EXPRESSION);
            log.info(String.format("Default value: every SAT at 12 AM is used : [%s]", DEFAULT_EXPRESSION));
        }
    }
    
    // Replace executionComplete method with appropriate method based on Spring version
    // For Spring 5.3.29, use 'triggered' method with 'org.quartz.Trigger' type
    public void triggered(org.quartz.Trigger trigger, JobExecutionContext context) {
        this.executionCompleted = true;
    }
    
    
    public boolean isExecutionCompleted() {
        return this.executionCompleted;
    }
}





//import java.text.ParseException;


/*
import java.text.ParseException;
import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;



//import org.springframework.scheduling.quartz.CronTriggerBean;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;


public class CronTrigger extends CronTriggerFactoryBean 
{
    
    public static final String DEFAULT_EXPRESSION = "0 0 0 ? * SAT";
    
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(CronTrigger.class);
    //public String getCronExpression();
    private boolean executionCompleted;
    
    @Override
    public void setCronExpression(String expression)
    {
        try 
        {
            super.setCronExpression(expression);
        } 
        catch (Exception e) 
        {
            log.error(String.format("Invalid cron expression supplied [%s]", expression), e);

            try 
            {
                super.setCronExpression(DEFAULT_EXPRESSION);
                log.info(String.format("Default value: every SAT at 12 AM is used : [%s]", DEFAULT_EXPRESSION));
            } 
            catch (Exception ex) 
            {
                log.error("Error using default expression", ex);
            }
            
        }
    }

        
    
    @Override
    public int executionComplete(JobExecutionContext context, JobExecutionException result) 
    {
        this.executionCompleted = true;    
        
        return super.executionComplete(context, result);
        
    }

    
        
    
    
    public boolean isExecutionCompleted() 
    {
        return this.executionCompleted;
    }
    
     
    
}*/
