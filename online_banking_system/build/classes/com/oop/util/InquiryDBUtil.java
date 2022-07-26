package com.oop.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.oop.model.InquiryModel;

public class InquiryDBUtil {

	private static Connection con = null;
	private static Statement stmt = null;

	public static boolean insertInquiry(String uid, String name, String email, String phone, String message) {

		boolean isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "insert into inquiry values(0, '" + uid + "', '" + name + "', '" + email + "', '" + phone
					+ "', '" + message + "')";
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

	public static boolean updateInquiry(String id, String uid, String name, String email, String phone,
			String message) {

		boolean isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "update inquiry set name='" + name + "', email='" + email + "', phone='" + phone
					+ "', message='" + message + "' where inq_id=" + id;
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

	public static ArrayList<InquiryModel> getInquiries() {

		ArrayList<InquiryModel> output = new ArrayList<InquiryModel>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			int uid = 001;
			String sql = "select * from inquiry where uid=" + uid + "";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				InquiryModel model = new InquiryModel(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6));
				output.add(model);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output;
	}

	public static InquiryModel getInquiry(String id) {

		InquiryModel output = null;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from inquiry where inq_id=" + id + "";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				output = new InquiryModel(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output;
	}

	public static InquiryModel getInquiry() {

		InquiryModel output = null;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from inquiry";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				output = new InquiryModel(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output;
	}

	public static boolean deleteInquiry(String inqId) {

		boolean isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "delete from inquiry where inq_id=" + inqId;
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