package com.fvv.std.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fvv.std.bean.Contact;
import com.fvv.std.controller.ContactController;
import com.fvv.std.controller.ContactControllerImpl;

@WebServlet("/addContact")
public class AddContactServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("HTTP GET Invoked...");	
		this.registerContact(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("HTTP POST Invoked...");
		this.registerContact(request, response);
	}
	
	private void registerContact(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String birthdate = request.getParameter("birthdate");
		
		Calendar birthDateDate = null;

		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(birthdate);
			birthDateDate = Calendar.getInstance();
			birthDateDate.setTime(date);
		} catch (ParseException e) {
			out.println("Erro de conversão da data");
			return; 
		}
		
		
		Contact contact = new Contact();
		contact.setName(name);
		contact.setAddress(address);
		contact.setEmail(email);
		contact.setBirthDate(birthDateDate);
		
		ContactController contactController = new ContactControllerImpl();
		contactController.addContact(contact);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Contact " + contact.getName() + " added properly in DB");
		out.println("<br/><a href=\"index.jsp\">Home</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
