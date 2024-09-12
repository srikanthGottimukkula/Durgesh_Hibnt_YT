package com.srikanth.Maven_Hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Mobile {

	private String mbName;

	private Integer price;

	public String getMbName() {
		return mbName;
	}

	public void setMbName(String mbName) {
		this.mbName = mbName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Mobile(String mbName, Integer price) {
		super();
		this.mbName = mbName;
		this.price = price;
	}

	public Mobile() {
		super();
	}

}
