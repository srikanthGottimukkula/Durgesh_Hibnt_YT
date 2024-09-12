package com.map.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemoMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration = configuration.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		SessionFactory factory = buildSessionFactory;

		Question q1 = new Question();
		q1.setqID(100);
		q1.setQuestion("what is your name?");

		Answer ans = new Answer();
		ans.setAnsID(200);
		ans.setAnswer("My name is srikrishna!!");

		q1.setAnswer(ans);

		Question q2 = new Question();
		q2.setqID(101);
		q2.setQuestion("How are you ?");

		Answer ans1 = new Answer();
		ans1.setAnsID(201);
		ans1.setAnswer("I am fine!!");

		q2.setAnswer(ans1);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.save(ans1);
		session.save(ans);
		tx.commit();
		
		//fetching 
		Question question = session.get(Question.class, 100);
		System.out.println(question.getQuestion());
		
		//fetching
		Answer answer = session.get(Answer.class, 200);
		System.out.println(answer.getAnswer());

		session.close();
		factory.close();

	}

}
