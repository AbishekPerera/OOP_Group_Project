<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Check Contact Messages(admin)</title>
</head>

<body
	style="background-image: url('images/homebg.jpg'); background-attachment: fixed; background-size: cover;">

	<div class="container p-2">
		<h1>
			<b>Contact Us Messages</b>
		</h1>
	</div>

	<div class="conntainer p-1">
		<div class="col align-self-center">
			<table class="table table-primary table-striped table-hover"">
				<tr class="table-dark">
					<th>Contact Us ID</th>
					<th>Full Name</th>
					<th>Email</th>
					<th>Message</th>
					<th>Delete</th>
				</tr>
				<c:forEach items="${data}" var="cont">
					<tr>
						<td>${cont.getContactid()}</td>
						<td>${cont.getFullname()}</td>
						<td>${cont.getEmail()}</td>
						<td>${cont.getMessage()}</td>
						<td>
							<form method="post">
								<input type="hidden" name="id" value="${cont.getContactid()}" />
								<button class="btn btn-info" type="submit">Delete</button>
							</form>
						</td>
					</tr>
				</c:forEach>

			</table>
		</div>
	</div>

</body>

</html>