package com.wipro.count;

import java.util.List;

import org.hibernate.Criteria;
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
        Criteria c = s.createCriteria(Count.class);
        c.add(Restrictions.eq("reg_no", "KL-09"));
        List l =c.list();
        System.out.println("Number of records founded with given register no:"+l.size());
    }
}
