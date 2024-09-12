package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLExample {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration = configuration.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		SessionFactory factory = buildSessionFactory;

		Session s = factory.openSession();

		// HQL syntax
		String query = "from Employees as e where e.email=:s and e.firstName=:f";

		Query query1 = s.createQuery(query);
		query1.setParameter("s", "gmksrikanth@gmail.com");
		query1.setParameter("f", "srikanth");

		// single --> (unique)
		// multiple --> list
		List<Employees> list = query1.list();

		// Delete || update || join
		// HQL independent and entity class and variable names
		// SQL dependent sql db column names and tables names
		// delete=? transaction mandatory
		System.out.println("______________________________________");
		Transaction tx = s.beginTransaction();

		// Delete Query
//		Query q2 = s.createQuery("delete from Employees e where e.email=:s");
//		Query setParameter = q2.setParameter("s", "abhiram@gmail.com");
//		int result = q2.executeUpdate();
//		System.out.println(result+ " deleted!!");

		// Update Query
//		Query q3 = s.createQuery("Update from Employees e SET e.firstName=:f WHERE e.email=:m");
//		q3.setParameter("f", "Kalki");
//		q3.setParameter("m", "gmksrikanth@gmail.com");
//		int i = q3.executeUpdate();
//		System.out.println(i);
//		System.out.println("Updated !!");

		// Query q4 = s.createQuery("select c.cousName, c.cid, s.stdName from Student s
		// INNER JOIN s.courses c");
//		Query q4 = s.createQuery("select s.stdName, s.sid, c.cousName from Courses c INNER JOIN c.student s");
//		List<Object[]> rl = q4.getResultList();
//		for (Object[] arr : rl) {
//			System.out.println(Arrays.toString(arr));
//		}
//
//		
//		tx.commit();

//		for (Employees emps : list) {
//			System.out.println(emps.getEmail()+" : "+emps.getFirstName()+" : "+emps.getLastName());
//		}

		//For Pagination in HBNT
		Query q = s.createQuery("From Employees");
		q.setFirstResult(1);
		q.setMaxResults(3);
		List<Employees> list2 = q.list();
		for (Employees li : list2) {
			System.out.println(li.getEmployeeId()+" : "+li.getFirstName() + " : " + li.getLastName() + " : " + li.getEmail());
		}

		s.close();
		factory.close();

	}

}
