package com.iris.dao;

import java.util.List;

import com.iris.models.Customer;

public interface CustomerDao {
	
	public boolean addCustomer(Customer c);
	public boolean deleteCustomer(String email);
	public boolean updateCustomer(Customer c);
	public Customer getCustomer(String email);
	public List<Customer> getAllCustomers();

}
