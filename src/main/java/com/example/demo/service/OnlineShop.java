package com.example.demo.service;

import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import com.example.demo.flowers.Flower;

@Service
@Log4j2
@RequiredArgsConstructor
@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
public class OnlineShop {
    Flower rose;
    Flower tulip;

    @PostConstruct
    public void init() {
        log.info("Online shop created with {} rose and {} tulip", rose.getColor(), tulip.getColor());
    }

    @PreDestroy
    public void destroy() {
        log.info("Online shop destroyed");
    }
}