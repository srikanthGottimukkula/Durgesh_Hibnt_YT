package com.srikanth.Maven_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		Configuration cfs = cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfs.buildSessionFactory();
		Session session = factory.openSession();

		// get
		Employee std = (Employee) session.get(Employee.class, 100);
		System.out.println(std);

		// load
		Employee std1 = (Employee) session.load(Employee.class, 100);
		System.out.println(std1);

		session.close();
		factory.close();
	}

}
