package com.oop.model;

public class Customer extends Person {
	//Customer class 
	
	//Declaring private attributes 
	private String name;
	private String email;
	private String phone;
	private String nic;
	
	//Customer overloaded constructor
	public Customer(int idCustomer, String userName, String password, String name, String email, String phone,
			String nic) {
		super(idCustomer, userName, password);

		this.name = name;
		this.email = email;
		this.phone = phone;
		this.nic = nic;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	//get details using getters
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getNic() {
		return nic;
	}
//Customer class
}
