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
<title>Success</title>
</head>
<body>
	<div class="conntainer p-1">
		<div class="col align-self-center">
			<h1>${msg}</h1>
			<button class="btn btn-info" onclick="document.location='${url}'">Go
				Back</button>
		</div>
	</div>

</body>
</html>