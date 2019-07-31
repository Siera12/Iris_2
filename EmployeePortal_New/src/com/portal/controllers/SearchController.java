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

import com.portal.daos.EmployeeDao;
import com.portal.daosimpl.EmployeeDaoImpl;
import com.portal.entities.Employee;
import com.portal.utility.ConnectionProvider;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/Search")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int empid=Integer.parseInt(request.getParameter("empid"));
		
		EmployeeDao daoObj=new EmployeeDaoImpl();
		Employee r=daoObj.getEmployeeById(empid);
		
		String i1=r.getEmployeeName();
		String i2=r.getGender();
		String i3=r.getQualification();
		String i4=r.getContactNo();
	/*	String i5=r.getEmailAddress();*/
		
		
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();
		
		out.println("Employee Name: "+i1);
		out.println("Gender :"+i2);
		out.println("Qualification: "+i3);
		out.println("Contact No :"+i4);
		out.println(r.getEmailAddress());
		
		
		
		
	}

		
	}


