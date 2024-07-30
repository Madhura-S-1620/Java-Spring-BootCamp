package com.onetomany.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {

    public static void main(String[]args){
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Employee e = new Employee();
        //e.setEmpid(101);
        e.setEmail("abc123@gmail.com");
        e.setFname("John");  // Ensure first name is set
        e.setLname("Doe");


        Account account =new Account();
        //account.setAccountId(222);
        account.setAccountNo("76281");
        account.setEmployee(e);

        Account account1 =new Account();
        //account1.setAccountId(229);
        account1.setAccountNo("76772");
        account1.setEmployee(e);

        Account account2=new Account();
        //account2.setAccountId(225);
        account2.setAccountNo("7683");
        account2.setEmployee(e);

        List<Account> list = new ArrayList<Account>();
        list.add(account);
        list.add(account1);
        list.add(account2);

        e.setAccounts(list);

        Session s = factory.openSession();
        Transaction t= s.beginTransaction();

        s.save(e);
        t.commit();
        s.close();
        factory.close();


    }
}
