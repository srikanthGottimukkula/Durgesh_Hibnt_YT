package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AnimalMain {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		try {
			Animal animal = new Animal();
			animal.setName("Dog");
			session.save(animal);
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
