<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Contact Us</title>
</head>

<body style="background-color: #a0f2eb">

	<div class="container p-2">
		<h1 class="text-center">
			<b>Contact Us</b>
		</h1>
	</div>

	<form action="contactUs" method="post" class="card p-4">

		<div class="row justify-content-center mb-2">
				<div class="col-2">
					<label for="fname">Full Name</label>
				</div>
				<div class="col-4">
					<input class="form-control" type="text" id="fname" name="fullname"
						placeholder="your full name..." required>
				</div>
			</div>
			<div class="row justify-content-center mb-2">
				<div class="col-2">
					<label for="email">Email</label>
				</div>
				<div class="col-4">
					<input class="form-control" type="email" id="email" name="email"
						placeholder="enter email..." required>
				</div>
			</div>
			<div class="row justify-content-center mb-2">
				<div class="col-2">
					<label for="message">What can we help you with?</label>
				</div>
				<div class="col-4">
					<textarea class="form-control" id="value" name="message" rows="8"
						maxlength="10000" onkeyup="charcounts( 'value','countchar' );"
						onkeydown="charcounts( 'value','countchar' );"
						onmouseout="charcounts( 'value','countchar' );"
						placeholder="write somethings..." required></textarea>
				</div>
			</div>

			<div class="row justify-content-center mt-2">
				<div class="col text-center">
					<input class="btn btn-primary" type="submit" value="submit">
				</div>
			</div>
	</form>
</body>
</html>