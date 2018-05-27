package com.fvv.std.bean;

import java.util.Calendar;

public class Contact {

	private String name;
	private String email;
	private String address;
	private Calendar birthDate;	
	
	public Contact() {
		
	}
	public Contact(String name, String email, String address, Calendar birthDate) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Calendar getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", address=" + address + ", birthDate=" + birthDate + "]";
	}	
	
	
}
