package manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	private int bid;

	@Column(name = "book_name")
	private String bookName;
	
	@ManyToMany
	@JoinTable(name = "Book_Page_Tbl",

	joinColumns = { @JoinColumn(name = "book_id") }, inverseJoinColumns = { @JoinColumn(name = "page_id") })
	private List<Page> page;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<Page> getPage() {
		return page;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String bookName, List<Page> page) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.page = page;
	}

	public void setPage(List<Page> page) {
		this.page = page;
	}


}
