package com.oop.util;

import java.sql.Connection;
import java.sql.Statement;

public class FavoriteDBUtill {
	//declaring private attributes
	private static Connection con = null;
	private static Statement stmt = null;
	private static boolean isSuccess = false;

	public static boolean UpdateFavoritepayee(String acc_no, String name, String favpayeeid) {
		//update favoritepayee method starts
		
		//exception handling using try catch
		try {
			//connection data base
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			//convert string value to integer using wrapper class
			int conFavId = Integer.parseInt(favpayeeid);
			//create sql query
			String sql = "update favoritepayee set receiver_acc= '" + acc_no + "', receiver_name='" + name
					+ "' where favpayeeid='" + conFavId + "'  ";
	
			int rs = stmt.executeUpdate(sql);
				
			if (rs > 0) {//if rs returns 1
				isSuccess = true;
			} else {//else
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//return isSuccess boolean value
		return isSuccess;
//method ends
	}

	public static boolean DeleteFavoritePayee(String favpayeeid) {
		//deletepayee details methods starts
		
		//convert string value to the integer using wrapper class
		int confavpayeeid = Integer.parseInt(favpayeeid);
		//exception handing using try catch
		try {
			//connection db
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			//create sql query
			String sql = "delete from favoritepayee where favpayeeid='" + confavpayeeid + "' ";
			
			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {//if rs returns 1

				isSuccess = true;

			} else {//else
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//return isSuccess boolean value
		return isSuccess;
//method ends
	}

	public static boolean InsertFavoriteBenDetails(String uid, String receiver_acc, String receiver_name) {
		//insert favoriteben details method starts
		
		//exception handing using try catch
		try {
			//connect data base
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			int conUid = Integer.parseInt(uid);
			//create sql query
			String sql = "insert into favoritepayee values(0, '"+conUid+"', '"+receiver_acc+"', '"+receiver_name+"' )";

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {//if rs returns 1
				isSuccess = true;
			} else {//else
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//return isSuccess boolean value 
		return isSuccess;
		//method ends
	}

	// FavoriteDBUtill ends
}
