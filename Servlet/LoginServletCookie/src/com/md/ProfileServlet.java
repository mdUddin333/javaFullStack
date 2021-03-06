package com.md;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter out=response.getWriter()){
			
			request.getRequestDispatcher("navbar.html").include(request, response);
			out.println("<br>");

			Cookie[] cookie=request.getCookies();
			
			if (cookie!=null) {
				
				String username=cookie[0].getValue();
				
				if(!username.equals("") || username!=null) {
					
					out.println("<h1>Welcome to profile</h1>");
					out.println("<h1>Welcome, "+username+" </h1>");
					
				}
				
			}else {
				out.println("Please go to login page and login first!!");
				
				request.getRequestDispatcher("login.html").include(request, response);
			}
			
			
			
		}
	}
	
	
}
