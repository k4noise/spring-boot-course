package com.example.demo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;

import java.lang.annotation.*;

@Constraint(validatedBy = {})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@NotNull(message = "Pen thickness is required")
@Min(value = 5, message = "Pen thickness can't be less than 5dmm")
@Max(value = 12, message = "Pen thickness can't be more than 12dmm")
public @interface ThickConstraint {
    String message() default "Wrong pen thickness";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
