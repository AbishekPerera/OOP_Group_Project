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
<title>Administrator Page</title>
</head>

<body
	style="background-image: url('images/homebg.jpg'); background-attachment: fixed; background-size: cover;">

	<div class="container p-2">
		<h1 class="text-center">
			<b>Administrator Page</b>
		</h1>
	</div>

	<div class="container p-5">
		<div class="row align-items-center">
			<div class="col">
				<button type="button" class="btn btn-danger btn-lg" onclick="document.location='#.jsp'">Loan Requests</button>
			</div>
			<div class="col">
				<button type="button" class="btn btn-danger btn-lg" onclick="document.location='adminInq'">Received Inquiries</button>
			</div>
			<div class="col">
				<button type="button" class="btn btn-danger btn-lg" onclick="document.location='adminContUs'">Contact
					Us Messages</button>
			</div>
		</div>
	</div>

</body>
</html>