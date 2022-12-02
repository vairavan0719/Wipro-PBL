package com.wipro.Demo5;
import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args ) {
    	Demo obj = new Demo();
    	obj.setRollnumber(421);
    	obj.setName("Praveen");
    	obj.setDepartment("Mechanical");
       Configuration con=new Configuration().configure().addAnnotatedClass(Demo.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session s= sf.openSession();
    	org.hibernate.Transaction tx = s.beginTransaction();
    	s.save(obj);
    	tx.commit();
    	System.out.println("One row inserted");
    	
    }
}
