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
 * Servlet implementation class RegController
 */
@WebServlet("/Reg")
public class RegController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();

		
		String name=request.getParameter("empn");
		String g=request.getParameter("gen");
		String q=request.getParameter("qual");
		String c=request.getParameter("con");
		String em=request.getParameter("em");
		Employee emp=new Employee();
		
		emp.setEmployeeName(name);
		emp.setGender(g);
		emp.setEmailAddress(em);
		emp.setQualification(q);
		emp.setContactNo(c);
	
		EmployeeDao daoObj=new EmployeeDaoImpl();
		boolean r=daoObj.register(emp);
		if(r) {
			out.println("employee registered successfully");
		}
	}
}
