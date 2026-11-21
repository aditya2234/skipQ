package com.skipq;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("skipqHealthController")
@RequestMapping("/api/health")
public class HealthController {
    @GetMapping
    public Map<String, String> health() {
        return Map.of("project", "skipQ", "status", "UP");
    }

    @GetMapping("/{service}")
    public Map<String, String> serviceHealth(@PathVariable String service) {
        return Map.of("project", "skipQ", "service", service, "status", "UP");
    }
}