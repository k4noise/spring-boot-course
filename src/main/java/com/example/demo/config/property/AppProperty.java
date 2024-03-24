package com.example.demo.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.List;

@ConfigurationProperties("app")
public record AppProperty (
        String name,
        List<String> saints,
        String env
) { }
