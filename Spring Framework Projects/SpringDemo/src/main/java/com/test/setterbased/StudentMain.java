package com.test.setterbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Setter.xml");

        Student st1=(Student)context.getBean("student");
        st1.display();
    }
}

