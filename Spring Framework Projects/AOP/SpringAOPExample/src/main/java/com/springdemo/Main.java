package com.springdemo;



import com.springdemo.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopdemo.xml");

        Employee employee = context.getBean("employee", Employee.class);

        // Test methods
        employee.work();
        employee.takeBreak();
        try {
            employee.throwException();
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }

        context.close();
    }
}
