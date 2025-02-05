package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetomany.Employee;

public class cacheMain {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();

		Employee employee = session.get(Employee.class, 1);
		System.out.println(employee);

		Employee employee1 = session.get(Employee.class, 1);
		System.out.println(employee1);

		System.out.println("working !!");
		System.out.println(session.contains(employee1));
		
		session.close();

	}

}
