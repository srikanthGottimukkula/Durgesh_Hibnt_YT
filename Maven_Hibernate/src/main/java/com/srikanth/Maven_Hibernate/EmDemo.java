package com.srikanth.Maven_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		Configuration cfs = cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfs.buildSessionFactory();
		Session session = factory.openSession();

		Employee emp = new Employee();
		emp.setAddress("pune");
		emp.setId(200);
		emp.setName("abhiram");

		Mobile mob1 = new Mobile();
		mob1.setMbName("moto");
		mob1.setPrice(9999);
		emp.setMobile(mob1);

		Employee emp1 = new Employee();
		emp1.setAddress("mumbai");
		emp1.setId(201);
		emp1.setName("krishna");

		Mobile mob2 = new Mobile();
		mob2.setMbName("apple");
		mob2.setPrice(1111);
		emp1.setMobile(mob2);

		Transaction tx = session.beginTransaction();
		session.save(emp);
		session.save(emp1);
		tx.commit();

		factory.close();
		session.close();

	}

}
