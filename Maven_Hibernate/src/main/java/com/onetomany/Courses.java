package com.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;

	@Column(name = "Course_name")
	private String cousName;

	@ManyToOne
	@JoinColumn(name="sid")
	private Student student;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCousName() {
		return cousName;
	}

	public void setCousName(String cousName) {
		this.cousName = cousName;
	}

	public Courses(Integer cid, String cousName, Student student) {
		super();
		this.cid = cid;
		this.cousName = cousName;
		this.student = student;
	}

	public Courses() {
		super();
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
