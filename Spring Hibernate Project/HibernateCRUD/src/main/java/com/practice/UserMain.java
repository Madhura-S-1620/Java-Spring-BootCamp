package com.practice;

import com.practice.hb.User;
import com.practice.util.UserUtil;
import jakarta.transaction.SystemException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.hibernate.type.descriptor.java.LocalDateJavaType;

import java.time.LocalDate;
import java.util.List;

public class UserMain {
    public static void main(String[] args) throws SystemException {


        User user1 = new User("Tarun Gandhi", LocalDate.of(1990,2,1));
        User user2 = new User("Trisha Trivedi",LocalDate.of(1996,4,8));
        Transaction transaction = null;

        try (Session session = UserUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            try {
                session.persist(user1);
                session.persist(user2);
                transaction.commit();
            } catch (Exception e) {
                if (transaction.getStatus() == TransactionStatus.ACTIVE) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



        try (Session session = UserUtil.getSessionFactory().openSession()) {
            List<User> books = session.createQuery("from User", User.class).list();
            books.forEach(b -> {
                System.out.println("Print User name : " + b.getName());
            });
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}

