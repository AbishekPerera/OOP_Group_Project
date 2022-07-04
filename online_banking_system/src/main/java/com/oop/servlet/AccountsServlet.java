package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Transactions;
import com.oop.util.AccountsDBUtil;

/**
 * Servlet implementation class AccountsServlet
 */
@WebServlet("/AccountsServlet")
public class AccountsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get values from accounts jsp form
		String acc_no = request.getParameter("userid");
		
		//exception handling using try catch
		try {
			//create list object
			List<Transactions> transDetails = AccountsDBUtil.getTransactionDetails(acc_no);
			//set attributes 
			request.setAttribute("transDetails", transDetails);
			//re direct to the account details page
			RequestDispatcher dis = request.getRequestDispatcher("accountDetails.jsp");
			dis.forward(request, response);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
