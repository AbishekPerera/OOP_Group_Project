package com.oop.util;

import java.sql.Connection;
import java.sql.Statement;

public class BillPayDBUtil {
	
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static boolean isSuccess = false;
	
	public static boolean billPayInser(String acc_no,String com_name,String amount,String date,String time,String userid) {
	
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			int convID = Integer.parseInt(userid);
			double covAmount = Double.parseDouble(amount);
			
			String sql = "insert into billpay values( '"+convID+"',0,'"+date+"','"+time+"','"+acc_no+"', '"+com_name+"', '"+covAmount+"', 'CRD' )";
			
			int rs = stmt.executeUpdate(sql);
			
			if (rs>0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return isSuccess;
		
	}
	

}
