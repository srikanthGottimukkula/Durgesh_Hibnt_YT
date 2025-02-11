package com.onetomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDemo {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration = configuration.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		SessionFactory factory = buildSessionFactory;

		
		  Student std = new Student(); std.setSid(110); std.setStdName("abhiram");
		  
		  Courses c1 = new Courses(); c1.setCid(10); c1.setCousName("Java");
		  c1.setStudent(std);
		  
		  Courses c2 = new Courses(); c2.setCid(11); c2.setCousName("spring");
		  c2.setStudent(std);
		  
		  Courses c3 = new Courses(); c3.setCid(12); c3.setCousName("hibernate");
		  c3.setStudent(std);
		  
		  Courses c4 = new Courses(); c4.setCid(13); c4.setCousName("microservices");
		  c4.setStudent(std);
		  
		  List<Courses> list = Arrays.asList(c1, c2, c3, c4); std.setCourses(list);
		 

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(std);
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);

//		Student student = session.get(Student.class, 1);
//		System.out.println(student.getSid());
//		System.out.println(student.getStdName());
//		System.out.println(student.getCourses().size());
	
		
//		for (Courses c : student.getCourses()) {
//			System.out.println("List of Courses: "+c.getCousName());
//		}

		tx.commit();
		session.close();
		factory.close();

	}

}
