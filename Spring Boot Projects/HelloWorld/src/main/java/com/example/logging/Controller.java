package com.example.logging;


// src/main/java/com/example/demo/LoggingController.java


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/log")
    public String logExample() {
        logger.trace("This is a TRACE level log message.");
        logger.debug("This is a DEBUG level log message.");
        logger.info("This is an INFO level log message.");
        logger.warn("This is a WARN level log message.");
        logger.error("This is an ERROR level log message.");
        return "Check the logs to see the output.";
    }
}
