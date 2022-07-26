package com.oop.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.InquiryModel;
import com.oop.util.InquiryDBUtil;

@WebServlet("/inquiryServlet")
public class InquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String URLParameter = request.getRequestURL().substring(request.getRequestURL().lastIndexOf("/") + 1,
				request.getRequestURL().length());
		if (URLParameter.equals("view")) {
			ArrayList<InquiryModel> list = InquiryDBUtil.getInquiries();
			request.setAttribute("list", list);
			RequestDispatcher view = request.getRequestDispatcher("inquiry.jsp");
			view.forward(request, response);
		} else {
			String uid = request.getParameter("id");
			if (uid != null) {
				InquiryModel data = InquiryDBUtil.getInquiry(uid);
				request.setAttribute("data", data);
				RequestDispatcher view = request.getRequestDispatcher("editInquiry.jsp");
				view.forward(request, response);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String URLParameter = request.getRequestURL().substring(request.getRequestURL().lastIndexOf("/") + 1,
				request.getRequestURL().length());
		String msg = "";
		if (URLParameter.equals("view")) {
			String inqId = request.getParameter("id");

			boolean isTrue = InquiryDBUtil.deleteInquiry(inqId);

			if (isTrue == true) {
				msg = "Record Deleted!";
			} else {
				msg = "Record Deletion Failed!";
			}

			request.setAttribute("msg", msg);
			request.setAttribute("url", "view");
			RequestDispatcher view = request.getRequestDispatcher("showMsg.jsp");
			view.forward(request, response);
		} else {

			String id = request.getParameter("id");
			String uid = request.getParameter("uid");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String message = request.getParameter("message");

			if (id == null) {

				boolean isTrue = InquiryDBUtil.insertInquiry(uid, name, email, phone, message);

				if (isTrue == true) {
					msg = "Record Added!";
				} else {
					msg = "Record Addition Failed!";
				}

				request.setAttribute("msg", msg);
				request.setAttribute("url", "view");
				RequestDispatcher view = request.getRequestDispatcher("showMsg.jsp");
				view.forward(request, response);
			} else {
				boolean isTrue = InquiryDBUtil.updateInquiry(id, uid, name, email, phone, message);

				if (isTrue == true) {
					msg = "Record Updated!";
				} else {
					msg = "Record Update Failed!";
				}

				request.setAttribute("msg", msg);
				request.setAttribute("url", "view");
				RequestDispatcher view = request.getRequestDispatcher("showMsg.jsp");
				view.forward(request, response);
			}
		}
	}

}
