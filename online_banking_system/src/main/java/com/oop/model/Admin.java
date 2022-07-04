package com.oop.model;

public class Admin extends Person {
	//admin class
	
	//declaring private attributes
	private int services;
	private int rating;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//admin overloaded constructor
	public Admin(int idCustomer, String userName, String password, String name, String email, String phone, String nic,
		int services, int rating) {
		super(idCustomer, userName, password);
		this.services = services;
		this.rating = rating;
	}

	//get details using getters
	public int getServices() {
		return services;
	}

	public int getRating() {
		return rating;
	}

	public void setServices(int services) {
		this.services = services;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

}
