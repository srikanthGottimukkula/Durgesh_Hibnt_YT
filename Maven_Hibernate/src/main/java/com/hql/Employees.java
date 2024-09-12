package com.hql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees_tbl")
public class Employees {

	/*
	 * employee_id INT AUTO_INCREMENT PRIMARY KEY, first_name VARCHAR(50), last_name
	 * VARCHAR(50), email VARCHAR(100) UNIQUE, phone_number VARCHAR(15), hire_date
	 * DATE, job_id VARCHAR(10), salary DECIMAL(10, 2), manager_id INT,
	 * department_id INT
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phoneNo;

	@Column(name = "job_id")
	private String jobId;

	private Double salary;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employees(Integer employeeId, String firstName, String lastName, String email, String phoneNo, String jobId,
			Double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.jobId = jobId;
		this.salary = salary;
	}

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

}
