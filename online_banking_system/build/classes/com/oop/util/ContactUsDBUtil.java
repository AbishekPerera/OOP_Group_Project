package com.oop.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.oop.model.ContactsModel;

public class ContactUsDBUtil {

	private static Connection con = null;
	private static Statement stmt = null;

	public static boolean insertcontactUs(String fullName, String email, String message) {

		boolean isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "insert into contactus values(0, '" + fullName + "', '" + email + "', '" + message + "')";
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

	public static ArrayList<ContactsModel> getContactUsMsgs() {

		ArrayList<ContactsModel> cmsg = new ArrayList<>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from contactus";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int idcontactUs = rs.getInt(1);
				String fullName = rs.getNString(2);
				String email = rs.getNString(3);
				String message = rs.getNString(4);

				ContactsModel c = new ContactsModel(idcontactUs, fullName, email, message);
				cmsg.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cmsg;
	}

	public static boolean deleteContMsg(String contMsgId) {

		boolean isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "delete from contactus where idcontactUs=" + contMsgId;
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
