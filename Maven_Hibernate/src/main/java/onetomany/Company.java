package onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;

	@Column(name = "comp_name")
	private String companyName;
	
	@OneToMany(mappedBy = "company",orphanRemoval = true, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Employee> employees;
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Company(String companyName) {
		this.companyName = companyName;
	}
	

	public Company() {
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", companyName=" + companyName + "]";
	}

}
