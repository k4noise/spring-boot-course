package com.example.demo.service;

import com.example.demo.controller.dto.ProductDto;
import com.example.demo.service.common.Product;
import com.example.demo.service.common.ProductInfo;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProductService {
    Random randomIdGenerator = new Random();

    public Product getProductWithId(ProductDto productData) {
        Long randomId = generateRandomId();
        ProductInfo info = new ProductInfo(randomId, productData.info().date());
        return new Product(productData.price(), info);
    }

    private Long generateRandomId() {
        return Math.abs(randomIdGenerator.nextLong());
    }
}
