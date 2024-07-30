package com.example.demo.definingqueriesinspringboot;

import com.example.demo.definingqueriesinspringboot.security.CORSConfig;
import com.example.demo.definingqueriesinspringboot.security.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
