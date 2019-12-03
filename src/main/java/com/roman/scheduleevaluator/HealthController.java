package com.roman.scheduleevaluator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    public static final String HEALTH_CHECK_MESSAGE = "At least you can see the response";

    @GetMapping("/health")
    public String healthCheck() {
        return HEALTH_CHECK_MESSAGE;
    }
}
