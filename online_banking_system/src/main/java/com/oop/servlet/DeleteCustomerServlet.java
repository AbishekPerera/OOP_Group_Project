package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.util.customerDBUtil;


@WebServlet("/DeleteCustomerServlet")
public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//import printWriter to show java script popup msg
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		//get details from form
		String id = request.getParameter("cusid");
		//calling delete method
		boolean isTrue = customerDBUtil.deleteCustomer(id);
		
		if(isTrue == true) {//if deletion success
			
			out.println("<script type='text/javascript'>");
			out.println("alert('account deleted successfully');");
			out.println("location='deleteSuccessMsg.jsp'");
			out.println("</script>");
			
		}else {//else
			RequestDispatcher dis2 = request.getRequestDispatcher("fail.jsp");
			dis2.forward(request, response);
			
		}
		
		
	}

}
