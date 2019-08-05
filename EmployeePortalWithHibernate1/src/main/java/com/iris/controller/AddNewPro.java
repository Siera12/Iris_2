package com.iris.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.ProductDao;
import com.iris.daos.ProductDaoImpl;
import com.iris.models.Product;



public class AddNewPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();

		
		String name=request.getParameter("pname");
		Double price=Double.parseDouble(request.getParameter("price"));
		String quantity=request.getParameter("quat");
		String description=request.getParameter("desc");
	
		Product p=new Product();
    	p.setProductName(name);
    	p.setPrice(price);
    	p.setQuantity(5);
    	p.setDescription("desc");
    	
    	ProductDao daoObj=new ProductDaoImpl();
    	boolean r=daoObj.addProduct(p);
    	if(r){
    		out.println("Product added");
    	}
    	else {
    		out.println("Product not added");
		
	}
	}
}
