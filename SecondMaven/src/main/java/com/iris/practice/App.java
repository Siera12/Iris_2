package com.iris.practice;

import com.iris.daos.ProductDao;
import com.iris.daos.ProductDaoImpl;
import com.iris.models.Product;

public class App {

	 public static void main( String[] args )
	    {
	    	/*Product p=new Product();
	    	p.setProductName("Overwatch");
	    	p.setPrice(1045);
	    	p.setQuantity(5);
	    	p.setDescription("Best Game Ever");
	    	
	    	ProductDao daoObj=new ProductDaoImpl();
	    	boolean r=daoObj.addProduct(p);
	    	if(r){
	    		System.out.println("Product added");
	    	}
	    	else {
	    		System.out.println("Product not added");
	    	}*/
	    	
		 
		 
		 
		 
		 
		 
		 
	    	/*ProductDao daoObj1=new ProductDaoImpl();
	    	boolean r1=daoObj1.deleteProduct(3);
	    	if(r1){
	    		System.out.println("Product deleted");
	    	}
	    	else {
	    		System.out.println("Product not deleted");
	    	}*/
	    	
	    	
	    	
	    	
	    	
	    	
		 	/*Product p=new Product();
		 	p.setProductId(5);
		 	p.setProductName("Overwatch New");
		 	p.setQuantity(50);
		 	p.setPrice(2000);*/
		 
		 
		 			 	
		 	
	    	ProductDao daoObj=new ProductDaoImpl();
	    	Product p=daoObj.getProduct(5);
	    	if(p==null) {
	    		System.out.println("Product doesnt exist");
	    	}
	    	else {
	    		
	    	p.setDescription("New Description");
	    	
	    	boolean r=daoObj.updateProduct(p);
	    	if(r){
	    		System.out.println("Product updated");
	    	}
	    	else {
	    		System.out.println("Product not updated");
	    	}
	    	}
	    }
	
}
