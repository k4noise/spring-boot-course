package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.flowers.Tulip;
import com.example.demo.flowers.Rose;
import com.example.demo.flowers.Flower;


@Configuration
public class ShopConfig {

    @Bean
    public Flower rose() {
        return new Rose("black");
    }

    @Bean
    public Flower tulip() {
        return new Tulip("red");
    }
}
