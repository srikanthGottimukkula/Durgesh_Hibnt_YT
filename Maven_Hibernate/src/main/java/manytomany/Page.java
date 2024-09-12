package manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Page {

	@Id
	private int pid;

	@Column(name = "pages")
	private int pages;

	@ManyToMany(mappedBy = "page")

	private List<Book> book;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public Page(int pid, int pages, List<Book> book) {
		super();
		this.pid = pid;
		this.pages = pages;
		this.book = book;
	}

	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}

}
