package onetomany;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;

	@Column(name = "emp_name")
	private String empName;

	@ManyToOne
	@JoinColumn(name="emp_id")
	private Company company;
	
	public int getEid() {
		return eid;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empName=" + empName + "]";
	}

	public Employee(String empName) {
		this.empName = empName;
	}

	public Employee() {
	}

}
