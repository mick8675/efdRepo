package com.solers.delivery.domain.validations;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import com.solers.delivery.domain.FileFilter;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ValidFilterValidatorTest implements  ConstraintValidator<ValidFilter, FileFilter> 
{
   
    public boolean isValid(FileFilter filter, ConstraintValidatorContext unused) 
    {
        boolean valid = false;
        if (filter != null) 
        {
            if ((filter.getPatternType() != null) && (filter.getPattern() != null)) 
            {
                if (filter.getPatternType().equals(FileFilter.Pattern.REGEX)) 
                {
                    try 
                    {
                        Pattern.compile(filter.getPattern());
                        valid = true;
                    } 
                    catch (PatternSyntaxException pse) 
                    {
                        valid = false;
                    }
                }
            }
        }
        return valid;
}//___

    @Override
    public void initialize(ValidFilter a) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}//______________________________end class______________________________________
