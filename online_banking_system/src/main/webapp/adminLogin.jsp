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
<title>Administrator Login</title>
</head>
<body>

	<section class="vh-100" style="background-color: #06053b;">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col col-xl-10">
					<div class="card" style="border-radius: 1rem;">
						<div class="row g-0">
							<div class="col-md-6 col-lg-5 d-none d-md-block">
								<img src="images\image1.jpg" alt="login form" class="rounded-3"
									width="475" height="500" />
							</div>
							<div class="col-md-6 col-lg-7 d-flex align-items-center">
								<div class="card-body p-4 p-lg-5 text-black">

									<form action="admin" method="post">

										<div class="d-flex align-items-center mb-3 pb-1">
											<img src="images/VishwaBankLogo.png" width="150" height="80">
										</div>

										<h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Sign
											into your account</h5>

										<div class="form-outline mb-4">
											<label class="form-label">User Name</label> <input
												type="text" class="form-control form-control-lg"
												name="username" required />
										</div>

										<div class="form-outline mb-4">
											<label class="form-label">Password</label> <input
												type="password" class="form-control form-control-lg"
												name="pass" required />
										</div>

										<div class="row justify-content-center mt-2">
											<div class="col text-center">
												<input class="btn btn-dark" type="submit" value="Login">
											</div>
										</div>
									</form>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>




