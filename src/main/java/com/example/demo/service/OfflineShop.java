package com.example.demo.service;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import com.example.demo.flowers.Flower;

@Service
@Log4j2
@FieldDefaults(level= AccessLevel.PRIVATE)
public class OfflineShop {
    @Autowired
    Flower rose;

    @Autowired
    Flower tulip;

    @PostConstruct
    public void init(){
        log.info("Offline shop created with {} rose and {} tulip", rose.getColor(), tulip.getColor());
    }

    @PreDestroy
    public void destroy(){
        log.info("Offline shop destroyed");
    }
}
