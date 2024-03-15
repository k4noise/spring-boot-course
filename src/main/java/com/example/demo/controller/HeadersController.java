package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/headers")
public class HeadersController {
    @GetMapping
    public Map<String, String> getHeaders(@RequestHeader Map<String, String> headers){
        return headers;
    }
}
