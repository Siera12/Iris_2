package com.iris.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Product_Tab")
public class Product {
	@Id
	@GeneratedValue
	@Column(name="P_Id")
	private int productId;
	
	@Column(name="P_Name")
	private String productName;
	
	@Column(name="P_Price")
	private double price;
	
	@Column(name="P_Quantity")
	private int quantity;
	
	@Column(name="P_Description")
	private String description;
	
	
	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String toString(){
		return "Product [id=" + productId + ", name=" + productName + ", Price=" + price +",Quantity+" +quantity + ", Description=" + description+ "]";
		
	}
}
