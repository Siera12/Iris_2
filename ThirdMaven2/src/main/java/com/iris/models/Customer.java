package com.iris.models;

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
	
	
	
	@Column(name="Address")
	private Address addr;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="houseNo",column=@Column(name="c_hNo")),
		@AttributeOverride(name="street",column=@Column(name="c_street")),
		@AttributeOverride(name="city",column=@Column(name="c_city")),
		@AttributeOverride(name="state",column=@Column(name="c_state")),
	})
	private Address presentAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="houseNo",column=@Column(name="p_hNo")),
		@AttributeOverride(name="street",column=@Column(name="p_street")),
		@AttributeOverride(name="city",column=@Column(name="p_city")),
		@AttributeOverride(name="state",column=@Column(name="p_state")),
	})
	private Address permamentAddress;

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

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Address getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}

	public Address getPermamentAddress() {
		return permamentAddress;
	}

	public void setPermamentAddress(Address permamentAddress) {
		this.permamentAddress = permamentAddress;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", name=" + name + ", contactNo=" + contactNo + ", addr=" + addr
				+ ", presentAddress=" + presentAddress + ", permamentAddress=" + permamentAddress + "]";
	}

	public Customer() {}
	
	public Customer(String email, String name, int contactNo, Address addr, Address presentAddress,
			Address permamentAddress) {
		super();
		this.email = email;
		this.name = name;
		this.contactNo = contactNo;
		this.addr = addr;
		this.presentAddress = presentAddress;
		this.permamentAddress = permamentAddress;
	}

	
	
	
}
