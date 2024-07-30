package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(4, "Core Java");
        Book book1 = new Book(5, "Learn Hibernate");

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.persist(book);
            session.persist(book1);

            // Commit transaction
            transaction.commit();
            System.out.println("Books inserted successfully.");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Book> books = session.createQuery("from Book", Book.class).list();
            books.forEach(b -> {
                System.out.println("Book name: " + b.getName());
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
