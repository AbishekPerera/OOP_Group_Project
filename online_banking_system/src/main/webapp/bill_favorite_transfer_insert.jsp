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
<title>Favorite</title>
</head>
<body>

	<form action="InsertFavoriteBill" method="post">

		<h3>Account No</h3>
		<input type="text" name="receiver_acc" value=""><br>

		<h3>Company Name</h3>
		<input type="text" name="receiver_name" value=""><br>

		<h3>User Account</h3>
		<input type="text" name="uid" value="<%=cusDetails.getIdCustomer()%>"><br>

		<input type="submit" name="submit" value="Insert Beneficiary Data">

	</form>

</body>
</html>