package main;

import Account.SavingAccount;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;

public class CustomerAccountRepository {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry =
                new StandardServiceRegistryBuilder()
                        .configure("hibernate.cfg.xml")
                        .build();
        Metadata metadata = new MetadataSources(standardServiceRegistry)
                .getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        ArrayList<String> depositlist1 = new ArrayList<>();
        depositlist1.add("Fifty thousands");
        depositlist1.add("Seventy thousands");
        depositlist1.add("One thousand");
        depositlist1.add("Forty thousands");

        ArrayList<String> depositlist2 = new ArrayList<>();
        depositlist2.add("Ten thousands");
        depositlist2.add("Five thousands");
        depositlist2.add("Twelve thousands");
        depositlist2.add("Three thousands");

        SavingAccount savingAccount1 = new SavingAccount();
        savingAccount1.setCustname("Jaydeep Rana");
        savingAccount1.setDeposits(depositlist1);

        SavingAccount savingAccount2 = new SavingAccount();
        savingAccount2.setCustname("Khushbu Zala");
        savingAccount2.setDeposits(depositlist2);

        session.save(savingAccount1);
        session.save(savingAccount2);

        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Saving Account table created and deposit details also added..");
    }
}
