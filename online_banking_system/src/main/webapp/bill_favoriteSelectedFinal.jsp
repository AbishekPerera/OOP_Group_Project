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
<title>Bill Payee</title>


</head>
<body>

	<div class="form">
		<div class="title">Pay Bill</div>
		<div class="subtitle">Faster and safe!</div>

		<form action="BillPay" method="post">
			<c:forEach var="bil" items="${billDetails}">
				<h2>Account Number</h2>
				<input type="text" name="acc_no" value="${bil.receiver_acc}" readonly>
				<br>

				<h2>Company Name</h2>
				<input type="text" name="com_name" value="${bil.receiver_name}" readonly>
				<br>

				<h2>Amount</h2>
				<input type="text" name="amount">
				<br>

				<h2>Date</h2>
				<input type="text" name="date" id="currentDate" readonly>
				<br>

				<h2>Time</h2>
				<input type="text" name="time" id="currentTime" readonly>
				<br>

				<h2>User Account</h2>
				<input type="text" name="userid"
					value="<%=cusDetails.getIdCustomer()%>" readonly>
				<br>

				<button type="submit" class="submit">Send</button>
			</c:forEach>
		</form>



	</div>


	<script>
		//get date 

		var today = new Date();
		var date = today.getFullYear() + '-' + (today.getMonth() + 1) + '-'
				+ today.getDate();
		document.getElementById("currentDate").value = date;
	</script>

	<script>
		//get time
		var today = new Date();
		var time = today.getHours() + ":" + today.getMinutes() + ":"
				+ today.getSeconds();
		document.getElementById("currentTime").value = time;
	</script>

</body>
</html>