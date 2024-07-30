package Advice.AfterReturning;

import Advice.Models.Student;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AfterReturningMain {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("AfterReturning.xml");
        Student simpleService = (Student) context.getBean("student");
        simpleService.printSNameId();
        System.out.println("--------------");
        try {
            simpleService.checkSName();
        } catch (Exception e) {
            System.out.println("SimpleService: Method checkSName() exception thrown..");
        }
        System.out.println("--------------");
        simpleService.Test("aop");
        context.close();
    }
}
