package com.oop.model;

public class Billpayee {
	//Billpayee class
	
	//private attributes
	private int uid;
	private int favpayeeid;
	private String receiver_acc;
	private String receiver_name;
	
	
	public Billpayee(int uid, int favpayeeid, String receiver_acc, String receiver_name) {
		super();
		this.uid = uid;
		this.favpayeeid = favpayeeid;
		this.receiver_acc = receiver_acc;
		this.receiver_name = receiver_name;
	}


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

	
	
	
}
