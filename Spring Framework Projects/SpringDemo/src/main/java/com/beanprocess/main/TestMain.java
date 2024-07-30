package com.beanprocess.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beanprocess.beans.TestConnection;

public class TestMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context  = new ClassPathXmlApplicationContext("Postprocessor.xml");
        TestConnection networkMng = (TestConnection) context.getBean("connectionmanager");
        networkMng.readData();
        context.close();
    }}
