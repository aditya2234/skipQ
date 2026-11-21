package com.skipq.tracking.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("trackingHealthController")
@RequestMapping("/api/tracking")
public class HealthController {
    @GetMapping
    public Map<String, String> status() {
        return Map.of("project", "skipQ", "service", "tracking", "status", "UP");
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return status();
    }
}
