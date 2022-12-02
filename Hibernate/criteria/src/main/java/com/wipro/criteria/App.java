package com.wipro.criteria;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session s =sf.openSession();
        org.hibernate.Criteria c = s.createCriteria(Criteria.class);
        c.add(Restrictions.eq("color","Silver"));
        List l =c.list();
        System.out.println(l);
    }
}
