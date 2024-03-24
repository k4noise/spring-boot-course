package com.example.demo.config;

import com.example.demo.config.property.AppProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AppProperty.class)
public class AppPropertyConfig {
}
