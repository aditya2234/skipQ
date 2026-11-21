package com.skipq.notification.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("notificationHealthController")
@RequestMapping("/api/notification")
public class HealthController {
    @GetMapping
    public Map<String, String> status() {
        return Map.of("project", "skipQ", "service", "notification", "status", "UP");
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return status();
    }
}
