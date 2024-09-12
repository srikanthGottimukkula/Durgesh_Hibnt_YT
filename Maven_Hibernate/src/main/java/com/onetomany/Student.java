package com.onetomany;

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
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;

	@Column(name = "student_name")
	private String stdName;

	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Courses> courses;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	public Student(Integer sid, String stdName, List<Courses> courses) {
		super();
		this.sid = sid;
		this.stdName = stdName;
		this.courses = courses;
	}

	public Student() {
		super();
	}
	
	 // Utility method to add employee
//    public void addCourses(Courses course) {
//    	course.setStudent(this);
//        this.courses.add(course);
//    }

}
