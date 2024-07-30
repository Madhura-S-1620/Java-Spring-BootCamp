package com.example.autoconfiguration;

// src/main/java/com/example/demo/GreetingController.java


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello, in autoconfigured World!";
    }
}
