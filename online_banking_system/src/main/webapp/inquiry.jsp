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
<title>Inquiry</title>
</head>

<body
	style="background-image: url('images/homebg.jpg'); background-attachment: fixed; background-size: cover;">

	<div class="container p-2">
		<h1 class="text-center">
			<b>Inquiries</b>
		</h1>
	</div>

	<div class="conntainer p-1">
		<div class="col align-self-center">
			<button class="btn btn-link btn-lg"
				onclick="document.location='inquiryInsert.jsp'">Add New
				Inquiry</button>
		</div>
	</div>

	<div class="conntainer p-1">
		<div class="col align-self-center">
			<table class="table table-primary table-striped table-hover"">
				<tr class="table-dark">
					<th>Inquiry ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Phone Number</th>
					<th>Message</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>

				<c:forEach items="${list}" var="inq">

					<tr>
						<td>${inq.getInqId()}</td>
						<td>${inq.getName()}</td>
						<td>${inq.getEmail()}</td>
						<td>${inq.getPhone()}</td>
						<td>${inq.getMessage()}</td>
						<td>
							<button class="btn btn-info"
								onclick="document.location='insert?id=${inq.getInqId()}'">Edit</button>
						</td>
						<td>
							<form method="post">
								<input type="hidden" name="id" value="${inq.getInqId()}" />
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