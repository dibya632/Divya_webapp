package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServlateDamo
 */
public class ServletDamo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		pw.print("<html><body>");
		pw.println("Welcome to Servlet");
		pw.println("<a href="+"/divya-webpp/"+">Home page</a>");
		
		pw.println("</body><html>");
		
		pw.close();
	}

}
