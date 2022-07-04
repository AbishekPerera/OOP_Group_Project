package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.util.Bill_FavoriteDBUtill;

/**
 * Servlet implementation class Bill_FavoriteTransferInsertServlet
 */
@WebServlet("/Bill_FavoriteTransferInsertServlet")
public class Bill_FavoriteTransferInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uid = request.getParameter("uid");
		String receiver_acc = request.getParameter("receiver_acc");
		String receiver_name = request.getParameter("receiver_name");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean isTrue = Bill_FavoriteDBUtill.InsertFavoriteBillDetails(uid, receiver_acc, receiver_name);

		if (isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Bill Details Added Successfully');");
			out.println("location='bill_favoriteTransfer.jsp'");
			out.println("</script>");
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("fail.jsp");
			dis2.forward(request, response);
		}
	}

}
