package com.coforge.servletJenkinsEx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldExample extends HttpServlet {
	private static final long serialVersionUID=1L;

	public void doGet(HttpServlet request, HttpServletResponse response)
	throws IOException, ServletException{
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
//		ResourceBundle rb = ResourceBundle.getBundle("localStrings", request.getLocale());
		response.setContentType("text/html");
		out.println("<a href='www.google.com'>Google</a>");
		
	}
}
