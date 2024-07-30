package com.annotation.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("autowireannotation.xml");
       TextEditor te= (TextEditor) context.getBean("textEditor");
        System.out.println(te.getSpellChecker());
       // System.out.println(te.getSpellChecker());



    }
}
