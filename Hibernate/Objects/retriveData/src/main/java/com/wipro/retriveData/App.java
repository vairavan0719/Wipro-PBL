package com.wipro.retriveData;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      Data f = new Data();
      int flower_id=1;
      Configuration con = new Configuration().configure();
      SessionFactory sf = con.buildSessionFactory();
      Session s =sf.openSession();
      Transaction tx = s.beginTransaction();
      f=(Data) s.get(Data.class,flower_id);
      tx.commit();
      System.out.println("Retrive "+f);
      
    }
}
