package com.oop.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Billpayee;

/**
 * Servlet implementation class Bill_UpdateFavoriteTransferServlet
 */
@WebServlet("/Bill_UpdateFavoriteTransferServlet")
public class Bill_UpdateFavoriteTransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String UserID = request.getParameter("userid");
		String acc_no = request.getParameter("acc_no");
		String name = request.getParameter("ben_name");
		String favpayeeid = request.getParameter("favpayeeid");

		int conIntUID = Integer.parseInt(UserID);
		int conIntFapayeeid = Integer.parseInt(favpayeeid);

		try {

			ArrayList<Billpayee> billary = new ArrayList<>();

			Billpayee billData = new Billpayee(conIntUID, conIntFapayeeid, acc_no, name);
			
			billary.add(billData);
			
			List<Billpayee> billDetails = billary;
			
			request.setAttribute("billDetails", billDetails);
			

			RequestDispatcher dis = request.getRequestDispatcher("Bill_Final_fav_transfer_edit.jsp");
			dis.forward(request, response);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
//				String acc_no = request.getParameter("acc_no");
//				String name = request.getParameter("ben_name");
//				String favpayeeid = request.getParameter("favpayeeid");
//				
//				PrintWriter out = response.getWriter();
//				response.setContentType("text/html");
//				
//				boolean isTrue = Bill_FavoriteDBUtill.BillUpdateFavoritepayee(acc_no, name, favpayeeid);
//				
//				if(isTrue == true) {
//					
//					out.println("<script type='text/javascript'>");
//					out.println("alert('Update Success');");
//					out.println("location='bill_favoriteTransfer.jsp'");
//					out.println("</script>");
//					
//				}else {
//					RequestDispatcher dis = request.getRequestDispatcher("fail.jsp");
//					dis.forward(request, response);
//				}
	}

}
