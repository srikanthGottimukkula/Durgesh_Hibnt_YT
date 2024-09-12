package com.srikanth.Maven_Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addId;

	@Column(length = 12, name = "vge")
	private String village;

	@Transient
	private boolean is;

	public Address() {
		super();
	}

	public Address(Integer addId, String village, boolean is, byte[] image) {
		super();
		this.addId = addId;
		this.village = village;
		this.is = is;
		this.image = image;
	}

	@Lob
	private byte[] image;

	public Integer getAddId() {
		return addId;
	}

	public void setAddId(Integer addId) {
		this.addId = addId;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public boolean isIs() {
		return is;
	}

	public void setIs(boolean is) {
		this.is = is;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

}
