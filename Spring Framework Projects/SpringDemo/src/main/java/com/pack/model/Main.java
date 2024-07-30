package com.pack.model;

import com.pack.model.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)  {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        Message mobj= (Message) context.getBean("msg");
        System.out.println(mobj.getMessage());

    }
}