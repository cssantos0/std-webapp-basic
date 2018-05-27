package com.fvv.std.controller;

import java.util.List;

import com.fvv.std.bean.Contact;

public interface ContactController {

	void addContact(final Contact contact);
	
	List<Contact> listContacts();
}
