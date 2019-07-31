package com.portal.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.portal.entities.Employee;
import com.portal.utility.ConnectionProvider;

/**
 * Servlet implementation class EmpUpControl
 */
@WebServlet("/ViewEmp")
public class EmpVControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		
		Employee eObj=(Employee)session.getAttribute("userObj");
		int i=eObj.getEmployeeId();
		
		/*int i=Integer.parseInt(request.getParameter("empid"));*/
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();
		
		try (
				Connection conn=ConnectionProvider.getDBConnection();
				){
			
				PreparedStatement ps=conn.prepareStatement("select * from user6 where eid=?");
				
				ps.setInt(1,i);
	
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					String name=rs.getString(2);
					String gender=rs.getString(3);
					String q=rs.getString(4);
					String contactNo=rs.getString(5);
					String email=rs.getString(6);
					out.println(name);
					out.println(gender);
					out.println(q);
					out.println(contactNo);
					out.println(email);
				}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
		
	}


