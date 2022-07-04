package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Benificiary;
import com.oop.util.TransactionDBUtill;

/**
 * Servlet implementation class FavoriteDeleteDetailsServlet
 */
@WebServlet("/FavoriteDeleteDetailsServlet")
public class FavoriteDeleteDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//get input vales
		String UserID = request.getParameter("userid");

		//exception handling using try catch
		try {

			//create list object and call method for get ben details
			List<Benificiary> benDetails = TransactionDBUtill.getBenificiaryDetails(UserID);

			//set attributes
			request.setAttribute("benDetails", benDetails);

			//re direct page
			RequestDispatcher dis = request.getRequestDispatcher("favFundTransProDelete.jsp");
			dis.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
		//dopost method ends
	}

}
