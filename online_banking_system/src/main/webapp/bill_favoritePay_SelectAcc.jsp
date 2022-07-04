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
<title>Favorite Bill Pay</title>
</head>
<body>


	<div class="form">
		<div class="title">Select Your Account</div>

		<form action="FavPayeeSelectedAccc" method="post">

			<h2>User Account</h2>
			<input type="text" name="userid" value="<%=cusDetails.getIdCustomer()%>" readonly><br>

			<button type="submit" class="submit">Select</button>
		</form>



	</div>



</body>
</html>