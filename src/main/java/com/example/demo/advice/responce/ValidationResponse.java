package com.example.demo.advice.responce;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ValidationResponse(String error, String field, Object value, String message) {
    public ValidationResponse(String message) {
        this(null, null, null, message);
    }
}