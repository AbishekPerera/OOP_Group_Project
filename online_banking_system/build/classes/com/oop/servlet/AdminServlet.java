package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oop.model.AdminModel;
import com.oop.model.ContactsModel;
import com.oop.model.InquiryModel;
import com.oop.util.AdminDBUtil;
import com.oop.util.ContactUsDBUtil;
import com.oop.util.InquiryDBUtil;

@WebServlet("/adminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		try {
			String aid = (String) session.getAttribute("aid");
			if (aid == null)
				throw new Exception();
			String URLParameter = req.getRequestURL().substring(req.getRequestURL().lastIndexOf("/") + 1,
					req.getRequestURL().length());
			RequestDispatcher view = null;
			switch (URLParameter) {
			case "adminInq":
				ArrayList<InquiryModel> inqData = InquiryDBUtil.getInquiries();
				req.setAttribute("data", inqData);
				view = req.getRequestDispatcher("checkInquiries.jsp");
				break;
			case "adminContUs":
				ArrayList<ContactsModel> contData = ContactUsDBUtil.getContactUsMsgs();
				req.setAttribute("data", contData);
				view = req.getRequestDispatcher("checkContactMessages.jsp");
				break;
			default:
				view = req.getRequestDispatcher("admin.jsp");
			}
			view.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
			session.setAttribute("aid", null);
			RequestDispatcher view = req.getRequestDispatcher("adminLogin.jsp");
			view.forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String URLParameter = request.getRequestURL().substring(request.getRequestURL().lastIndexOf("/") + 1,
				request.getRequestURL().length());
		RequestDispatcher view = null;
		String id = request.getParameter("id");
		boolean isTrue = false;
		String msg = "";

		try {
			switch (URLParameter) {
			case "adminContUs":

				isTrue = ContactUsDBUtil.deleteContMsg(id);

				if (isTrue == true) {
					msg = "Record Deleted!";
				} else {
					msg = "Record Deletion Failed!";
				}
				request.setAttribute("msg", msg);
				request.setAttribute("url", "adminContUs");
				view = request.getRequestDispatcher("showMsg.jsp");
				view.forward(request, response);
				break;
			case "adminInq":
				isTrue = InquiryDBUtil.deleteInquiry(id);

				if (isTrue == true) {
					msg = "Record Deleted!";
				} else {
					msg = "Record Deletion Failed!";
				}
				request.setAttribute("msg", msg);
				request.setAttribute("url", "adminInq");
				view = request.getRequestDispatcher("showMsg.jsp");
				view.forward(request, response);
				break;
			default:
				String username = request.getParameter("username");
				String password = request.getParameter("pass");
				AdminModel admDetails = AdminDBUtil.login(username, password);
				if (admDetails != null) {
					request.setAttribute("admDetails", admDetails);
					HttpSession session = request.getSession();
					session.setAttribute("aid", "" + admDetails.getAid());
					response.sendRedirect("admin");
				} else {
					PrintWriter out = response.getWriter();
					out.println("<script type=\"text/javascript\">");
					out.println("alert('User or password incorrect');");
					out.println("location='admin';");
					out.println("</script>");
					out.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
