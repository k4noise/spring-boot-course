package com.example.demo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.awt.*;

public class ColorValidation implements ConstraintValidator<ColorConstraint, String> {
    @Override
    public boolean isValid(String givenColor, ConstraintValidatorContext context) {
        try {
            Color color = (Color) Color.class.getField(givenColor.toUpperCase()).get(null);
            return color != null;
        } catch (Exception exception) {
            return false;
        }
    }
}
