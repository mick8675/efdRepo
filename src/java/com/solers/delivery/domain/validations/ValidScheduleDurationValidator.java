package com.solers.delivery.domain.validations;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.solers.delivery.domain.ScheduleExpression;

/*
 * Implementation class for the schedule duration validator.  This class
 * contains the logic to validate that a ScheduleExpression object contains
 * a valid duration.
*/

public class ValidScheduleDurationValidator implements ConstraintValidator<ValidScheduleDuration, ScheduleExpression>
{

    /*@Override
    public void initialize(ValidScheduleDuration arg0) {
        
    }*/

    @Override
	public boolean isValid(ScheduleExpression expression, ConstraintValidatorContext unused) 
        {
            boolean valid = false;
            if (expression != null) 
            {
                if((expression.getDuration() > 0) && (expression.getDurationUnit() == null)) 
                {
                        valid = false;
                }
                else 
                {
                        valid = true;
                }
            }
            return valid;
	}

    @Override
    public void initialize(ValidScheduleDuration a) 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}//_________________________end class___________________________________________
