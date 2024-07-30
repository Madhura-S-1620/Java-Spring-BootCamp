package com.hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class mainSb {
    public static void main(String[] args) {
        run(mainSb.class, args);
        System.out.println("hello in mainSb");

    }
}
