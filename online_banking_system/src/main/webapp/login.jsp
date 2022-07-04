<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">


<link rel="stylesheet" href="styles/login.css">

<title>Login</title>


</head>
<body>

	<section
		style="background-image: url(images/login/bg.jpg); height: 780px">

		<div class="navbar">
			<a href="index.jsp"><img src="images/VishwaBankLogo.png" alt=""></a>
		</div>
		<div class="loginform">

			<form action="login" method="post">
				<h2>Login</h2>

				<div class="loginbox">
					<input type="text" name="uid" required> <span>USERNAME</span>
				</div>

				<div class="loginbox">
					<input type="password" name="pass" required> <span>PASSWORD</span>
				</div>

				<div class="loginsubmit">
					<button type="submit" name="submit">Login</button>
				</div>

			</form>
		</div>
	</section>

</body>
</html>