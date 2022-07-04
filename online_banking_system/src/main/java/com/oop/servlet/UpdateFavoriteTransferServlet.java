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


@WebServlet("/UpdateFavoriteTransferServlet")
public class UpdateFavoriteTransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get values from input
		//String UserID = request.getParameter("userid");
		String acc_no = request.getParameter("acc_no");
		String name = request.getParameter("ben_name");
		String favpayeeid = request.getParameter("favpayeeid");
		
		//import printwriter for js msg
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//create boolean variable and call update method
		boolean isTrue = FavoriteDBUtill.UpdateFavoritepayee(acc_no, name, favpayeeid);
		
		if(isTrue == true) {//if update success
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Update Success');");
			out.println("location='favoriteFundTransfer.jsp'");
			out.println("</script>");
			
		}else {//else
			RequestDispatcher dis = request.getRequestDispatcher("fail.jsp");
			dis.forward(request, response);
		}
		
	}

}
