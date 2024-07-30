package com.pack.map ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMap {

    public static void main(String[] args) {
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

            Student s1 = new Student();

            s1.setSname("Madhura Sobalkar");
            s1.setCourse("Spring");
            s1.setFee(1500.50);


            Marks m = new Marks();
            m.setMaths(90);
            m.setChemistry(94);
            m.setPhysics(85);
            s1.setMarks(m);

        Session s = factory.openSession();
        Transaction t= s.beginTransaction();

        s.save(s1);
        t.commit();
        s.close();
        factory.close();

        System.out.println("Done");
    }
}
