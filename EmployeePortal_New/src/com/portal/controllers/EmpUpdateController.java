package com.portal.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.daos.EmployeeDao;
import com.portal.daosimpl.EmployeeDaoImpl;
import com.portal.entities.Employee;
import com.portal.utility.ConnectionProvider;

/**
 * Servlet implementation class EmpUpdateController
 */
@WebServlet("/EmpUpdateController")
public class EmpUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid=Integer.parseInt(request.getParameter("empid"));
		String role=request.getParameter("roln");
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();
		
		Employee emp=new Employee();
		
		emp.setEmployeeId(eid);
		emp.setRole(role);
		
		EmployeeDao daoObj=new EmployeeDaoImpl();
		boolean r=daoObj.updateEmployee(emp);
		
		if(r) {
			out.println("employee Updated successfully");
		}
	}

}
