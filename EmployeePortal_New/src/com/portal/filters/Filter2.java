package com.portal.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Filter2
 */
@WebFilter("/register.jsp")
public class Filter2 implements Filter {

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("I m init for register");
	}
   
	public void destroy() {
		System.out.println("I m destroy for register");	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("preprocessing");
		chain.doFilter(request, response);
		System.out.println("postprocessing");
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		PrintWriter out=res.getWriter();
		
		String pass12=request.getParameter("emppass");
		System.out.println("pass is"+pass12);
		
		
		
		
		chain.doFilter(request, response);
	}
}
