package com.solers.delivery.domain.validations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Payload;
import javax.validation.Constraint;


@Constraint(validatedBy = ValidScheduleDurationValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidScheduleDuration {
    
    String message() default "{scheduleexpression.duration.invalid}";
        
    Class<?>[] groups() default{};
    
    Class<? extends Payload>[] payload() default{};
    
}
