package com.iris.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.ProductDao;
import com.iris.daos.ProductDaoImpl;

@WebServlet("/DeleteProduct")
public class DeleteProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();

		int id=Integer.parseInt(request.getParameter("pid"));
		
		ProductDao daoObj1=new ProductDaoImpl();
    	boolean r1=daoObj1.deleteProduct(id);
    	if(r1){
    		out.println("Product deleted");
    	}
    	else {
    		out.println("Product not deleted");
    	}
	}
}
