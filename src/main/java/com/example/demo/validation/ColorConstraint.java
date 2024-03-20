package com.example.demo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;
import java.lang.annotation.*;

@Constraint(validatedBy = ColorValidation.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@NotNull(message = "Pen color is required")
public @interface ColorConstraint {
    String message() default "Invalid pen color";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
