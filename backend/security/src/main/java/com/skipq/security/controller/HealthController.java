package com.skipq.security.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("securityHealthController")
@RequestMapping("/api/security")
public class HealthController {
    @GetMapping
    public Map<String, String> status() {
        return Map.of("project", "skipQ", "service", "security", "status", "UP");
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return status();
    }
}
