package com.listeners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class LogCount
 *
 */
@WebListener
public class LogCount implements HttpSessionListener {

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent event)  { 
    	System.out.println("Inside sessionevent");
    	HttpSession session=event.getSession();
    	ServletContext context=session.getServletContext();
    	
    	Object obj=context.getAttribute("count");
    	if(obj==null) {
    		context.setAttribute("count",1);
    	}
    	else {
    		int c=(int)obj;
    		c++;
    		context.setAttribute("count",c);
    		System.out.println("Ic"+c);
    	}
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent event)  { 
        System.out.println("I m destroyed");
        HttpSession session=event.getSession();
        ServletContext context=session.getServletContext();
        
        int a=(int)context.getAttribute("count");
        a--;
        context.setAttribute("count",a);
        
    }	
}
