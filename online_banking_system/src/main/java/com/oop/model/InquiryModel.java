package com.oop.model;

public class InquiryModel {
	int uid;
	int inqId;
	String name;
	String email;
	String phone;
	String message;

	public int getUid() {
		return uid;
	}

	public int getInqId() {
		return inqId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getMessage() {
		return message;
	}

	public InquiryModel(int uid, String name, String email, String phone, String message) {
		this.uid = uid;
		this.name = name;
		this.phone = phone;
		this.message = message;
	}

	public InquiryModel(int inqId, int uid, String name, String email, String phone, String message) {
		this.inqId = inqId;
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.message = message;
	}

}
