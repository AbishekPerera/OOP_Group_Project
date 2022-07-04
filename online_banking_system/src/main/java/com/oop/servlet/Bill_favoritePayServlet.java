package com.oop.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Billpayee;

/**
 * Servlet implementation class Bill_favoritePayServlet
 */
@WebServlet("/Bill_favoritePayServlet")
public class Bill_favoritePayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String UserID = request.getParameter("userid");
		String acc_no = request.getParameter("acc_no");
		String name = request.getParameter("ben_name");
		String favpayeeid = request.getParameter("favpayeeid");

		int conIntUID = Integer.parseInt(UserID);
		int conIntFapayeeid = Integer.parseInt(favpayeeid);

		try {

			ArrayList<Billpayee> bilary = new ArrayList<>();

			Billpayee bilData = new Billpayee(conIntUID, conIntFapayeeid, acc_no, name);
			
			bilary.add(bilData);
			
			List<Billpayee> billDetails = bilary;
			
			request.setAttribute("billDetails", billDetails);
			

			RequestDispatcher dis = request.getRequestDispatcher("bill_favoriteSelectedFinal.jsp");
			dis.forward(request, response);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
