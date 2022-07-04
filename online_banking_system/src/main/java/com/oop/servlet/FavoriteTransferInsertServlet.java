package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.util.FavoriteDBUtill;

/**
 * Servlet implementation class FavoriteTransferInsertServlet
 */
@WebServlet("/FavoriteTransferInsertServlet")
public class FavoriteTransferInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//get input values
		String uid = request.getParameter("uid");
		String receiver_acc = request.getParameter("receiver_acc");
		String receiver_name = request.getParameter("receiver_name");
		//import print writer for the js msg
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//create boolean variable and call method for insert values
		boolean isTrue = FavoriteDBUtill.InsertFavoriteBenDetails(uid, receiver_acc, receiver_name);

		if (isTrue == true) {//if insertion success
			out.println("<script type='text/javascript'>");
			out.println("alert('Beneficiary Details Added Successfully');");
			out.println("location='favoriteFundTransfer.jsp'");
			out.println("</script>");
		} else {//else
			RequestDispatcher dis2 = request.getRequestDispatcher("fail.jsp");
			dis2.forward(request, response);
		}
	//dopost method ends
	}

}
