package com.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration = configuration.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		SessionFactory factory = buildSessionFactory;

		Employees emps = new Employees();
		emps.setEmployeeId(10);
		emps.setEmail("gmksrikanth@gmail.com");
		emps.setFirstName("srikanth");
		emps.setLastName("gmk");
		emps.setJobId("ED6542S");
		emps.setPhoneNo("996677885544");
		emps.setSalary(10000.00);

		Employees emps1 = new Employees();
		emps1.setEmployeeId(15);
		emps1.setEmail("abhiram@gmail.com");
		emps1.setFirstName("abhi");
		emps1.setLastName("ram");
		emps1.setJobId("FTR576");
		emps1.setPhoneNo("888888888");
		emps1.setSalary(5000.00);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emps);
		session.save(emps1);
		tx.commit();

		session.close();
		factory.close();

	}

}
