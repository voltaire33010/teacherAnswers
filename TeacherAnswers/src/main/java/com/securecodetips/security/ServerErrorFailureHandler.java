package com.securecodetips.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;


import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
public class ServerErrorFailureHandler implements AuthenticationFailureHandler{
	 public void onAuthenticationFailure(HttpServletRequest request,
	            HttpServletResponse response, AuthenticationException exception)
	            throws IOException, ServletException {
		 PrintWriter out = response.getWriter();

		 HttpSession session = request.getSession();

	       Integer count;
	       count = (Integer)session.getAttribute("Count");
	     
	       if (count == null)
	       {
	       count = 1; 
	       
	       session.setAttribute("Count", count);
	       count = new Integer(count + 1);
	       response.sendRedirect("custom_login.html");
	      
	       }
	       else if (count<3){
	    	   count = new Integer(count + 1);
	    	  // out.println("<b>In current session this site is accessed " + count + " time.</b>");
		     response.sendRedirect("custom_login.html"); 
		     
	    	   session.setAttribute("Count", count);
	    	   
	       }
	       else if (count==3)
	       {
	    	   out.println("<b>you have attempt more than " + count + " time.</b>");
	    	 //response.sendRedirect("custom_login.html"); 
		       }
	      
	       

	       
		 //response.sendError(500);
	} }
