package com.wipro.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Update u = new Update(1,"Rose","Red",26);
    	Configuration con = new Configuration().configure();
       SessionFactory sf = con.buildSessionFactory();
       Session s = sf.openSession();
       Transaction tx = s.beginTransaction();
       s.update(u);
       System.out.println(u);
       tx.commit();
       System.out.println("Updated sucessfully");
       
       
    }
}
