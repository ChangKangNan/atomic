package com.example.atomic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class AtomicApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtomicApplication.class, args);
    }

}
