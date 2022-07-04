package com.oop.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.Billpayee;

public class Bill_FavoriteDBUtill {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static boolean isSuccess = false;

	public static boolean InsertFavoriteBillDetails(String uid, String receiver_acc, String receiver_name) {

		try {

			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			int conUid = Integer.parseInt(uid);

			String sql = "insert into favoritbill values(0, '"+conUid+"', '"+receiver_acc+"', '"+receiver_name+"' )";

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;

	}
	
	public static List<Billpayee> billgetBenificiaryDetails(String userid) {

		ArrayList<Billpayee> ben = new ArrayList<>();

		try {

			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			int conUid = Integer.parseInt(userid);

			String sql = "select * from favoritbill where uid= '" + conUid + "' ";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				
				int favpayeeid = rs.getInt(1);
				 int uid = rs.getInt(2);
				 String receiver_acc = rs.getString(3);
				 String receiver_name = rs.getString(4);

				 Billpayee b = new Billpayee(uid, favpayeeid,receiver_acc, receiver_name);

				ben.add(b);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ben;

		// getBillDetails method ends
	}
	
	public static boolean BillUpdateFavoritepayee(String acc_no, String name, String favpayeeid) {

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			int conFavId = Integer.parseInt(favpayeeid);

			String sql = "update favoritbill set receiver_acc= '" + acc_no + "', receiver_name='" + name
					+ "' where favpayeeid='" + conFavId + "'  ";

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;

	}
	
	public static boolean DeleteFavoriteBill(String favpayeeid) {

		int confavpayeeid = Integer.parseInt(favpayeeid);

		try {

			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "delete from favoritbill where favpayeeid='" + confavpayeeid + "' ";

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {

				isSuccess = true;

			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;

	}
	
	
	
}
