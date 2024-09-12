package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int eid;

	@Column(name = "Emp_Name")
	private String empName;

	@ManyToMany
	@JoinTable(name = "proj_Emp_Tbl", joinColumns = { @JoinColumn(name = "emp_id") }, inverseJoinColumns = {
			@JoinColumn(name = "proj_id") }
	)
	private List<Project> project;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String empName, List<Project> project) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.project = project;
	}

	public int getEid() {
		return eid;
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

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

}
