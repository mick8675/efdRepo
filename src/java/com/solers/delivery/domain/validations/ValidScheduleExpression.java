package com.solers.delivery.domain.validations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=ValidScheduleExpressionValidator.class)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidScheduleExpression 
{    
    String message() default "{scheduleexpression.invalid}";

    Class<?>[] groups() default{};
    
    Class<? extends Payload>[] payload() default{};

}