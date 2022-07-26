package com.oop.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.util.ContactUsDBUtil;

@WebServlet("/contactUsServlet")
public class ContactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fullName = request.getParameter("fullname");
		String email = request.getParameter("email");
		String message = request.getParameter("message");

		boolean isTrue;

		isTrue = ContactUsDBUtil.insertcontactUs(fullName, email, message);
		String msg = "";
		if (isTrue == true) {
			msg = "Sent Successfully!";
		} else {
			msg = "Sending Failed!";
		}
		request.setAttribute("msg", msg);
		request.setAttribute("url", "contactUs.jsp");
		RequestDispatcher dis = request.getRequestDispatcher("showMsg.jsp");
		dis.forward(request, response);
	}

}
