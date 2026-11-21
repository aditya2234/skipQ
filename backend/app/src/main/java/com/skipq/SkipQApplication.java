package com.skipq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.skipq")
public class SkipQApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkipQApplication.class, args);
    }
}
