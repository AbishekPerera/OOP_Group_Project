package com.oop.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.Transactions;

public class AccountsDBUtil {
//account db util class
	
	//declaring private variables
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Transactions> getTransactionDetails(String userId) {
		//get transaction details method starts 
		
		//declaring array list object 
		ArrayList<Transactions> trans = new ArrayList<>();
		
		//exception handling using try catch
		try {
			//connection data base
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//converting string value to integer using wrapper class
			int conUserid = Integer.parseInt(userId);
			//create sql query
			String sql = "select * from transactions where uid= '"+conUserid+"'";
			//get result set
			rs = stmt.executeQuery(sql);
			
			//assigning values to the local variables 
			while(rs.next()) {
				
				int uid = rs.getInt(1); 
				int trabsaction_id = rs.getInt(2);
				String date = rs.getString(3); 
				String time = rs.getString(4); 
				String receiver_acc = rs.getString(5);
				String receiver_name = rs.getString(6); 
				double amount = rs.getDouble(7); 
				String type = rs.getString(8);
				
				//creating transaction object
				Transactions transDetals = new Transactions(uid,trabsaction_id,date,time,receiver_acc,receiver_name,amount,type);
				//add transaction object to the array list object
				trans.add(transDetals);
				
			//while loop	
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//return array list object
		return trans;
	//get transaction details method ends
	}
	
}
