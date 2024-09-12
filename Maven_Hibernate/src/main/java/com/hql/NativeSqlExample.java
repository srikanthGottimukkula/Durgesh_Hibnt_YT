package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class NativeSqlExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration = configuration.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		SessionFactory factory = buildSessionFactory;

		Session s = factory.openSession();

		String query = "SELECT * FROM employees_tbl";

		NativeQuery sqlQuery = s.createSQLQuery(query);

		List<Object[]> list = sqlQuery.list();

		for (Object[] emps : list) {
//			System.out.println(Arrays.deepToString(emps));
			System.out.println(emps[0]+ " : "+emps[4]);
		}
		
		s.close();
		factory.close();

	}

}
