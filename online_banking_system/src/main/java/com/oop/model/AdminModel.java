package com.oop.model;

public class AdminModel {
	private int aid;
	private String name;
	private String username;
	private String password;

	public AdminModel(int aid, String name, String username, String password) {
			this.aid = aid;
			this.name = name;
			this.username = username;
			this.password = password;
		}

	public int getAid() {
		return aid;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
