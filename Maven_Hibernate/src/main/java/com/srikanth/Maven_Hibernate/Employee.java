package com.srikanth.Maven_Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private Integer id;

	private String name;

	private String address;
	
	private Mobile mobile;

	public Integer getId() {
		return id;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public Employee(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee() {
		super();
	}

}
