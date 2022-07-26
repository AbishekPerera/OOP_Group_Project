package com.oop.model;

public class ContactsModel {
	private int contactid;
	private String fullname;
	private String email;
	private String message;

	public ContactsModel(int contactid, String fullname, String email, String message) {
		this.contactid = contactid;
		this.fullname = fullname;
		this.email = email;
		this.message = message;
	}

	public int getContactid() {
		return contactid;
	}

	public String getFullname() {
		return fullname;
	}

	public String getEmail() {
		return email;
	}

	public String getMessage() {
		return message;
	}

}
