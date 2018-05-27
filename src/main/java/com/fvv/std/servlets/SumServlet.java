package com.fvv.std.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SumServlet extends HttpServlet {

private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
		Enumeration<String> headerNames = request.getHeaderNames();

        if (headerNames != null) {
	        while (headerNames.hasMoreElements()) {
	        	System.out.println("Header: " + request.getHeader(headerNames.nextElement()));
	        }
        }
		
		final String num1 = request.getParameter("num1");
		final String num2 = request.getParameter("num2");
			
		final int val1 = Integer.parseInt(num1);
		final int val2 = Integer.parseInt(num2);
		final int sum = this.sum(val1, val2);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center><h3>Sum</h3></center>");
		out.println("<center>" + val1 + " + " + val2 + " = " +  "<b>" + sum  + "</b></center>");
		out.println("<br/><a href=\"index.jsp\">Home</a>");
		out.println("</body>");
		out.println("</html>");		
	}
	
	private int sum(final int val1, final int val2) {
		return val1 + val2;
	}

}
