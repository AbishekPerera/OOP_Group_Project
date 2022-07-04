<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<link rel="stylesheet" href="styles/home.css">
<link rel="stylesheet" href="styles/homeNav.css">
<link rel="stylesheet" href="styles/dashboard.css">
<link rel="stylesheet" href="styles/fund_transfer.css">


<title>Favorite Fund Transfer</title>
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
			<li><a href="#">Bill payments</a></li>
			<li><a href="#">Inquiries</a></li>
			<li><a href="#">Loans</a></li>

		</ul>

	</div>

	<section
		style="background-image: url(images/home/homebg.jpg); height: 625px;">
		<div class="goback">
			<button onclick="history.back()">Go Back</button>
		</div>
		<div class="fundtrnsbody">
			<a href="favorite_transfer.jsp">
				<button class="fundtrnsbodybtn" type="button">Transfer
					Money</button>
			</a> <a href="favorite_transfer_edit.jsp">
				<button class="fundtrnsbodybtn" type="button">Update
					Favorites</button>
			</a> <a href="favorite_transfer_delete.jsp">
				<button class="fundtrnsbodybtn" type="button">Delete
					Favorites</button>
			</a> <a href="favorite_transfer_insert.jsp">
				<button class="fundtrnsbodybtn" type="button">Insert
					Favorites</button>
			</a>


		</div>
	</section>
</body>
</html>