package com.pack.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.math.BigDecimal;

public class MainMap {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Account a1 = new Account();
        a1.setAccountNo("56909090");
        a1.setAccountType("saving");
        a1.setClosingBalance(new BigDecimal("89000.456"));

        Customer c1 = new Customer();
        c1.setName("Mrs. Sharda Sinha");
        c1.setAccount(a1);

        a1.setCustomer(c1);  // Set the customer in account

        Session s = factory.openSession();
        Transaction t = s.beginTransaction();

        s.save(c1);
        t.commit();
        s.close();
        factory.close();

        System.out.println("Done");
    }
}