// src/main/java/com/example/demo/GreetingService.java
package com.example.propertyyml;

import com.example.propertyyml.GreetingProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingProperties greetingProperties;

    @Autowired
    public GreetingService(GreetingProperties greetingProperties) {
        this.greetingProperties = greetingProperties;
    }

    public String getGreeting() {
        return greetingProperties.getMessage() + ", " + greetingProperties.getName() + "!";
    }
}
