package com.fvv.std.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.fvv.std.bean.Contact;

public class ContactControllerImpl implements ContactController {

	public void addContact(final Contact contact) {
		System.out.println("Supposedly saved in the database...");
		//contactDao.addContact(contact);
		System.out.println(contact);
	}
	
	public List<Contact> listContacts() {
		Contact c = new Contact("Ciro", "cs.santos0@gmail.com", "Rua abc, 24", generateBirthDate("26/03/1988"));
		Contact c1 = new Contact("Fatima", "fvv.vasquez0@gmail.com", "Rua def, 50", generateBirthDate("01/11/1918"));
		Contact c2 = new Contact("Elza", "elza0@gmail.com", "Rua elefantiase, 100", generateBirthDate("28/01/1953"));
		Contact c3 = new Contact("Augusto", "augusto0@gmail.com", "Rua macaquinhos, 12", generateBirthDate("30/06/1967"));
		
		List<Contact> list = new ArrayList<>();
		list.add(c);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		return list;
	}
	
	private Calendar generateBirthDate(String birthdate) {
		Calendar birthDateDate = null;

		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(birthdate);
			birthDateDate = Calendar.getInstance();
			birthDateDate.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return birthDateDate;
	}
	
}
