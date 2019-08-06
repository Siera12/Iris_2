package com.iris.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="Customer_Tab")
public class Customer {
	
	@Id
	@Column(name="Email")
	private String email;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="ContactNo")
	private int contactNo;
	
	@ElementCollection
	@JoinTable(name="CustomerAddress",joinColumns=@JoinColumn(name="Email"))
	private Set<Address> addresses=new HashSet<>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", name=" + name + ", contactNo=" + contactNo + ", addresses=" + addresses
				+ "]";
	}

	
	
}
