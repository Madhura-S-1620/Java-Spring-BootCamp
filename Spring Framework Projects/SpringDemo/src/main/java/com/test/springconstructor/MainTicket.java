package com.test.springconstructor;


import com.test.springconstructor.Ticket;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTicket {

    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("Ticket.xml");
        Ticket t1=(Ticket)context.getBean("ticket");
        t1.display();
    }
}
