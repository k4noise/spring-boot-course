package com.example.demo.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleCustomException(Exception exception) {
        return ResponseEntity
                .status(HttpStatus.BAD_GATEWAY)
                .body("This is my custom 502 error: " + exception.getLocalizedMessage());
    }
}
