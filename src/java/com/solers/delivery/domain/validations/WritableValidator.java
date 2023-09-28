package com.solers.delivery.domain.validations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class WritableValidator implements ConstraintValidator<Writable, String> {
   @Override
    public boolean isValid(String path, ConstraintValidatorContext unused) 
    {
        boolean valid = false;
        if ((path != null) && (!path.isEmpty())) 
        {
            Path p = Paths.get(path);
            if (Files.exists(p)) 
            {
                    valid = Files.isWritable(p);
            }
            else 
            {
                try 
                {
                        Files.createDirectories(p);
                        valid = true;
                }
                catch (IOException ioe) 
                { 
                    
                }
            }
        }
        return valid;
    }

    @Override
    public void initialize(Writable a) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}//______________________________end class______________________________________
