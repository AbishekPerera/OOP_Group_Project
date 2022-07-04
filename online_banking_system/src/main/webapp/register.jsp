<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles/register.css">

<title>Register User</title>


</head>
<body>

	<section
		style="background-image: url(images/register/bg.jpg); height: 780px">

		<div class="navbar">
			<a href="index.jsp"><img src="images/VishwaBankLogo.png" alt=""></a>
		</div>
		<div class="loginform">

			<form action="RegisterCustomer" method="post">
				<h2>Register</h2>

				<div class="loginbox">
					<input type="text" name="userName" required> <span>User Name</span>
				</div>

				
				<div class="loginbox">
					<input type="text" name="name" required> <span>Full Name</span>
				</div>

				<div class="loginbox">
					<input type="email" name="email" required> <span>Email</span>
				</div>
				
				<div class="loginbox">
					<input type="tel" name="phone" pattern="[0-9]{10}" required> <span>Phone(07*******)</span>
				</div>

				<div class="loginbox">
					<input type="text" name="nic" required> <span>NIC</span>
				</div>
				
				
				<div class="loginbox">
					<input type="password" name="pass" required> <span>Password</span>
				</div>

				<div class="loginsubmit">
					<button type="submit" name="submit">Register</button>
				</div>

			</form>
		</div>
	</section>

</body>
</html>