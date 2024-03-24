package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;

@Log4j2
public record FirstBean() {
    @PostConstruct
    public void init() {
        log.info("First bean created");
    }
}
