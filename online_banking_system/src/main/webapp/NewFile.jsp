<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

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

</body>
</html>