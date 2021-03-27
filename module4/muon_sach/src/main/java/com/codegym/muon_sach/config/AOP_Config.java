package com.codegym.muon_sach.config;

import com.codegym.muon_sach.aop.AOP;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AOP_Config {
    @Bean
    public AOP aop() {
        return new AOP();
    }
}
