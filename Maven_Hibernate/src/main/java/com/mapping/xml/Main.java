package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration = configuration.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		SessionFactory factory = buildSessionFactory;

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		try {

			Person p1 = new Person("abhiram", "Warangal");
			session.save(p1);
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			factory.close();
			session.close();
		}

	}
}
