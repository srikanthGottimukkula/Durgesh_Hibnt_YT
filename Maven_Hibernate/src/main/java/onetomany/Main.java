package onetomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		 SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
	                .addAnnotatedClass(Company.class)
	                .addAnnotatedClass(Employee.class)
	                .buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {

			// parent object creation
			Company company = new Company("samsung");

			// child object creation
			Employee employee1 = new Employee("srikanth");
			employee1.setCompany(company);
			Employee employee2 = new Employee("abhiram");
			employee2.setCompany(company);

			List<Employee> list = Arrays.asList(employee1, employee2);
			company.setEmployees(list);
			session.save(company);
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
