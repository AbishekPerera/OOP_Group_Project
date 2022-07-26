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
<title>Edit Inquiry</title>
</head>

<body style="background-color: #a0f2eb">

	<div class="container p-2">
		<h2 class="text-center">
			<b>Edit Your Inquiry</b>
		</h2>
	</div>

	<form method="post" class="card p-4">

		<input type="hidden" name="id" value="${data.getInqId()}" required>
		<div class="row justify-content-center mb-2">
			<div class="col-2">
				<label for="uid">User ID</label>
			</div>
			<div class="col-4">
				<input class="form-control" value="${data.getUid()}" disabled
					type="text" id="uid" name="uid" required>
			</div>
		</div>
		<div class="row justify-content-center mb-2">
			<div class="col-2">
				<label for="name">Name</label>
			</div>
			<div class="col-4">
				<input class="form-control" type="text" id="name" name="name"
					value="${data.getName()}" required>
			</div>
		</div>

		<div class="row justify-content-center mb-2">
			<div class="col-2">
				<label for="name">Email</label>
			</div>
			<div class="col-4">
				<input class="form-control" type="email" id="email" name="email"
					value="${data.getEmail()}" required>
			</div>
		</div>

		<div class="row justify-content-center mb-2">
			<div class="col-2">
				<label for="phone">Phone Number</label>
			</div>
			<div class="col-4">
				<input class="form-control" type="tel" id="phone" name="phone"
					value="${data.getPhone()}"
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
					onmouseout="charcounts( 'value','countchar' );" required>${data.getMessage()}</textarea>
			</div>
		</div>

		<div class="row justify-content-center mt-2">
			<div class="col text-center">
				<input class="btn btn-primary" type="submit" value="Apply">
			</div>
		</div>

	</form>

</body>
</html>