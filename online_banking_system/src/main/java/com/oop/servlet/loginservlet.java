package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oop.model.Customer;
import com.oop.util.customerDBUtil;


@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//for the java script msg
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//get values from the form
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		
		//exception handling using try catch
		try {
		List<Customer> cusDetails = customerDBUtil.validate(username, password);
		
		//setting attributes to the cusDetails
		request.setAttribute("cusDetails", cusDetails);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//calling validation method for set session
		boolean isSuccess = customerDBUtil.validatefornav(username, password);
		
		if(isSuccess == true) {
			// Get the session object
			HttpSession session = request.getSession();
			
			Customer cus = customerDBUtil.getCustomer(username);
			
			//assign cus details to the session 
			session.setAttribute("cus", cus);
		
			//redirecting to the dash board
			RequestDispatcher dis = request.getRequestDispatcher("dashboard.jsp");
			dis.forward(request, response);
			
		}else {//if validation is not success create javascript popup msg
			out.println("<script type='text/javascript'>");
			out.println("alert('Incorrect Username or password');");
			out.println("location='login.jsp'");
			out.println("</script>");
		}
	//dopost method ends	
	}

}
