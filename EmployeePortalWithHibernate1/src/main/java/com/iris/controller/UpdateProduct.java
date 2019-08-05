package com.iris.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.ProductDao;
import com.iris.daos.ProductDaoImpl;
import com.iris.models.Product;

@WebServlet("/UpdateProduct")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();

		int id=Integer.parseInt(request.getParameter("pid"));
		String name=request.getParameter("pname");
		Double price=Double.parseDouble(request.getParameter("price"));
		int quantity=Integer.parseInt(request.getParameter("quat"));
		String description=request.getParameter("desc");
	
		Product p=new Product();
	 	p.setProductId(id);
	 	p.setProductName(name);
	 	p.setQuantity(quantity);
	 	p.setPrice(price);
	 	p.setDescription(description);
	 	
	 	ProductDao daoObj=new ProductDaoImpl();
	 	boolean r=daoObj.updateProduct(p);
    	if(r){
    		out.println("Product updated");
    	}
    	else {
    		out.println("Product not updated");
    	}
	}
}
