package com.enigma.advancedexp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AdvancedExpApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvancedExpApplication.class, args);
    }

}
