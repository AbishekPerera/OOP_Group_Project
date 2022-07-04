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

import com.oop.model.Benificiary;

@WebServlet("/FavoriteTransferServletII")
public class FavoriteTransferServletII extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//get input values
		String UserID = request.getParameter("userid");
		String acc_no = request.getParameter("acc_no");
		String name = request.getParameter("ben_name");
		String favpayeeid = request.getParameter("favpayeeid");
		
		//convert string values to the intusing wrapper class
		int conIntUID = Integer.parseInt(UserID);
		int conIntFapayeeid = Integer.parseInt(favpayeeid);
		
		//exception handling using try catch 
		try {
			//create array list object
			ArrayList<Benificiary> benary = new ArrayList<>();
			//create benificiary object
			Benificiary benData = new Benificiary(conIntUID, conIntFapayeeid, acc_no, name);
			//add benificiary object to the array list
			benary.add(benData);
			//pass array list data to the list object
			List<Benificiary> benDetails = benary;
			//set list object to the attribute
			request.setAttribute("benDetails", benDetails);
			
			//re direct to the final transfer page
			RequestDispatcher dis = request.getRequestDispatcher("Final_fav_transfer.jsp");
			dis.forward(request, response);
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
