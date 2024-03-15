package com.example.demo.controller;

import com.example.demo.controller.dto.ProductDto;
import com.example.demo.service.common.Product;
import com.example.demo.service.ProductService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProductController {
    ProductService service;

    @GetMapping("/info")
    public Product getProductWithId(@RequestBody ProductDto product) {
        return service.getProductWithId(product);
    }
}
