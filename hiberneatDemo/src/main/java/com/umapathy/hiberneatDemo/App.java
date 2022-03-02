package com.umapathy.hiberneatDemo;

import org.hibernate.cfg.Configuration;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class App 
{
    public static void main( String[] arg)
    {
        Employee employee= new Employee();
        
        employee.setEmpId(101);
        employee.setEmpName("Umapathy");
        employee.setJob("Ass.Eng");
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session session=sf.openSession();
        
        org.hibernate.Transaction tnx=session.beginTransaction();
        
        tnx.commit();
        
       session.save(employee);
         
    
        
  }
}
