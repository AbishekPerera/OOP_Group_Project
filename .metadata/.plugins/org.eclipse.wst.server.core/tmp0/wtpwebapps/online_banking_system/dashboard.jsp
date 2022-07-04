<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

<link rel="stylesheet" href="styles/home.css">
<link rel="stylesheet" href="styles/homeNav.css">
<link rel="stylesheet" href="styles/dashboard.css">

<title>DashBoard</title>
</head>
<body>

	<header>
		<a href="index.jsp" class="logo"><img
			src="images/VishwaBankLogo.png" alt=""></a>

		<ul>
			<li><a href="updateCustomerDetails.jsp"><img
					src="images/homeNav/person-circle.svg" alt=""></a></li>
			<li><a href="#"><img src="images/homeNav/bell.svg" alt=""></a></li>
			<li><a href="DeleteCustomerDetails.jsp"><img
					src="images/homeNav/gear.svg" alt=""></a></li>
			<li><a href="index.jsp"><img src="images/homeNav/exit.svg"
					alt=""></a></li>

		</ul>
	</header>


	<input type="checkbox" name="" id="sidebarcheck">
	<label for="sidebarcheck"> <img src="images/homeNav/list.svg"
		alt="" id="btn"> <img src="images/homeNav/x.svg" alt="" id="x">

	</label>
	<div class="sidebar">

		<div class="sideheader">Vishwa Bank</div>

		<ul>
			<li><a href="dashboard1.jsp">Dashboard</a></li>
			<li><a href="accounts.jsp">Accounts</a></li>
			<li><a href="fund_transfer.jsp">Fund transfer</a></li>
			<li><a href="bill_payment.jsp">Bill payments</a></li>
			<li><a href="#">Inquiries</a></li>
			<li><a href="#">Loans</a></li>

		</ul>

	</div>

	<!-- content -->

	<section style="background-image: url(images/home/homebg.jpg);">


		<c:forEach var="cus" items="${cusDetails}">


			<div class="username">
				<h2>${cus.name}</h2>
			</div>


			<table style="width: 800px;">
				<tr>
					<th>Customer ID</th>
					<th>User Name</th>
					<th></th>
				</tr>
				<tr>
					<td>${cus.idCustomer}</td>
					<td>${cus.userName}</td>
					<td></td>

				</tr>


				<tr>
					<th>Email</th>
					<th>Phone Number</th>
					<th>NIC</th>
				</tr>
				<tr>
					<td>${cus.email}</td>
					<td>${cus.phone}</td>
					<td>${cus.nic}</td>

				</tr>

			</table>

		</c:forEach>





	</section>



</body>
</html>