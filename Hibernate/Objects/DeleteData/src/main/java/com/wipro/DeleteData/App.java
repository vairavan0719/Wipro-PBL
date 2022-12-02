package com.wipro.DeleteData;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Delete flower_id = new Delete();
        flower_id.setFlower_id(3);
    	Configuration con = new Configuration().configure();
        SessionFactory sf =con.buildSessionFactory();
        Session s =sf.openSession();
        org.hibernate.Transaction tx = s.beginTransaction();
        s.delete(flower_id);
        tx.commit();
        System.out.println(flower_id);
        System.out.println("Deleted sucessfully");
    }
}
