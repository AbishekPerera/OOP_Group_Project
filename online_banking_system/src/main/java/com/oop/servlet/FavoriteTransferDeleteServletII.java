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
 * Servlet implementation class FavoriteTransferDeleteServletII
 */
@WebServlet("/FavoriteTransferDeleteServletII")
public class FavoriteTransferDeleteServletII extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get input values
		String favpayeeid = request.getParameter("favpayeeid");
		//import print writer
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		//create boolean variable and call method for the delete payye details
		boolean isTrue = FavoriteDBUtill.DeleteFavoritePayee(favpayeeid);
		
		if(isTrue == true) {//if deletion success
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete Success');");
			out.println("location='favoriteFundTransfer.jsp'");
			out.println("</script>");
			
		}else {//else
			RequestDispatcher dis = request.getRequestDispatcher("fail.jsp");
			dis.forward(request, response);
		}
		
	//do post method ends
	}

}
