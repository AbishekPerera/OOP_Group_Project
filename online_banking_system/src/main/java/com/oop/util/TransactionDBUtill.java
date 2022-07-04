package com.oop.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.Benificiary;

public class TransactionDBUtill {
	// transactionDbutil class

	// declaring private attributes
	private static Connection con = null;
	private static Statement stmt = null;
	private static boolean isSuccess = false;

	public static boolean fundTransfer(String acc_no, String ben_name, String amount, String date, String time,
			String userid) {
		// fundTransfer method starts
		try {// exception handing using try catch

			// creating data base connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// converting string values to double and integer using wrapper class
			double conAmount = Double.parseDouble(amount);
			int conId = Integer.parseInt(userid);
			// create sqlQery
			String sql = "insert into transactions values('" + conId + "',0 ,'" + date + "', '" + time + "', '" + acc_no
					+ "', '" + ben_name + "','" + conAmount + "','CRD')";

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {// if rs returns 1
				isSuccess = true;
			} else {// else
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// return isSucces boolean value
		return isSuccess;
		// method ends
	}

	public static List<Benificiary> getBenificiaryDetails(String userid) {
		// getbenificiary details method starts

		// create array list object
		ArrayList<Benificiary> ben = new ArrayList<>();

		// exception handing using try catch
		try {

			// connection data base
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			// convert string values to integer using wrapper class
			int conUid = Integer.parseInt(userid);

			// create sql query
			String sql = "select * from favoritepayee where uid= '" + conUid + "' ";
			// get result set
			ResultSet rs = stmt.executeQuery(sql);

			// assigning table values to local variables
			while (rs.next()) {

				int favpayeeid = rs.getInt(1);
				int uid = rs.getInt(2);
				String receiver_acc = rs.getString(3);
				String receiver_name = rs.getString(4);
				
				//create benificiary object
				Benificiary b = new Benificiary(uid, favpayeeid, receiver_acc, receiver_name);
				//add b details to the ben array list
				ben.add(b);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//return array list object
		return ben;

		// getBenificiaryDetails method ends
	}

//TransactionDBUtill method ends
}
