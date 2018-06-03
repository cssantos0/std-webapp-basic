package com.fvv.std.web.view;

import java.util.List;

import com.fvv.std.bean.Contact;
import com.fvv.std.controller.ContactController;
import com.fvv.std.controller.ContactControllerImpl;

public class ContactView {

	private ContactController contactController;

	public ContactView() {
		this.contactController = new ContactControllerImpl();
	}

	public List<Contact> getContacts() {
		return this.contactController.listContacts();
	}

}
