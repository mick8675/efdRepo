package com.solers.delivery.content.scheduler;

import org.quartz.JobExecutionException;
import java.text.ParseException;
import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import junit.framework.TestCase;

/**
 * @author <a href="mailto:kevin.conaway@solers.com">Kevin Conaway</a>
 */
public class CronTriggerTestCase extends TestCase 
{
    
    public void testSetInvalidCronExpression() 
    {
        CronTrigger trigger = new CronTrigger();
        
        try {
            trigger.setCronExpression("invalid");
            assertEquals(CronTrigger.DEFAULT_EXPRESSION, trigger.getCronExpression());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
    
    public void testValidCronExpression() {
        String expression = "0 * * * * ?";
        CronTrigger trigger = new CronTrigger();
        
        trigger.setCronExpression(expression);
        
        assertEquals(expression, trigger.getCronExpression());
    }
    
    public void testExecutionComplete() {
        JobExecutionException result = new JobExecutionException();
        CronTrigger trigger = new CronTrigger();
        trigger.setCronExpression("0 * * * * ?");
        trigger.executionComplete(null, result);
        assertEquals(true, trigger.isExecutionCompleted());
    }
}
