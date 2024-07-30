package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Collect.xml");
        ProductBean prod = (ProductBean) context.getBean("productbean");
        System.out.println(prod);
    }
}