package com.wipro.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product p = new Product("Bat",2000);
        Product p1 = new Product("Stamps",1000);
    	Configuration con = new Configuration().configure().addAnnotatedClass(Product.class);
        SessionFactory sf = con.buildSessionFactory();
        Session s =sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(p);
        s.save(p1);
        tx.commit();
    }
}
