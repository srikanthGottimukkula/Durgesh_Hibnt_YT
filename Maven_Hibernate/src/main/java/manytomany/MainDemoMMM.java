package manytomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDemoMMM {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration = configuration.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		SessionFactory factory = buildSessionFactory;


		Book b1 = new Book();
		b1.setBid(100);
		b1.setBookName("rich dad poor dad");

		Book b2 = new Book();
		b2.setBid(101);
		b2.setBookName("secret");

		Page p1 = new Page();
		p1.setPid(1);
		p1.setPages(1000);

		Page p2 = new Page();
		p2.setPid(2);
		p2.setPages(2000);

		List<Page> pagesList = Arrays.asList(p1, p2);
		List<Book> bookList = Arrays.asList(b1, b2);

		p1.setBook(bookList);
		b1.setPage(pagesList);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(b1);
		session.save(b2);
		session.save(p1);
		session.save(p2);
		

		tx.commit();
		session.close();
		factory.close();

	}

}
