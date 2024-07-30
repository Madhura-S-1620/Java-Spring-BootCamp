package com.example.sonarqube.sonarqqubedemo.controller;

import com.example.sonarqube.sonarqqubedemo.service.HomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeServiceImpl service;

    @GetMapping("/")
    public String receiveWelcome()
    {
        return service.receiveWelcome();
    }
}