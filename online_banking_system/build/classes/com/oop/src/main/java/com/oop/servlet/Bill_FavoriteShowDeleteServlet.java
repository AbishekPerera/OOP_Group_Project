package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Billpayee;
import com.oop.util.Bill_FavoriteDBUtill;

/**
 * Servlet implementation class Bill_FavoriteShowDeleteServlet
 */
@WebServlet("/Bill_FavoriteShowDeleteServlet")
public class Bill_FavoriteShowDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String UserID = request.getParameter("userid");

		try {

			List<Billpayee> billDetails = Bill_FavoriteDBUtill.billgetBenificiaryDetails(UserID);

			request.setAttribute("billDetails", billDetails);

			RequestDispatcher dis = request.getRequestDispatcher("bill_favoriteShowDelete.jsp");
			dis.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
