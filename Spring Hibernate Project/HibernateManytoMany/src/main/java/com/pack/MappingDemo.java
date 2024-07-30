package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MappingDemo {

    public static void main(String[]args){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Employee e1= new Employee();
        Employee e2 = new Employee();

        e1.setEmpid(34);
        e1.setName("Naina");

        e2.setEmpid(35);
        e2.setName("Ria");

        Project p1 = new Project();
        Project p2 =new Project();

        p1.setPid(1212);
        p1.setProjectName("Travel Management System");

        p2.setPid(1214);
        p2.setProjectName("ChatBot");


        List<Employee> list1=new ArrayList<Employee>();
        List<Project>list2 =new ArrayList<Project>();


        list1.add(e1);
        list1.add(e2);

        list2.add(p1);
        list2.add(p2);

        e1.setProjects(list2);
        e2.setProjects(list2);

        p1.setEmps(list1);
        p2.setEmps(list1);


        Session s= factory.openSession();
        Transaction t = s.beginTransaction();

        s.save(e1);
        s.save(e2);
        s.save(p1);
        s.save(p2);

        t.commit();

        factory.close();
    }
}
