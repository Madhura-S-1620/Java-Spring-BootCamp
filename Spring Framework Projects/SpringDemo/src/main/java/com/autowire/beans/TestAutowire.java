package com.autowire.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestAutowire  {
    public static void main(String[] args) {

        ApplicationContext context =   new ClassPathXmlApplicationContext("beanautowire.xml");

                Employee employee = (Employee) context.getBean ("employee");

        System.out.println(employee.getFullName());

        System.out.println(employee.getDepartmentBean().getName());
    }
}
