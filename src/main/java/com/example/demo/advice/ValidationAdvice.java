package com.example.demo.advice;

import com.example.demo.advice.responce.ValidationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;

@RestControllerAdvice
@RequiredArgsConstructor
public class ValidationAdvice extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception,
                                                                  HttpHeaders headers,
                                                                  HttpStatusCode status,
                                                                  WebRequest request) {
        var errors = new ArrayList<>(exception.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error -> new ValidationResponse("Validation error", error.getField(), error.getRejectedValue(), error.getDefaultMessage())).toList());
        errors.addAll(exception.getBindingResult().getGlobalErrors().stream()
                .map(error -> new ValidationResponse(error.getDefaultMessage())).toList());

        return ResponseEntity.badRequest()
                .body(errors);
    }
}