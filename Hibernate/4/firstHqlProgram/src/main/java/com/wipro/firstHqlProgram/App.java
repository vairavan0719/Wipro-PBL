package com.wipro.firstHqlProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in);
        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session s =sf.openSession();
        Query query = s.createQuery("from Hql where manufacturing Like:i");
        System.out.print("Enter the reg_no:");
        String reg=input.next();
        query.setParameter("i",reg+"%");
        List l = query.list();
        if(l.size()==0){
        	System.out.println("No records founded");
        	}
        for(Object i:l){
        System.out.println(i);
        }
    }
}
