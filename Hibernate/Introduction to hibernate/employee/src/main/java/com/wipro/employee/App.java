package com.wipro.employee;

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
    	Employee e = new Employee("Vairavan","Manager",20000);
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory sf = con.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(e);
        tx.commit();
        System.out.println("One row inserted");
        System.out.println(e.toString());
    }
}
