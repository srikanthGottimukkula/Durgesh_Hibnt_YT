package com.mapping.xml;

public class Person {

	private int id;

	private String name;

	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
