package com.example.demo.config;

import com.example.demo.common.FirstBean;
import com.example.demo.common.SecondBean;
import com.example.demo.common.ThirdBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BeansConfig {
    @Profile("test")
    @Bean
    public FirstBean firstBean() {
        return new FirstBean();
    }

    @Bean
    @ConditionalOnBean(name = "firstBean")
    public SecondBean secondBean() {
        return new SecondBean();
    }

    @Bean
    @ConditionalOnProperty(name = "app.env", havingValue = "default", matchIfMissing = true)
    public ThirdBean thirdBean() {
        return new ThirdBean();
    }
}
