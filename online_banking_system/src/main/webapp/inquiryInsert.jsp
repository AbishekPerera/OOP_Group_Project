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
<title>Insert inquiry</title>
</head>

<body style="background-color: #a0f2eb">

	<div class="container p-2">
		<h2 class="text-center">
			<b>Add an Inquiry</b>
		</h2>
	</div>

	<form action="insert" method="post" class="card p-4">

		<div class="row justify-content-center mb-2">
			<div class="col-2">
				<label for="uid">User ID</label>
			</div>
			<div class="col-4">
				<input class="form-control" value="1"
					id="uid" name="uid" required>
			</div>
		</div>

		<div class="row justify-content-center mb-2">
			<div class="col-2">
				<label for="name">Name</label>
			</div>
			<div class="col-4">
				<input class="form-control" type="text" id="name" name="name" required>
			</div>
		</div>

		<div class="row justify-content-center mb-2">
			<div class="col-2">
				<label for="name">Email</label>
			</div>
			<div class="col-4">
				<input class="form-control" type="email" id="email" name="email" required>
			</div>
		</div>

		<div class="row justify-content-center mb-2">
			<div class="col-2">
				<label for="phone">Phone Number</label>
			</div>
			<div class="col-4">
				<input class="form-control" type="tel" id="phone" name="phone"
					pattern="[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"
					required>
			</div>
		</div>

		<div class="row justify-content-center mb-2">
			<div class="col-2">
				<label for="message">Your Message</label>
			</div>
			<div class="col-4">
				<textarea class="form-control" id="value" name="message" rows="8"
					maxlength="10000" onkeyup="charcounts( 'value','countchar' );"
					onkeydown="charcounts( 'value','countchar' );"
					onmouseout="charcounts( 'value','countchar' );" required></textarea>
			</div>
		</div>

		<div class="row justify-content-center mt-2">
			<div class="col text-center">
				<input class="btn btn-primary" type="submit" value="Send">
			</div>
		</div>

	</form>

</body>

</html>