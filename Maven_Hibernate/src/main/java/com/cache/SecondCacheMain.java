package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetomany.Employee;

public class SecondCacheMain {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session1 = sessionFactory.openSession();
		Employee employee1 = session1.get(Employee.class, 1);
		System.out.println(employee1);
		session1.close();
		
		Session session2 = sessionFactory.openSession();
		Employee employee2 = session2.get(Employee.class,1);  
		System.out.println(employee2);
		session2.close();
		
		
		
		
	}

}
