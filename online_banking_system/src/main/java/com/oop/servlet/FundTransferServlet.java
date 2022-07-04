package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.util.TransactionDBUtill;

/**
 * Servlet implementation class FundTransferServlet
 */
@WebServlet("/FundTransferServlet")
public class FundTransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//import print writer for js msg
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		//getting values from onetime_transfer.jsp form
		String acc_no = request.getParameter("acc_no");
		String ben_name = request.getParameter("ben_name");
		String amount = request.getParameter("amount");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String userid = request.getParameter("userid");
		//calling fundtransfer insertion method
		boolean isTrue = TransactionDBUtill.fundTransfer(acc_no, ben_name, amount, date, time, userid);
		
		if(isTrue==true) {//if insertion success
			out.println("<script type='text/javascript'>");
			out.println("alert('Fund Transfer Success');");
			out.println("location='dashboard1.jsp'");
			out.println("</script>");
		}
		else {//else
			RequestDispatcher dis2 = request.getRequestDispatcher("fail.jsp");
			dis2.forward(request, response);
		}
	//dopost method ends	
	}

}
