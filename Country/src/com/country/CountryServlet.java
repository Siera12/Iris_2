package com.country;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myproxies.CountryInfoService;
import myproxies.CountryInfoServiceSoapType;



/**
 * Servlet implementation class CountryServlet
 */
@WebServlet("/CountryServlet")
public class CountryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pass=request.getParameter("c1");
		
		

		CountryInfoService serviceImpl = new CountryInfoService();
		CountryInfoServiceSoapType service = serviceImpl.getCountryInfoServiceSoap();
		String g=service.capitalCity(pass);
		
		String g1=service.countryName(pass);
		
		
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();
		
		
		out.println("Capital city :"+g);
		out.println("Country name :"+g1);
		out.println(service.countryFlag(pass));
		
	}

}
