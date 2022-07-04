package com.oop.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.Customer;

public class customerDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	private static boolean isSuccess = false;
	
	public static boolean validatefornav(String userName, String password) {
		
		//validate
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "select * from customer where userName= '" + userName + "' and password= '" + password + "' ";

			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess=true;
			}else {
				isSuccess=false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}

	public static List<Customer> validate(String userName, String password) {
		//Customer validation method starts
		
		//create array list object
		ArrayList<Customer> cus = new ArrayList<>();

		// Exception Handling using try-catch
		try {
			//connecting data base
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//get sql query
			String sql = "select * from customer where userName= '" + userName + "' and password= '" + password + "' ";

			 rs = stmt.executeQuery(sql);
			 
			 
			if (rs.next()) {
				
				//get data from data base
				int idCustomer =rs.getInt(1);
				String userN = rs.getString(2);
				String passU = rs.getString(3);
				String name = rs.getString(4);
				String email = rs.getString(5);
				String phone = rs.getString(6);
				String nic = rs.getString(7);
				
				//create customer object
				Customer c = new Customer(idCustomer, userN, passU, name, email, phone, nic);
				
				//add customer object to the array list
				cus.add(c);
			//if statement ends
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// validate

		// return array list values
		return cus;
	//Customer validation method ends
	}
	
	public static Customer getCustomer(String userName) {
		//get customer method starts
		
		//creating customer object
		Customer customer = new Customer();
		
		
		//exception handling using try catch
		try {
			//creating database connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//creating sql query
			String sql = "select * from customer where userName= '" + userName + "'";
			//get results set
			 rs = stmt.executeQuery(sql);
			 
			 if (rs.next()) {
					
					int idCustomer =rs.getInt(1);
					String userN = rs.getString(2);
					String passU = rs.getString(3);
					String name = rs.getString(4);
					String email = rs.getString(5);
					String phone = rs.getString(6);
					String nic = rs.getString(7);
					
				//creating customer object using overloaded constructor
				 customer = new Customer(idCustomer, userN, passU, name, email, phone, nic);
					
				//if statement ends	
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		//return customer object
		return customer;
		 
	//get customer method ends
	}

	
	public static boolean updateCustomerData(String username,String id,String name,String email,String phone,String nic,String password) {
		//update customer data method starts
		
		//exception handing using try catch block
		try {
			//create connection to db
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//create sql query
			String sql = "update customer set name= '"+name+"', email='"+email+"', phone='"+phone+"', password='"+password+"' where idCustomer='"+id+"'  " ;
			//get results set
			
			//create int rs
			int rs= stmt.executeUpdate(sql);
			
			if(rs > 0){//if update success
				isSuccess=true;
			}else {//else
				isSuccess=false;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//return isSucces boolean value
		return isSuccess;
		
	//update customer method ends	
	}
	
	public static List<Customer> getCustomerDetails(String Id) {
		//get customer details as a list method starts
		
		//converting string id value to int value using Integer wrapper class
		int convertid = Integer.parseInt(Id);
		
		//creating array list object
		ArrayList<Customer> cus = new ArrayList<>();
		
		//exception handling using try catch
		try {
			//connecting data base
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//create sql query
			String sql = "select * from customer where idCustomer= '"+convertid+"'";
			
			//get results set
			 rs = stmt.executeQuery(sql);

			while(rs.next()) {
				//while there ara any results add those results to the variables 
				int idCustomer =rs.getInt(1);
				String userN = rs.getString(2);
				String passU = rs.getString(3);
				String name = rs.getString(4);
				String email = rs.getString(5);
				String phone = rs.getString(6);
				String nic = rs.getString(7);
				
				//create customer object and parsing values using constructor
				Customer c = new Customer(idCustomer, userN, passU, name, email, phone, nic);
				
				//add customer object to the array list 
				cus.add(c);	
			//while loop
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		// return cus values
		return cus;
	//get customer details method ends
	}
	
	public static boolean deleteCustomer(String id) {
		//delete customer method starts
		
		//convert string id to the int using Integer wrapper class
		int conID = Integer.parseInt(id);
		//exception handling using try catch
		try {
			//create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//create sql query
			String sql = "delete from customer where idCustomer='"+conID+"' ";
			
			//create rs int variable and execute query
			int rs=stmt.executeUpdate(sql);
			
			if(rs >0) {//if rs returns 1
				
				isSuccess = true;
				
			}else {//else
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//return isSuccess boolean value
		return isSuccess;
	//delete customer method ends
	}
	
	
	public static boolean customerInser(String userName,String name,String email,String phone,String nic,String pass) {
		//insert customer details method starts
		
		//exception handing using try catch
		try {
			//create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();	
			//create sql query
			String sql = "insert into customer values(0,'"+userName+"', '"+pass+"', '"+name+"', '"+email+"', '"+phone+"', '"+nic+"' )";
			//create integer rs value
			int rs = stmt.executeUpdate(sql);
			
			if (rs>0) {//if rs has 1
				isSuccess = true;
			} else {//else
				isSuccess = false;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//return isSucces boolean value
		return isSuccess;
	//insert customer details method ends	
	}
	
	
	
}
