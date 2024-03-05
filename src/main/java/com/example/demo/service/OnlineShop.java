package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import com.example.demo.interfaces.Flower;


@Service
@Log4j2
public class OnlineShop {
    private final Flower rose;
    private final Flower tulip;

    public OnlineShop(@Qualifier(value = "rose") Flower rose, @Qualifier(value = "tulip") Flower tulip) {
        this.rose = rose;
        this.tulip = tulip;
    }

    @PostConstruct
    public void init() {
        log.info("Online shop  with {} rose and {} tulip", rose.getColor(), tulip.getColor());
    }

    @PreDestroy
    public void destroy() {
        log.info("Online shop destroyed");
    }
}
