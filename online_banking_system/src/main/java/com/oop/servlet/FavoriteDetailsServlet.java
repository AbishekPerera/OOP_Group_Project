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

@WebServlet("/FavoriteDetailsServlet")
public class FavoriteDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//getting input values
		String UserID = request.getParameter("userid");
		//exception handling using try catch
		try {
			//calling getbenificiarydetails method and assign values to the list object
			List<Benificiary> benDetails = TransactionDBUtill.getBenificiaryDetails(UserID);
			//set attributes 
			request.setAttribute("benDetails", benDetails);
			//re direct to the page
			RequestDispatcher dis = request.getRequestDispatcher("favFundTransProEdit.jsp");
			dis.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
//dopost method ends
	}

}
