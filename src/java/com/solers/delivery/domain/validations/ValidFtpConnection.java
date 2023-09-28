package com.solers.delivery.domain.validations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Payload;
import javax.validation.Constraint;

@Constraint(validatedBy=ValidFtpConnectionValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidFtpConnection 
{
    
    String message() default "{contentset.ftpconnection.required}";
    
    Class<?>[] groups() default{};
    
    Class<? extends Payload>[] payload() default{};
}
