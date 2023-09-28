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
package com.solers.delivery.domain.validations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
//import org.hibernate.validator.ValidatorClass; //deprecated
//import com.solers.delivery.validator.ValidatorClass;

//import com.solers.delivery.domain.validations.validators.ExistingDirectoryValidator;

/**
 * @author <a href="mailto:kconaway@solers.com">Kevin Conaway</a>
 */
//@ValidatorClass(ExistingDirectoryValidator.class)
@Constraint(validatedBy = ExistingDirectoryValidator.class)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExistingDirectory 
{
    
    String message() default "{pathNotExist}";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default{};
    
}
