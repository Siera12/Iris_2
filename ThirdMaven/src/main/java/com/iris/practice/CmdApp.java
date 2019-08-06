package com.iris.practice;

import java.util.HashSet;
import java.util.Set;

import com.iris.dao.CustomerDao;
import com.iris.dao.CustomerDaoImpl;
import com.iris.models.Address;
import com.iris.models.Customer;

public class CmdApp {
	 public static void main( String[] args )
	 
	    {
		 
		 Address addr1=new Address("11","abc street","Noida","UP");
		 Address addr2=new Address("11","abc street","Noida","UP");
		 
		 Set<Address> addressSet=new HashSet<>();
		 addressSet.add(addr1);
		 addressSet.add(addr2);
		 
		 
		 
	Customer c=new Customer();
	c.setEmail("hanzo@gg.com");
	c.setName("Hanzo");
	c.setContactNo(8457456);
	c.setAddresses(addressSet);
	
	CustomerDao daoObj=new CustomerDaoImpl();
	boolean r=daoObj.addCustomer(c);
	if(r){
		System.out.println("Customer added");
	}
	else {
		System.out.println("Customer not added");
	}

}
}