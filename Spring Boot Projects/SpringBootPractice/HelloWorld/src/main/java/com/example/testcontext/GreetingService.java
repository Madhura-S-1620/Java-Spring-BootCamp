package com.example.testcontext;

// src/main/java/com/example/demo/GreetingService.java


import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting() {
        return "Hello, World!";
    }
}
