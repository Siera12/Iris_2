package com.portal.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.utility.ConnectionProvider;

/**
 * Servlet implementation class PWcontroller
 */
@WebServlet("/PW")
public class PWcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int eid=Integer.parseInt(request.getParameter("empid"));
		String pass=request.getParameter("empnp");
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();
		
		try (
				Connection conn=ConnectionProvider.getDBConnection();
				){
			
				PreparedStatement ps=conn.prepareStatement("update logtab3 set pw=? where eid=?");
				
				ps.setString(1,pass);
				ps.setInt(2,eid);
				int i=ps.executeUpdate();
				if(i!=0) {
					out.println("password changed");
				}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
