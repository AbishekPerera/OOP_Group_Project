package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oop.model.Customer;
import com.oop.util.customerDBUtil;

/**
 * Servlet implementation class UpdateCustomerServlet
 */
@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//get form values
		String username = request.getParameter("username");
		String id = request.getParameter("cusid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String nic = request.getParameter("nic");
		String password = request.getParameter("password");
		//declaring boolean variable
		boolean isTrue;
		//calling update customer details method 
		isTrue = customerDBUtil.updateCustomerData(username, id, name, email, phone, nic, password);

		if (isTrue == true) {//if update success
			//create list object
			List<Customer> cusDetails = customerDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			//resetting session
			request.getSession().removeAttribute("abc");
			
			Customer cus = customerDBUtil.getCustomer(username);
			request.getSession().setAttribute("cus", cus);
			//redirecting to dash board
			RequestDispatcher dis = request.getRequestDispatcher("dashboard.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis = request.getRequestDispatcher("fail.jsp");
			dis.forward(request, response);
		}
	//do post method ends
	}

}
