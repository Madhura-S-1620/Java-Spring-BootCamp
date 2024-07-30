package com.test.Main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.Beans.ClassObject;

public class MainApp {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        ConfigurableApplicationContext   context = new ClassPathXmlApplicationContext("ObjectBean.xml");

        ClassObject obj = context.getBean("classobject",ClassObject.class);
        System.out.println("Name= " + obj.getName());
        // Closing the context object.
        context.close();
    }}
