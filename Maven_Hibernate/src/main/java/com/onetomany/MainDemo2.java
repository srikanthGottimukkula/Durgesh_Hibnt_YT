package com.onetomany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDemo2 {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration = configuration.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory =
				configuration.addAnnotatedClass(Student.class).addAnnotatedClass(Courses.class).buildSessionFactory();

		SessionFactory factory = buildSessionFactory;

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Student std = new Student();
			std.setSid(1000);
			std.setStdName("dfhfhj");

			Courses c1 = new Courses();
			c1.setCid(54);
			c1.setCousName("dfbdfjfd");
			c1.setStudent(std);

			Courses c2 = new Courses();
			c2.setCid(5);
			c2.setCousName("hdh");
			c2.setStudent(std);
			
			Courses c3 = new Courses();
			c3.setCid(66);
			c3.setCousName("fhbdfhe");
			c3.setStudent(std);
			
			Courses c4 = new Courses();
			c4.setCid(789);
			c4.setCousName("reddgius");
			c4.setStudent(std);
			

			List<Courses> list = Arrays.asList(c1, c2, c3, c4);

			std.setCourses(list);
			
			// or
			/*
			 * List<Courses> lists = new ArrayList<>(); lists.add(c1); lists.add(c2);
			 * lists.add(c3); lists.add(c4); std.setCourses(lists);
			 */
			session.saveOrUpdate(std);
			// session.save(c1);
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}

	}

}
