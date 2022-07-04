package com.oop.model;

public class Person {
	//person parent class
	
	//private attributes
	private int idCustomer;
	private String userName;
	private String password;
	
	public Person() {
		super();
	}

	//person overloaded constructor
	public Person(int idCustomer, String userName, String password) {
		
		this.idCustomer = idCustomer;
		this.userName = userName;
		this.password = password;
	}

	//get details using getters
	public int getIdCustomer() {
		return idCustomer;
	}


	public String getUserName() {
		return userName;
	}


	public String getPassword() {
		return password;
	}

	//set details using setters
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public void setPassword(String password) {
		this.password = password;
	}
		
//person class ends
}
