package com.test.innerbean;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInvoiceGenerator {
    public static void main(String a[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("innerbean.xml");
        InvoiceGenerator invoice = (InvoiceGenerator) context.getBean("invoicebean");
        invoice.generateInvoice();
    }
}
