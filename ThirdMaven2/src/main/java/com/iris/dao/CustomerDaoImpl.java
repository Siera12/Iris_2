package com.iris.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iris.models.Customer;
import com.iris.providers.SessionFactoryProvider;

public class CustomerDaoImpl implements CustomerDao{

	public boolean addCustomer(Customer c) {
		try {
			Session session=SessionFactoryProvider.getSF().openSession();
			Transaction tx=session.beginTransaction();
			
			session.save(c);
			tx.commit();
			session.close();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
	}

	public boolean deleteCustomer(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return false;
	}

	public Customer getCustomer(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
