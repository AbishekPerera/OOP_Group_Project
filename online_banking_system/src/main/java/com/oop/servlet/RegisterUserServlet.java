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

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getting values from the form
		String userName = request.getParameter("userName");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String nic = request.getParameter("nic");
		String pass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//calling customer insert function
		boolean isTrue = customerDBUtil.customerInser(userName, name, email, phone, nic, pass);
		
		if(isTrue == true) {//if insertion success
			//print java script popup msg
			out.println("<script type='text/javascript'>");
			out.println("alert('Account Created successfully');");
			out.println("location='login.jsp'");
			out.println("</script>");
			
			
		}else {//else
			//re direct to the fail page
			RequestDispatcher dis2 = request.getRequestDispatcher("fail.jsp");
			dis2.forward(request, response);
		}
			
	//dopost method ends
	}

}
