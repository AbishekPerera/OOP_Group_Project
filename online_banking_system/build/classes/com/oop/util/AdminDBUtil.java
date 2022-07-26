package com.oop.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.oop.model.AdminModel;

public class AdminDBUtil {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static AdminModel login(String userName, String password) {
		AdminModel cus = null;

		// validate
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "select * from login where username = '" + userName + "' and Password = '" + password + "'";

			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int AID = rs.getInt(1);
				String Name = rs.getString(2);
				String username = rs.getString(3);
				String Password = rs.getString(4);

				cus = new AdminModel(AID, Name, username, Password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cus;
	}
}
