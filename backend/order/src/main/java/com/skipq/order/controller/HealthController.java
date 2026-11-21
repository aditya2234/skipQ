package com.skipq.order.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("orderHealthController")
@RequestMapping("/api/order")
public class HealthController {
    @GetMapping
    public Map<String, String> status() {
        return Map.of("project", "skipQ", "service", "order", "status", "UP");
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return status();
    }
}
