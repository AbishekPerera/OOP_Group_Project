<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.oop.model.*"%>
<%@page import="com.oop.util.*"%>
<%@page import="com.oop.servlet.*"%>
<%@page import="java.util.*"%>
<%
Customer cusDetails = (Customer) request.getSession().getAttribute("cus");
request.setAttribute("cusDetails", cusDetails);
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>One Time Transfer</title>


</head>
<body>

	<div class="form">
		<div class="title">Update</div>
	

		<form action="UpdateFavoriteSuc" method="post">
			<c:forEach var="bil" items="${billDetails}">
				<h2>Account Number</h2>
				<input type="text" name="acc_no" value="${bil.receiver_acc}">
				<br>

				<h2>Beneficiary Name</h2>
				<input type="text" name="ben_name" value="${bil.receiver_name}">
				<br>

				
				<h2>User Account</h2>
				<input type="text" name="userid"
					value="<%=cusDetails.getIdCustomer()%>" readonly>
				<br>

				<h2>Favpayeeid</h2>
						<input type="text" name="favpayeeid"
							value="${bil.favpayeeid}" readonly><br>
							
				<button type="submit" class="submit">Update</button>
			</c:forEach>
		</form>



	</div>


	
</body>
</html>