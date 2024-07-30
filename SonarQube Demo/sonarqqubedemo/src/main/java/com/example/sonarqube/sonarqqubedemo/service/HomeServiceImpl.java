package com.example.sonarqube.sonarqqubedemo.service;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl {
    public String receiveWelcome() {

        String string= " We are scanning through sonarqube server";
        Object object=getObject();
        System.out.println(object.toString());
        return string;
    }

    private Object getObject() {
        return null;
    }
}