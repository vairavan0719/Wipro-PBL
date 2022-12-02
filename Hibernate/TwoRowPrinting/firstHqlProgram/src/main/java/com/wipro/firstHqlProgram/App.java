package com.wipro.firstHqlProgram;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session s =sf.openSession();
        Query query = s.createQuery("from Hql");
        List l = query.list();
        for(Object i:l){
        System.out.println(i);
        }
    }
}
