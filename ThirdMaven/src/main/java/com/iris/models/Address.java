package com.iris.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="Address_Tab")
public class Address {
	
	@Column(name="HouseNo")
	private String houseNo;
	
	@Column(name="Street")
	private String street;
	
	@Column(name="City")
	private String city;
	
	@Column(name="State")
	private String state;

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	public Address() {}
	
	public Address(String houseNo, String street, String city, String state) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	

}
