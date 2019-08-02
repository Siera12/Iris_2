package com.portal.filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

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
 * Servlet Filter implementation class Filter1
 */
@WebFilter("/HomePage.jsp")
public class Filter1 implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("I m init");
	}

	public void destroy() {
		System.out.println("I m destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("preprocessing");
		chain.doFilter(request, response);
		System.out.println("postprocessing");
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		PrintWriter out=res.getWriter();
		
		LocalDateTime ldt=LocalDateTime.now();
		int hr=ldt.getHour();
		int dy=ldt.getDayOfMonth();
		
		
		
		System.out.println("Hour = "+hr);
		
		if((hr>=9 && hr<=18) && (dy>=1 && dy<=15)) {
			System.out.println("im in if...  timing is ok");
			chain.doFilter(request,response);
		}
		else {
			out.println("I m in else... get a life");
			res.sendRedirect("failure.jsp");
		}
	}
}
