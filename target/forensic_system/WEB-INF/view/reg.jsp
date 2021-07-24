<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> 
 
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
  
  <link href="https://fonts.googleapis.com/css?family=Karla:400,700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://cdn.materialdesignicons.com/4.8.95/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up </title>
    

    <!-- Font Icon -->
    <link rel="stylesheet" href="/forensic_system/URLToResourcesFolder/reg/fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="/forensic_system/URLToResourcesFolder/css/index1.css">
    
    <style>
    body {
 background-image: url("/forensic_system/URLToResourcesFolder/img/1592093.jpg");
  }
  
 /*--------------------------------------------------------------
# Top Bar
--------------------------------------------------------------*/
#topbar {
  background: #106eea;
  position: fixed;
  height: 40px;
  font-size: 14px;
  transition: all 0.5s;
  color: #fff;
}



#topbar .contact-info a {
  line-height: 1;
  color: #fff;
  transition: 0.3s;
}

#topbar .contact-info a:hover {
  text-decoration: underline;
}

#topbar .contact-info i {
  padding-right: 4px;
  margin-left: 15px;
}

#topbar .contact-info i:first-child {
  margin-left: 0;
}

#topbar .social-links a {
  color: rgba(255, 255, 255, 0.6);
  padding-left: 15px;
  display: inline-block;
  line-height: 1px;
  transition: 0.3s;
}

#topbar .social-links a:hover {
  color: #fff;
}

/*--------------------------------------------------------------
# Header
--------------------------------------------------------------*/



#header {
  background: #fff;
  height: 10px;
  width: 100%;
  position: fixed;
  transition: all 0.5s;
  z-index: 2;
  padding: 0px 0;
  top: 40px;
  box-shadow: 0px 2px 15px rgba(0, 0, 0, 0.1);
}
.affix {
    top: 0;
    width: 100%;
    z-index: 9999 !important;
  }

  .affix + .container-fluid {
    padding-top: 70px;
  }

 nav .bg-dark{
  background-color: red;
}
.navbar-brand{
  font-weight: bold;
  font-family: monospace;
  font-size: 25px;
  margin-left: 10px
}
.navbar-dark .navbar-nav .nav-link{
  font-weight: 700;
  font-size: 14px;
  text-transform: uppercase;
  color: black;
}
.navbar-dark .navbar-nav .nav-item{
    margin: 0 15px;
}
.navbar-nav{
  height: 40px;
  width: 25;
  margin:-95px 0;
  background: linear-gradient(to right,#ffff00 0%,#ff3399 100%);
  border:none;
  border-radius: 50px;
  transition: .5s ease-in-out;
}
.nav-item:hover ~ .navbar-nav{
  margin-right: 25%;
}
.signup-content {
  background: #fff;
  border-radius: 10px;
  -moz-border-radius: 10px;
  -webkit-border-radius: 10px;
  -o-border-radius: 10px;
  -ms-border-radius: 10px;
  padding: 50px 85px; }
  .form-group {
  overflow: hidden;
  margin-bottom: 20px; }

.form-input {
  width: 100%;
  border: 1px solid #ebebeb;
  border-radius: 5px;
  -moz-border-radius: 5px;
  -webkit-border-radius: 5px;
  -o-border-radius: 5px;
  -ms-border-radius: 5px;
  padding: 17px 20px;
  box-sizing: border-box;
  font-size: 14px;
  font-weight: 500;
  color: #222; }
  .form-input::-webkit-input-placeholder {
    color: #999; }
  .form-input::-moz-placeholder {
    color: #999; }
  .form-input:-ms-input-placeholder {
    color: #999; }
  .form-input:-moz-placeholder {
    color: #999; }
  .form-input::-webkit-input-placeholder {
    font-weight: 500; }
  .form-input::-moz-placeholder {
    font-weight: 500; }
  .form-input:-ms-input-placeholder {
    font-weight: 500; }
  .form-input:-moz-placeholder {
    font-weight: 500; }
  .form-input:focus {
    border: 1px solid transparent;
    -webkit-border-image-source: -webkit-linear-gradient(to right, #9face6, #74ebd5);
    -moz-border-image-source: -moz-linear-gradient(to right, #9face6, #74ebd5);
    -o-border-image-source: -o-linear-gradient(to right, #9face6, #74ebd5);
    border-image-source: linear-gradient(to right, #9face6, #74ebd5);
    -webkit-border-image-slice: 1;
    border-image-slice: 1;
    border-radius: 5px;
    -moz-border-radius: 5px;
    -webkit-border-radius: 5px;
    -o-border-radius: 5px;
    -ms-border-radius: 5px;
    background-origin: border-box;
    background-clip: content-box, border-box; }
    .form-input:focus::-webkit-input-placeholder {
      color: #222; }
    .form-input:focus::-moz-placeholder {
      color: #222; }
    .form-input:focus:-ms-input-placeholder {
      color: #222; }
    .form-input:focus:-moz-placeholder {
      color: #222; }
  </style>
</head>
<body>
  <!-- ======= Top Bar ======= -->
   <div id="topbar" class="d-none d-lg-flex align-items-left fixed-top">
    <div class="container">
      <div class="contact-info mr-auto">
         <i class="icofont-envelope"></i>  <a href="mailto:contact@example.com">forensicsys@gmail.com</a>
        <i class="icofont-phone"></i> +9134335349
      </div>
      <div class="social-links">
        <a href="#" class="twitter"><i class="icofont-twitter"></i></a>
        <a href="#" class="facebook"><i class="icofont-facebook"></i></a>
        <a href="#" class="instagram"><i class="icofont-instagram"></i></a>
        <a href="#" class="skype"><i class="icofont-skype"></i></a>
        <a href="#" class="linkedin"><i class="icofont-linkedin"></i></i></a>
      </div>
    </div>
  </div> 

                                                           <!-- header -->
       <header id="header">
     <nav class="navbar navbar-expand-lg navbar-dark bg-dark scrolling-navabr" >
      <div class="container">
  <div class="d-flex justify-content-start">
  <a class="navbar-brand" href="#">FORENSIC SYSTEM</a>
  </div>
 <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <!-- column auto start -->
  <div class="col-auto">
  <div class="collapse navbar-collapse" id="sticky-nav">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item ">
        <a class="nav-link" href="index">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item ">
        <a class="nav-link" href="#about">About</a>
      </li>
      <li class="nav-item ">
        <a class="nav-link" href="#services">Services</a>
      </li>
      
      <li class="nav-item ">
        <a class="nav-link" href="#contact">Contact</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="login">Login</a>
      </li>
    </ul>
    
  </div>
  </div><!-- column auto end -->
  </div>

</nav>

</header>


    <main class="d-flex align-items-center min-vh-100 py-3 py-md-0">
    <div class="container">
      <div class="card login-card">
        <div class="row no-gutters">
        
          <div class="col-md-12">
            <div class="card-body">
              
              <p class="login-card-description text-center"><i><b>Create Account</b></i></p>
              
              <form action="saveRegi" method="POST">
  <div class="form-row">
  	 <div class="form-group col-md-12">
              <select class="form-control" id="exampleFormControlSelect1" name="user" required>
                <option>Select</option>
                <option>Admin</option>
               <option>General_User</option>
              </select>
              </div>

  	<div class="form-group col-md-6">
      <input type="text" class="form-control" placeholder="First name" name="f_name" required>
    </div>
    <div class="form-group col-md-6">
      <input type="text" class="form-control" placeholder="Last name" name="l_name" >
    </div>
    <div class="form-group col-md-6">
       <label for="birthDate" class="col-sm-4 control-label">Date of Joining</label>
       <input type="date" id="birthDate" class="form-control" name="dob">
        
  </div>
    
   
<div class="form-group col-md-6">
	<label for="gender">Gender</label>
	<div class="form-group col-md-6">
  <div class="form-check-inline">
  <label class="form-check-label">
    <input type="radio" class="form-check-input" id="gender" name="gender" value="Male">Male
  </label>
</div>
<div class="form-check-inline">
  <label class="form-check-label">
    <input type="radio" class="form-check-input" id="gender" name="gender" value="Female">Female
  </label>
</div>
</div>
</div>
<div class="form-group col-md-6 ">
      <label for="inputEmail4">Email</label>
      <div class="input-group mb-2">
      <div class="input-group-prepend">
    
  </div>
      <input type="email" class="form-control" id="inputEmail4" placeholder="abc@gmail.com" name="mail" required>
    </div>
    </div>
 <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="password" class="form-control" id="inputPassword4" placeholder="**********" name="pwd" required>
    </div>

 
  </div>
  
   <div class="form-check">
                            <input type="checkbox" name="agree-term" id="agree-term" class="form-check-input" required>
                            <label for="agree-term" class="label-agree-term"><span><span></span></span>I agree all statements in  <a href="#" class="term-service">Terms of service</a></label>
                        </div>
               
  
 
  <button type="submit" class="btn btn-info form-group">Create Account</button>
</form>




               <p class="loginhere">
                        Have already an account ? <a href="login.html" class="loginhere-link">Login here</a>
                    </p>
            </div>
          </div>
        </div>
      </div>
      
    </div>
  </main>

 <!-- JS -->  <script src="/forensic_system/URLToResourcesFolder/assets/vendor/jquery/jquery.min.js"></script>
  <script src="/forensic_system/URLToResourcesFolder/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="/forensic_system/URLToResourcesFolder/assets/vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="/forensic_system/URLToResourcesFolder/assets/vendor/php-email-form/validate.js"></script>
  <script src="/forensic_system/URLToResourcesFolder/assets/vendor/waypoints/jquery.waypoints.min.js"></script>
  <script src="/forensic_system/URLToResourcesFolder/assets/vendor/counterup/counterup.min.js"></script>
  <script src="/forensic_system/URLToResourcesFolder/assets/vendor/owl.carousel/owl.carousel.min.js"></script>
  <script src="/forensic_system/URLToResourcesFolder/assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="/forensic_system/URLToResourcesFolder/assets/vendor/venobox/venobox.min.js"></script>
  <script src="/forensic_system/URLToResourcesFolder/assets/vendor/aos/aos.js"></script>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> -->   
 
  <!-- Template Main JS File -->
 <!--  <script src="/forensic_system/URLToResourcesFolder/assets/js/main.js"></script> --> 
    <script src="/forensic_system/URLToResourcesFolder/reg/vendor/jquery/jquery.min.js"></script>
 <script src="/forensic_system/URLToResourcesFolder/reg/js/main.js"> </script>
 
  
</body>
</html>

<!-- <form action="saveReg" method="post">
<input type="text" name= "user"><br>
<input type="text" name= "name"><br>
<input type="text" name= "mail"><br>
<input type="password" name= "pwd"><br>
<input type="submit" name="submit">
 -->

