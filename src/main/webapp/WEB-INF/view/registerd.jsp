<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>view Registered</title>
</head>
<body>
<div class="container">
<h1>FMS</h1>

<table class="table">

  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">User</th>
      <th scope="col">Name</th>
      <th scope="col">Mail</th>
      <th scope="col">Password</th>
    </tr>
  </thead>
<c:forEach var="reg" items="${Registrations}">
    <tr>
      <td>${reg.id}</td>
      <td>${reg.user}</td>
      <td>${reg.name}</td>
      <td>${reg.mail}</td>
      <td>${reg.pwd}</td>
    </tr>
 </c:forEach> 
</table>
</div>

	<%-- ${reg.id}
	${reg.user}
	${reg.name}
	${reg.mail}
	${reg.pwd}
	<br> --%>


</body>
</html>