package com.oop.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	//declaring private static variables 
	private static String url = "jdbc:mysql://localhost:3306/online_banking_system";
	private static String userName = "root";
	private static String password = "sunera";
	private static Connection con;
	
	public static Connection getConnection() {
		
		// Exception Handling using try-catch
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,userName,password);
			
		}catch(Exception e) {
			System.out.println("DB connectionm not success");
		}
		
		return con;
		
}
}
