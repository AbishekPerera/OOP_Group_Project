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
<title>Favorite Bills</title>

<style type="text/css">
.gridform {
	display: grid;
	grid-template-columns: auto auto auto auto;
	grid-gap: 10px
}

#forms {
	background-color: red;
	width: 300px;
}
</style>

</head>
<body>

	<div class="form">
		<div class="title">Favorite Bill Payee</div>
		<div class="subtitle">Faster and safe!</div>

		<div class="gridform">
		
			<c:forEach var="bild" items="${billDetails}">
				<div id=forms>
				
					<form action="DeleteSelectConfirm" method="post">

						<h2>Account Number</h2>
						<input type="text" name="acc_no" value="${bild.receiver_acc}"
							readonly><br>

						<h2>Company Name</h2>
						<input type="text" name="ben_name" value="${bild.receiver_name}"
							readonly><br>

						<h2>User Account</h2>
						<input type="text" name="userid"
							value="<%=cusDetails.getIdCustomer()%>" readonly><br>
							
						<h2>Favpayeeid</h2>
						<input type="text" name="favpayeeid"
							value="${bild.favpayeeid}" readonly><br>

						<button type="submit" class="submit">Delete</button>
					</form>
				</div>
			</c:forEach>

		</div>
	</div>



</body>
</html>


