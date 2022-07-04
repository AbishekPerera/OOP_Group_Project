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


@WebServlet("/FavoriteTransferServlet")
public class FavoriteTransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FavoriteTransferServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get details from form
		String UserID = request.getParameter("userid");
		//exception handling using try catch
		try {
			//creating list object and call get men details method
			List<Benificiary> benDetails = TransactionDBUtill.getBenificiaryDetails(UserID);
			
			//set bendetails to attribute
			request.setAttribute("benDetails", benDetails);
			
			//re direct to the favfundtrans page
			RequestDispatcher dis = request.getRequestDispatcher("favFundTransPro.jsp");
			dis.forward(request, response);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	//dopost method ends
	}

}
