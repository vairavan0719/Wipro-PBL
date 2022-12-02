package com.flower.Flower;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Flower f = new Flower();
        f.setFlower_id(3);
        f.setFlower_name("Lily");
        f.setColor("Rose");
        f.setPrice(12);
        Configuration con = new Configuration().configure().addAnnotatedClass(Flower.class);
        SessionFactory sf = con.buildSessionFactory();
        Session s = sf.openSession();
        org.hibernate.Transaction tx = s.beginTransaction();
        s.save(f);
        tx.commit();
        System.out.println(f.toString());
        System.out.println("One row inserted");
    }
}
