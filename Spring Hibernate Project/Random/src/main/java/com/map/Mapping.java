package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Mapping {

    public static void main(String[]args){

        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Question q1 =new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("What is java?");

        Answer answer = new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("Java is programming Language");
        answer.setQuestion(q1);

        Answer answer1 = new Answer();
        answer1.setAnswerId(33);
        answer1.setAnswer("With the help of java we can cretate software");
        answer1.setQuestion(q1);

        Answer answer2 = new Answer();
        answer2.setAnswerId(363);
        answer2.setAnswer("Java has different types of frameworks");
        answer2.setQuestion(q1);

        List<Answer> list = new ArrayList<Answer>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);
        q1.setAnswers(list);


        Session s = factory.openSession();
        Transaction t = s.beginTransaction();

        s.save(q1);
        t.commit();
        s.close();
        factory.close();

    }



}
