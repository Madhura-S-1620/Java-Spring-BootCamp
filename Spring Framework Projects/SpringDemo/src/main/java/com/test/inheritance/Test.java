package com.test.inheritance;



import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String a[]){

        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext("beaninheritance.xml");
                Book mybook = (Book) context.getBean("myBookBean");
        Book mybook1 = (Book) context.getBean("myBookBean1");
        System.out.println(mybook.toString());
        System.out.println(mybook1.toString());


    }
}
