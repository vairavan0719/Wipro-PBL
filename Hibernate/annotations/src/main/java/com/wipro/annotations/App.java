package com.wipro.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Annotations a = new Annotations("A","LXI","Red","Maruti");
    	Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(a);
        tx.commit();
        System.out.println(a);
        System.out.print("one row inserted");
        s.close();
    }
}
