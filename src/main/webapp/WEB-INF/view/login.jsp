<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Login Template</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link
	href="https://fonts.googleapis.com/css?family=Karla:400,700&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.materialdesignicons.com/4.8.95/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="/forensic_system/URLToResourcesFolder/css/login.css">
<style>
body {
	background-image:
		url("/forensic_system/URLToResourcesFolder/img/1592093.jpg");
}
</style>
</head>
<body>
	<!-- ======= Top Bar ======= -->
	<div id="topbar" class="d-none d-lg-flex align-items-center fixed-top">
		<div class="container">
			<div class="contact-info mr-auto">
				<i class="icofont-envelope"></i> <a
					href="mailto:contact@example.com">forensicsys@gmail.com</a> <i
					class="icofont-phone"></i> +9134335349
			</div>
			<div class="social-links">
				<a href="#" class="twitter"><i class="icofont-twitter"></i></a> <a
					href="#" class="facebook"><i class="icofont-facebook"></i></a> <a
					href="#" class="instagram"><i class="icofont-instagram"></i></a> <a
					href="#" class="skype"><i class="icofont-skype"></i></a> <a
					href="#" class="linkedin"><i class="icofont-linkedin"></i></i></a>
			</div>
		</div>
	</div>

	<!-- header -->
	<header id="header">
		<nav
			class="navbar navbar-expand-lg navbar-dark bg-dark scrolling-navabr">
			<div class="container">
				<a class="navbar-brand" href="#">FORENSIC SYSTEM</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<!-- column auto start -->
				<div class="col-auto">
					<div class="collapse navbar-collapse" id="sticky-nav">
						<ul class="navbar-nav ">

							<li class="nav-item "><a class="nav-link" href="index">Home
									<span class="sr-only">(current)</span>
							</a></li>
							<hr />
							<li class="nav-item "><a class="nav-link" href="#about">About</a>
							</li>
							<li class="nav-item "><a class="nav-link" href="#services">Services</a>
							</li>

							<li class="nav-item "><a class="nav-link" href="#contact">Contact</a>
							</li>
							<li class="nav-item  active"><a class="nav-link"
								href="login">Login</a></li>

						</ul>

					</div>
				</div>
				<!-- column auto end -->
			</div>

		</nav>

	</header>





	<main class="d-flex align-items-center min-vh-100 py-3 py-md-0">
		<div class="container">
			<div class="card login-card">
				<div class="row no-gutters">
					<div class="col-md-5">
						<img
							src="/forensic_system/URLToResourcesFolder/assets/img/login.jpeg"
							alt="login" class="login-card-img">
					</div>
					<div class="col-md-7">
						<div class="card-body">

							<p class="login-card-description">
								<i><b>Sign into your account</b></i>
							</p>

							<form action="logProcess" method="POST">
								<div class="form-group">
									<label style="color: Red">${message}</label>
								</div>
								<div class="form-group">
									<select class="form-control" id="exampleFormControlSelect1" name="utype">
										<option>Select</option>
										<option>Admin</option>
										<option>Officer</option>
										<option>Supervisor</option>
										<option>Guest</option>
										<option>General_User</option>
									</select>
								</div>

								<div class="form-group">
									<label for="email" class="sr-only">Email</label> 
									<input type="email" name="email" id="email" class="form-control"
										placeholder="Email address">
								</div>
								<div class="form-group mb-4">
									<label for="password" class="sr-only">Password</label> <input
										type="password" name="password" id="password"
										class="form-control" placeholder="***********">
								</div>
								<input type="submit" name="login" id="login"
									class="btn btn-block login-btn mb-4" value="Login">
							</form>
							<a href="#!" class="forgot-password-link">Forgot password?</a>
							<p class="login-card-footer-text">
								Don't have an account? <a href="registration" class="text-reset">Register
									here</a>
							</p>
							<nav class="login-card-footer-nav">
								<a href="#!">Terms of use.</a> <a href="#!">Privacy policy</a>
							</nav>
						</div>
					</div>
				</div>
			</div>

		</div>
	</main>
	<script
		src="/forensic_system/URLToResourcesFolder/assets/vendor/jquery/jquery.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/assets/vendor/jquery.easing/jquery.easing.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/assets/vendor/php-email-form/validate.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/assets/vendor/waypoints/jquery.waypoints.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/assets/vendor/counterup/counterup.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/assets/vendor/owl.carousel/owl.carousel.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/assets/vendor/venobox/venobox.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/assets/vendor/aos/aos.js"></script>

	<!-- Template Main JS File -->
	<script src="/forensic_system/URLToResourcesFolder/assets/js/main.js"></script>
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>
