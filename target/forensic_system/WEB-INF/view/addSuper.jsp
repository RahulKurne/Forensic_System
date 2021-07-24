<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="shortcut icon" href="img/favicon.png">

<title>FMS</title>

<!-- Bootstrap CSS -->
<link href="/forensic_system/URLToResourcesFolder/css/bootstrap.min.css"
	rel="stylesheet">
<!-- bootstrap theme -->
<link
	href="/forensic_system/URLToResourcesFolder/css/bootstrap-theme.css"
	rel="stylesheet">
<!--external css-->
<!-- font icon -->
<link
	href="/forensic_system/URLToResourcesFolder/css/elegant-icons-style.css"
	rel="stylesheet" />
<link
	href="/forensic_system/URLToResourcesFolder/css/font-awesome.min.css"
	rel="stylesheet" />
<!-- full calendar css-->
<link
	href="/forensic_system/URLToResourcesFolder/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css"
	rel="stylesheet" />
<link
	href="/forensic_system/URLToResourcesFolder/assets/fullcalendar/fullcalendar/fullcalendar.css"
	rel="stylesheet" />
<!-- easy pie chart-->
<link
	href="/forensic_system/URLToResourcesFolder/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css"
	rel="stylesheet" type="text/css" media="screen" />
<!-- owl carousel -->
<link rel="stylesheet"
	href="/forensic_system/URLToResourcesFolder/css/owl.carousel.css"
	type="text/css">
<link
	href="/forensic_system/URLToResourcesFolder/css/jquery-jvectormap-1.2.2.css"
	rel="stylesheet">
<!-- Custom styles -->
<link rel="stylesheet"
	href="/forensic_system/URLToResourcesFolder/css/fullcalendar.css">
<link href="/forensic_system/URLToResourcesFolder/css/widgets.css"
	rel="stylesheet">
<link href="/forensic_system/URLToResourcesFolder/css/style.css"
	rel="stylesheet">
<link
	href="/forensic_system/URLToResourcesFolder/css/style-responsive.css"
	rel="stylesheet" />
<link href="/forensic_system/URLToResourcesFolder/css/xcharts.min.css"
	rel=" stylesheet">
<link
	href="/forensic_system/URLToResourcesFolder/css/jquery-ui-1.10.4.min.css"
	rel="stylesheet">

</head>

<body>
	<!-- container section start -->
	<section id="container" class="">


		<header class="header dark-bg">
			<div class="toggle-nav">
				<div class="icon-reorder tooltips"
					data-original-title="Toggle Navigation" data-placement="bottom">
					<i class="icon_menu"></i>
				</div>
			</div>

			<!--logo start-->
			<a href="index.html" class="logo">Forensic <span class="lite">System</span></a>
			<!--logo end-->

			<div class="nav search-row" id="top_menu">
				<!--  search form start -->
				<ul class="nav top-menu">
					<li>
						<form class="navbar-form">
							<input class="form-control" placeholder="Search" type="text">
						</form>
					</li>
				</ul>
				<!--  search form end -->
			</div>

			<div class="top-nav notification-row">
				<!-- notificatoin dropdown start-->
				<ul class="nav pull-right top-menu">

					<!-- task notificatoin start -->
					<li id="task_notificatoin_bar" class="dropdown"><a
						data-toggle="dropdown" class="dropdown-toggle" href="#"> <i
							class="icon-task-l"></i> <span class="badge bg-important">6</span>
					</a>
						<ul class="dropdown-menu extended tasks-bar">
							<div class="notify-arrow notify-arrow-blue"></div>
							<li>
								<p class="blue">You have 6 pending letter</p>
							</li>
							<li><a href="#">
									<div class="task-info">
										<div class="desc">Design PSD</div>
										<div class="percent">90%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-success"
											role="progressbar" aria-valuenow="90" aria-valuemin="0"
											aria-valuemax="100" style="width: 90%">
											<span class="sr-only">90% Complete (success)</span>
										</div>
									</div>
							</a></li>
							<li><a href="#">
									<div class="task-info">
										<div class="desc">Project 1</div>
										<div class="percent">30%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-warning"
											role="progressbar" aria-valuenow="30" aria-valuemin="0"
											aria-valuemax="100" style="width: 30%">
											<span class="sr-only">30% Complete (warning)</span>
										</div>
									</div>
							</a></li>
							<li><a href="#">
									<div class="task-info">
										<div class="desc">Digital Marketing</div>
										<div class="percent">80%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-info" role="progressbar"
											aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"
											style="width: 80%">
											<span class="sr-only">80% Complete</span>
										</div>
									</div>
							</a></li>
							<li><a href="#">
									<div class="task-info">
										<div class="desc">Logo Designing</div>
										<div class="percent">78%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-danger"
											role="progressbar" aria-valuenow="78" aria-valuemin="0"
											aria-valuemax="100" style="width: 78%">
											<span class="sr-only">78% Complete (danger)</span>
										</div>
									</div>
							</a></li>
							<li><a href="#">
									<div class="task-info">
										<div class="desc">Mobile App</div>
										<div class="percent">50%</div>
									</div>
									<div class="progress progress-striped active">
										<div class="progress-bar" role="progressbar"
											aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"
											style="width: 50%">
											<span class="sr-only">50% Complete</span>
										</div>
									</div>

							</a></li>
							<li class="external"><a href="#">See All Tasks</a></li>
						</ul></li>
					<!-- task notificatoin end -->
					<!-- inbox notificatoin start-->
					<li id="mail_notificatoin_bar" class="dropdown"><a
						data-toggle="dropdown" class="dropdown-toggle" href="#"> <i
							class="icon-envelope-l"></i> <span class="badge bg-important">5</span>
					</a>
						<ul class="dropdown-menu extended inbox">
							<div class="notify-arrow notify-arrow-blue"></div>
							<li>
								<p class="blue">You have 5 new messages</p>
							</li>
							<li><a href="#"> <span class="photo"><img
										alt="avatar" src="./img/avatar-mini.jpg"></span> <span
									class="subject"> <span class="from">Greg Martin</span> <span
										class="time">1 min</span>
								</span> <span class="message"> I really like this admin panel. </span>
							</a></li>
							<li><a href="#"> <span class="photo"><img
										alt="avatar" src="./img/avatar-mini2.jpg"></span> <span
									class="subject"> <span class="from">Bob Mckenzie</span>
										<span class="time">5 mins</span>
								</span> <span class="message"> Hi, What is next project plan? </span>
							</a></li>
							<li><a href="#"> <span class="photo"><img
										alt="avatar" src="./img/avatar-mini3.jpg"></span> <span
									class="subject"> <span class="from">Phillip Park</span>
										<span class="time">2 hrs</span>
								</span> <span class="message"> I am like to buy this Admin
										Template. </span>
							</a></li>
							<li><a href="#"> <span class="photo"><img
										alt="avatar" src="./img/avatar-mini4.jpg"></span> <span
									class="subject"> <span class="from">Ray Munoz</span> <span
										class="time">1 day</span>
								</span> <span class="message"> Icon fonts are great. </span>
							</a></li>
							<li><a href="#">See all messages</a></li>
						</ul></li>
					<!-- inbox notificatoin end -->
					<!-- alert notification start-->
					<li id="alert_notificatoin_bar" class="dropdown"><a
						data-toggle="dropdown" class="dropdown-toggle" href="#"> <i
							class="icon-bell-l"></i> <span class="badge bg-important">7</span>
					</a>
						<ul class="dropdown-menu extended notification">
							<div class="notify-arrow notify-arrow-blue"></div>
							<li>
								<p class="blue">You have 4 new notifications</p>
							</li>
							<li><a href="#"> <span class="label label-primary"><i
										class="icon_profile"></i></span> Friend Request <span
									class="small italic pull-right">5 mins</span>
							</a></li>
							<li><a href="#"> <span class="label label-warning"><i
										class="icon_pin"></i></span> John location. <span
									class="small italic pull-right">50 mins</span>
							</a></li>
							<li><a href="#"> <span class="label label-danger"><i
										class="icon_book_alt"></i></span> Project 3 Completed. <span
									class="small italic pull-right">1 hr</span>
							</a></li>
							<li><a href="#"> <span class="label label-success"><i
										class="icon_like"></i></span> Mick appreciated your work. <span
									class="small italic pull-right"> Today</span>
							</a></li>
							<li><a href="#">See all notifications</a></li>
						</ul></li>
					<!-- alert notification end-->
					<!-- user login dropdown start-->
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#"> <span class="profile-ava">
								<img alt="" src="/forensic_system/URLToResourcesFolder/img/avatar1_small.jpg">
						</span> <span class="username">${firstname}</span> <b class="caret"></b>
					</a>
						<ul class="dropdown-menu extended logout">
							<div class="log-arrow-up"></div>
							<li class="eborder-top"><a href="#"><i
									class="icon_profile"></i> My Profile</a></li>
							<li><a href="#"><i class="icon_mail_alt"></i> My Inbox</a></li>
							<li><a href="#"><i class="icon_clock_alt"></i> Timeline</a>
							</li>
							<li><a href="#"><i class="icon_chat_alt"></i> Chats</a></li>
							<li><a href="login.html"><i class="icon_key_alt"></i>
									Log Out</a></li>
							<li><a href="documentation.html"><i class="icon_key_alt"></i>
									Documentation</a></li>
							<li><a href="documentation.html"><i class="icon_key_alt"></i>
									Documentation</a></li>
						</ul></li>
					<!-- user login dropdown end -->
				</ul>
				<!-- notificatoin dropdown end-->
			</div>
		</header>
		<!--header end-->



		<!--sidebar start-->
		<aside>
			<div id="sidebar" class="nav-collapse ">
				<!-- sidebar menu start-->
				<ul class="sidebar-menu">
					<li class="active"><a class="" href="index.html"> <i
							class="icon_house_alt"></i> <span>Dashboard</span>
					</a></li>
					<li class="sub-menu"><a href="adminDash" class=""> <!-- <i class="icon_document_alt"></i> -->
							<span>Admin</span> <!-- <span class="menu-arrow arrow_carrot-right"></span> -->
					</a> <!--   <ul class="sub">
              <li><a class="" href="form_component.html">Form Elements</a></li>
              <li><a class="" href="form_validation.html">Form Validation</a></li>
            </ul> --></li>
					<li class="sub-menu"><a href="javascript:;" class=""> <!--  <i class="icon_desktop"></i> -->
							<span>Officer</span> <span class="menu-arrow arrow_carrot-right"></span>
					</a>
						<ul class="sub">
							<li><a class="" href="addOffi">Add</a></li>
							<li><a class="" href="viewOffi">view</a></li>

						</ul></li>
					<li class="sub-menu"><a href="javascript:;" class=""> <!--  <i class="icon_genius"></i> -->
							<span>Supervisor</span> <span
							class="menu-arrow arrow_carrot-right"></span>
					</a>
						<ul class="sub">
							<li><a class="" href="addSuper">Add</a></li>
							<li><a class="" href="viewSuper">view</a></li>

						</ul></li>
					<li class="sub-menu"><a href="javascript:;" class=""> <!--  <i class="icon_desktop"></i> -->
							<span>Guest</span> <span class="menu-arrow arrow_carrot-right"></span>
					</a>
						<ul class="sub">
							<li><a class="" href="addGuest">Add</a></li>
							<li><a class="" href="viewGuest">view</a></li>

						</ul></li>
					<!--  <li>
            <a class="" href="chart-chartjs.html">
                          <i class="icon_piechart"></i>
                          <span>Charts</span>

                      </a>

          </li>

          <li class="sub-menu">
            <a href="javascript:;" class="">
                          <i class="icon_table"></i>
                          <span>Tables</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
            <ul class="sub">
              <li><a class="" href="basic_table.html">Basic Table</a></li>
            </ul>
          </li>

          <li class="sub-menu">
            <a href="javascript:;" class="">
                          <i class="icon_documents_alt"></i>
                          <span>Pages</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
            <ul class="sub">
              <li><a class="" href="profile.html">Profile</a></li>
              <li><a class="" href="login.html"><span>Login Page</span></a></li>
              <li><a class="" href="contact.html"><span>Contact Page</span></a></li>
              <li><a class="" href="blank.html">Blank Page</a></li>
              <li><a class="" href="404.html">404 Error</a></li>
            </ul>
          </li>

        </ul> -->
					<!-- sidebar menu end-->
			</div>
		</aside>
		<!--sidebar end-->

		<!--main content start-->

		<section id="main-content">
			<section class="wrapper">
				<!--overview start-->








				<!-- Officier Registration Form-->

				<div class="container">

					<form action="addSuper" method="POST">
						<div class="form-row">
							<div class="form-group col-md-12">
								<h1 class="display-4">Add Supervisor</h1>
							</div>
							<div class="form-group col-md-6">
								<input type="text" class="form-control" placeholder="First name"
									name="f_name" required>
							</div>
							<div class="form-group col-md-6">
								<input type="text" class="form-control" placeholder="Last name"
									name="l_name" required>
							</div>
							<div class="form-group col-md-6 ">
								<label for="inputEmail4">Email</label>
								<div class="input-group mb-3">
									<div class="input-group-prepend">
										<span class="input-group-text" id="basic-addon1">@</span>
									</div>
									<input type="email" class="form-control" id="inputEmail4"
										placeholder="abc@gmail.com" name="mail"required>
								</div>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Password</label> <input
									type="password" class="form-control" id="inputPassword4"
									placeholder="**********" name="pwd" required>
							</div>

							<div class="form-group col-md-6">
								<label for="birthDate" class="col-sm-3 control-label">Date
									of Birth</label> <input type="date" id="birthDate"
									class="form-control" name="dob">

							</div>
							<div class="form-group col-md-6">
								<label for="gender">Gender</label>
								<div class="form-group col-md-6">
									<div class="form-check-inline">
										<label class="form-check-label"> <input type="radio"
											class="form-check-input" id="gender" name="gender" value="Male">Male
										</label>
									</div>
									<div class="form-check-inline">
										<label class="form-check-label"> <input type="radio"
											class="form-check-input" id="gender" name="gender" value="Female">Female
										</label>
									</div>
								</div>
							</div>

						</div>
						<div class="form-group">
							<label for="inputAddress">Current Address</label> <input
								type="text" class="form-control" id="inputAddress"
								placeholder="1234 Main St" name="c_add">
						</div>
						<div class="form-group">
							<label for="inputAddress2">Permanent Address</label> <input
								type="text" class="form-control" id="inputAddress2"
								placeholder="Apartment,Tal,Dis.." name="p_add">
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputCity">City</label> <input type="text"
									class="form-control" id="inputCity" placeholder="City" name="city">
							</div>
							<div class="form-group col-md-6">
								<label for="inputZip">Salary</label> <input type="text"
									class="form-control" id="inputZip" placeholder="Annual Income" name="zip">
							</div>
							<div class="form-group ">
								
							</div>


						</div>
						<div class="form-group">
							<div class="form-check">
								<input class="form-check-input" type="checkbox" id="gridCheck">
								<label class="form-check-label" for="gridCheck"> Check
									me out </label>
							</div>
						</div>
						<button type="submit" class="btn btn-success" name="save_super">Save
							Supervisor</button>
					</form>
				</div>

				<!-- statics end -->




				<!-- project team & activity start -->


				<!-- project team & activity end -->

			</section>
			<div class="text-center">
				<div class="fixed-bottom">
					<!--
            All the links in the footer should remain intact.
            You can delete the links only if you purchased the pro version.
            Licensing information: https://bootstrapmade.com/license/
            Purchase the pro version form: https://bootstrapmade.com/buy/?theme=NiceAdmin
          -->
					Designed by <a href="https://#.com/">Cravita Technology</a>
				</div>
			</div>
		</section>

		<!--main content end-->
	</section>
	<!-- container section start -->

	<!-- javascripts -->
	<script src="/forensic_system/URLToResourcesFolder/js/jquery.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/js/jquery-ui-1.10.4.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript"
		src="/forensic_system/URLToResourcesFolder/js/jquery-ui-1.9.2.custom.min.js"></script>
	<!-- bootstrap -->
	<script src="/forensic_system/URLToResourcesFolder/js/bootstrap.min.js"></script>
	<!-- nice scroll -->
	<script
		src="/forensic_system/URLToResourcesFolder/js/jquery.scrollTo.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/js/jquery.nicescroll.js"
		type="text/javascript"></script>
	<!-- charts scripts -->
	<script
		src="/forensic_system/URLToResourcesFolder/assets/jquery-knob/js/jquery.knob.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/js/jquery.sparkline.js"
		type="text/javascript"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
	<script src="/forensic_system/URLToResourcesFolder/js/owl.carousel.js"></script>
	<!-- jQuery full calendar -->
	<
	<script
		src="/forensic_system/URLToResourcesFolder/js/fullcalendar.min.js"></script>
	<!-- Full Google Calendar - Calendar -->
	<script src="assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
	<!--script for this page only-->
	<script
		src="/forensic_system/URLToResourcesFolder/js/calendar-custom.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/js/jquery.rateit.min.js"></script>
	<!-- custom select -->
	<script
		src="/forensic_system/URLToResourcesFolder/js/jquery.customSelect.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/assets/chart-master/Chart.js"></script>

	<!--custome script for all page-->
	<script src="/forensic_system/URLToResourcesFolder/js/scripts.js"></script>
	<!-- custom script for this page-->
	<script
		src="/forensic_system/URLToResourcesFolder/js/sparkline-chart.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/js/easy-pie-chart.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/js/jquery-jvectormap-1.2.2.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/js/jquery-jvectormap-world-mill-en.js"></script>
	<script src="/forensic_system/URLToResourcesFolder/js/xcharts.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/js/jquery.autosize.min.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/js/jquery.placeholder.min.js"></script>
	<script src="/forensic_system/URLToResourcesFolder/js/gdp-data.js"></script>
	<script src="/forensic_system/URLToResourcesFolder/js/morris.min.js"></script>
	<script src="/forensic_system/URLToResourcesFolder/js/sparklines.js"></script>
	<script src="/forensic_system/URLToResourcesFolder/js/charts.js"></script>
	<script
		src="/forensic_system/URLToResourcesFolder/js/jquery.slimscroll.min.js"></script>
	<script>
		//knob
		$(function() {
			$(".knob").knob({
				'draw' : function() {
					$(this.i).val(this.cv + '%')
				}
			})
		});

		//carousel
		$(document).ready(function() {
			$("#owl-slider").owlCarousel({
				navigation : true,
				slideSpeed : 300,
				paginationSpeed : 400,
				singleItem : true

			});
		});

		//custom select box

		$(function() {
			$('select.styled').customSelect();
		});

		/* ---------- Map ---------- */
		$(function() {
			$('#map').vectorMap({
				map : 'world_mill_en',
				series : {
					regions : [ {
						values : gdpData,
						scale : [ '#000', '#000' ],
						normalizeFunction : 'polynomial'
					} ]
				},
				backgroundColor : '#eef3f7',
				onLabelShow : function(e, el, code) {
					el.html(el.html() + ' (GDP - ' + gdpData[code] + ')');
				}
			});
		});
	</script>

</body>

</html>
