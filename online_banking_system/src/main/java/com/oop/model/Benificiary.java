package com.oop.model;

public class Benificiary {
	//benificiary class
	
	//Declaring private attributes
	private int uid;
	private int favpayeeid;
	private String receiver_acc;
	private String receiver_name;
	
	//Benificiary overloaded constructor 
	public Benificiary(int uid, int favpayeeid, String receiver_acc, String receiver_name) {
		super();
		this.uid = uid;
		this.favpayeeid = favpayeeid;
		this.receiver_acc = receiver_acc;
		this.receiver_name = receiver_name;
		
	}
	//get details using getters
	public int getUid() {
		return uid;
	}

	public int getFavpayeeid() {
		return favpayeeid;
	}

	public String getReceiver_acc() {
		return receiver_acc;
	}

	public String getReceiver_name() {
		return receiver_name;
	}

//benificiary class ends	
}
