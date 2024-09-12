package com.srikanth.Maven_Hibernate;

import java.io.FileInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("project is started!!");
		Configuration configuration = new Configuration();
		configuration = configuration.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		SessionFactory factory = buildSessionFactory;
		System.out.println(factory);

		System.out.println("Hello World!");

//		Employee emp = new Employee(100, "abhiram", "warangal");
		Employee emp = new Employee();
		emp.setId(100);
		emp.setAddress("hyd");
		emp.setName("ramu");
		System.out.println(emp);

		Address ad = new Address();
		ad.setAddId(101);
		ad.setIs(true);
		ad.setVillage("warangal");

		FileInputStream fis = new FileInputStream("src/main/java/pxfuel.jpg");
		byte[] bt = new byte[fis.available()];
		ad.setImage(bt);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		session.save(ad);
		tx.commit();
		System.out.println("project is executed!!");
		session.close();

	}
}
