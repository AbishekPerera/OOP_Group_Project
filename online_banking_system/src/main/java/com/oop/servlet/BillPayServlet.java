package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.util.BillPayDBUtil;


@WebServlet("/BillPayServlet")
public class BillPayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BillPayServlet() {
        super();
       
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acc_no = request.getParameter("acc_no");
		String com_name = request.getParameter("com_name");
		String amount = request.getParameter("amount");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String userid = request.getParameter("userid");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean isTrue = BillPayDBUtil.billPayInser(acc_no, com_name, amount, date, time, userid);
		
		if(isTrue==true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Bill Payment Success');");
			out.println("location='dashboard1.jsp'");
			out.println("</script>");
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("fail.jsp");
			dis2.forward(request, response);
		}
		
	}

}
