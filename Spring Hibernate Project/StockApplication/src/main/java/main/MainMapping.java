package main;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import model.Stock;
import model.StockDetail;

public class MainMapping {
    public static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration
                .buildSessionFactory(builder.build());
        return sessionFactory;
    }
    public static void main(String[] args) {
        System.out.println("Hibernate one to one (Annotation)");
        Session session = getSessionFactory().openSession();

        session.beginTransaction();

        Stock stock = new Stock();

        stock.setStockCode("10003");
        stock.setStockName("Adapters1");

        /*
         * StockDetail stockDetail1 = new StockDetail();
         * stockDetail1.setCompName("Reynold"); stockDetail1.setCompDesc("Iso");
         * stockDetail1.setRemark("Good"); stockDetail1.setListedDate(new Date());
         *
         * stock.setStockDetail(stockDetail1); stockDetail1.setStock(stock);
         */
        StockDetail stockDetail2 = new StockDetail();
        stockDetail2.setCompName("I Ball 1");
        stockDetail2.setCompDesc("Standard1");
        stockDetail2.setRemark("Goodd");
        stockDetail2.setListedDate(new Date());
        stock.setStockDetail(stockDetail2);
        stockDetail2.setStock(stock);

        session.save(stock);
        session.getTransaction().commit();
        System.out.println("Inserting values into tables stock,stock details....");

        System.out.println("Done");
    }
}