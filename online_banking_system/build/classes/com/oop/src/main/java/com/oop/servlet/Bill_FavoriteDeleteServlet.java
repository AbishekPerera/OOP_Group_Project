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
 * Servlet implementation class Bill_FavoriteDelete
 */
@WebServlet("/Bill_FavoriteDeleteServlet")
public class Bill_FavoriteDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String favpayeeid = request.getParameter("favpayeeid");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		boolean isTrue = Bill_FavoriteDBUtill.DeleteFavoriteBill(favpayeeid);

		if (isTrue == true) {

			out.println("<script type='text/javascript'>");
			out.println("alert('Delete Success');");
			out.println("location='bill_favoriteTransfer.jsp'");
			out.println("</script>");

		} else {
			RequestDispatcher dis = request.getRequestDispatcher("fail.jsp");
			dis.forward(request, response);
		}

	}

}
