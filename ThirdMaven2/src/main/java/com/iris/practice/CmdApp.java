package com.iris.practice;

import com.iris.dao.CustomerDao;
import com.iris.dao.CustomerDaoImpl;
import com.iris.models.Address;
import com.iris.models.Customer;

public class CmdApp {
	 public static void main( String[] args )
	    {
	
	Address a=new Address("25","anystreet","Noida","up");
	Address a1=new Address("874","anystreet789","Noida85","up48");
	Address a2=new Address("28","anystreetgg","Noidagg","upgg");
	Customer c=new Customer("hanzo@gg.com","hanzo",258457,a,a1,a2);
	
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