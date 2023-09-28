package com.solers.delivery.domain.validations;

import java.text.ParseException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.quartz.CronExpression;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ValidScheduleExpressionValidator implements ConstraintValidator<ValidScheduleExpression,String> 
{
  
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidScheduleExpressionValidator.class);
    
    @Override
    public boolean isValid(String expression, ConstraintValidatorContext unused) 
    {
        boolean valid = false;
        try 
        {
            CronExpression cronExpr = new CronExpression(expression);
            cronExpr.getNextValidTimeAfter(new Date());
            valid = true;
        } 
        catch (ParseException ex) 
        {
            LOGGER.error("Invalid cron expression => [" + expression + " ].");
        } 
        catch (UnsupportedOperationException ex) 
        {
            LOGGER.error("UnsupportedOperationException while validating cron expression => [ " + expression + " ], Exception message => [ " + ex.getMessage() + " ].");
        }

        return valid;
    }

    @Override
    public void initialize(ValidScheduleExpression a) 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}//____________________________________end class________________________________