package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import com.example.demo.flowers.Flower;

@Service
@Log4j2
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Studio {
    Flower rose;
    Flower tulip;

    @Autowired
    public void setRose(Flower rose) {
        this.rose = rose;
    }

    @Autowired
    public void setTulip(Flower tulip) {
        this.tulip = tulip;
    }

    @PostConstruct
    public void init(){
        log.info("Studio created with {} rose and {} tulip", rose.getColor(), tulip.getColor());
    }

    @PreDestroy
    public void destroy(){
        log.info("Studio destroyed");
    }
}
