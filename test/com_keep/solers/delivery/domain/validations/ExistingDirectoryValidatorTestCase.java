package com.solers.delivery.domain.validations;

//import java.io.File;
//import com.solers.delivery.validator.Validator;
//import org.hibernate.validator.Validator;//original
//import com.solers.delivery.domain.validations.ExistingDirectory;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Checks if a directory exists.  If it doesn't attempt to create it
 */

//public class ExistingDirectoryValidator implements Validator<ExistingDirectory> {
public class ExistingDirectoryValidatorTestCase implements ConstraintValidator<ExistingDirectory, String> 
{
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ExistingDirectoryValidator.class);
    
    @Override
    public void initialize(ExistingDirectory arg0) 
    {
        
    }

    @Override
    public boolean isValid(String path, ConstraintValidatorContext notused) 
    {
            boolean valid = false;
            if ((path != null) && (!path.isEmpty())) 
            {
                Path p = Paths.get(path);
                if (!Files.exists(p)) 
                {
                    try 
                    {
                        Files.createDirectories(p);
                        valid = true;
                    }
                    catch (IOException ioe) 
                    { 
                        LOGGER.warn("IOException encountered while attempting to create directory [ " + path + " ].  Exception message => [ " + ioe.getMessage() + " ].");
                    }
                }
                else 
                {
                        valid = true;
                }
            }
            return valid;
	}

}//________________________________________end class____________________________
