package com.manytomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDemoMM {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration = configuration.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		SessionFactory factory = buildSessionFactory;
	

		Employee e1 = new Employee();
		e1.setEid(100);
		e1.setEmpName("srikanth");

		Employee e2 = new Employee();
		e2.setEid(101);
		e2.setEmpName("abhiram");

		Project p1 = new Project();
		p1.setPid(200);
		p1.setProjName("apple");
		Project p2 = new Project();
		p2.setPid(201);
		p2.setProjName("moto");

		List<Employee> empLists = Arrays.asList(e1, e2);
		List<Project> projLists = Arrays.asList(p1, p2);
		e1.setProject(projLists);
		p1.setEmpolyee(empLists);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);

		tx.commit();
		session.close();
		factory.close();

	}

}
