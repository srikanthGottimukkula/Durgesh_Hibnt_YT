package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int pid;

	@Column(name = "proj_Name")
	private String projName;

	@ManyToMany(mappedBy = "project")
	
	private List<Employee> empolyee;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String projName, List<Employee> empolyee) {
		super();
		this.pid = pid;
		this.projName = projName;
		this.empolyee = empolyee;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public List<Employee> getEmpolyee() {
		return empolyee;
	}

	public void setEmpolyee(List<Employee> empolyee) {
		this.empolyee = empolyee;
	}

}
