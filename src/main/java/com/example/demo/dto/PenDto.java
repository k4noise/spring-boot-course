package com.example.demo.dto;

import com.example.demo.validation.ColorConstraint;
import com.example.demo.validation.ThickConstraint;
import jakarta.validation.constraints.NotBlank;

public record PenDto (
    @NotBlank(message = "Pen name is required") String name,
    @ColorConstraint String inkColor,
    @ThickConstraint byte thickness // в дмм (10 * мм)
) {}
