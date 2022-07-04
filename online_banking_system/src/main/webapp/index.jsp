<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="styles/styles.css">

<script src="js/navbar.js"></script>
<script src="js/newsjs.js"></script>
<title>VishwaBank</title>
</head>

<body>

	<header>
		<a href="index.jsp" class="logo"><img
			src="images/VishwaBankLogo.png" alt=""></a>

		<ul>
			<li><a href="index.jsp">Home</a></li>
			<li><a href="#">About Us</a></li>
			<li><a href="#">News</a></li>
			<li><a href="#">Careers</a></li>
			<li><a href="#">Contact Us</a></li>
		</ul>
	</header>
	<!-- <section class="mainPoster" style="background-image: url('images/galaxy3.jpg');">
        <h1>TO THE FUTURE..</h1>
    </section> -->

	<section class="mainPoster">
		<video autoplay loop muted class="mainPostervd">
			<source src="images/galaxy.mp4" type="video/mp4">
		</video>
		<h1>TO THE FUTURE..</h1>

	</section>

	<section class="bankanytime"
		style="background-image: url('images/online.jpg');">
		<h1>
			Bank anytime, anywhere with <br>VishwaBank Online
		</h1>

		<div class="bankanytimedetails">
			<p>
				Introducing the all-new, feature-packed, <br>more personalized
				online banking experience. <br> We’ve reimagined the online
				banking experience <br>to bring you more capability and insight
				<br>into your day-to-day financial management <br>with
				some exciting new tools. <br>Online Banking is the free, <br>secure
				way to manage your finances online <br>from any web-enabled
				device from anywhere <br>you have access to the Internet.
			</p>
		</div>

		<a href="login.jsp"><button class="mainloginbtn">Login</button></a> <a
			href="register.jsp"><button class="mainloginbtn">Register</button></a>
	</section>

	<section class="credit"
		style="background-image: url('images/credit.jpg');">
		<h1>Choose the Card that fits you</h1>

		<div class="ccard">
			<img src="images/goldcd.jpg" alt=""> <img
				src="images/debitcd.jpg" alt=""> <img src="images/visacd.jpg"
				alt="">
		</div>

	</section>

	<section class="latestnews">
		<h1>Latest News</h1>

		<div class="slider">
			<img class="sliderimg" src="images/news/news1.png" alt=""
				onload="myVar = setTimeout(loadimage1, 5000)"> <img
				class="sliderimg" src="images/news/news2.png" alt=""
				onload="myVar = setTimeout(loadimage2, 10000)"> <img
				class="sliderimg" src="images/news/news3.png" alt=""
				onload="myVar = setTimeout(loadimage3, 15000)"> <img
				class="sliderimg" src="images/news/news1.png" alt=""
				onload="myVar = setTimeout(loadimage4, 20000)"> <img
				class="sliderimg" src="images/news/news2.png" alt=""
				onload="myVar = setTimeout(loadimage5, 25000)">
		</div>

		<div class="forjavascript" onload="sliderfunc()"></div>
	</section>


	<section class="footer">

		<div class="container">
			<div class="row">
				<div class="footer-col">
					<h4>company</h4>
					<ul>
						<li><a href="#">Home</a></li>
						<li><a href="#">our services</a></li>
						<li><a href="#">privacy policy</a></li>
						<li><a href="#">Contact Us</a></li>
					</ul>
				</div>
				<div class="footer-col">
					<h4>get help</h4>
					<ul>
						<li><a href="#">FAQ</a></li>

					</ul>
				</div>
				<div class="footer-col">
					<h4>online Banking</h4>
					<ul>
						<li><a href="#">Online Banking Portal</a></li>
						<li><a href="#">Help</a></li>

					</ul>
				</div>
				<div class="footer-col">
					<h4>follow us</h4>
					<div class="social-links">
						<a href="#"><img src="images/facebook (1).svg" alt=""></a> <a
							href="#"><img src="images/instagram.svg" alt=""></a> <a
							href="#"><img src="images/linkedin.svg" alt=""></a> <a
							href="#"><img src="images/twitter.svg" alt=""></a>
					</div>
				</div>
			</div>
		</div>


	</section>


</body>

</html>