package com.example.demo.service;

import com.example.demo.controller.dto.RequestProductDto;
import com.example.demo.controller.dto.ResponseProductDto;
import com.example.demo.controller.dto.ResponseProductInfoDto;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProductService {
    Random randomIdGenerator = new Random();

    public ResponseProductDto getProductWithId(RequestProductDto productData) {
        Long randomId = generateRandomId();
        ResponseProductInfoDto info = new ResponseProductInfoDto(randomId, productData.info().date());
        return new ResponseProductDto(productData.price(), info);
    }

    private Long generateRandomId() {
        return Math.abs(randomIdGenerator.nextLong());
    }
}
