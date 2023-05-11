<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Donor name: <c:out value="${user.userName}"/></h1>
<h1>Donor email: <c:out value="${user.email}"/></h1>
<h1>All of <c:out value="${user.userName }"/> donations</h1>
<table class="table table-dark">
	  <thead>
	    <tr>
	      <th scope="col">id</th>
	      <th scope="col">Donation name</th>
	      <th scope="col">Quantity</th>
	    </tr>
	  </thead>
	  <tbody>
	    <c:forEach items="${user.donations}" var="donation">
	    <tr>
				<td>${donation.id}</td>
				<td>${donation.name}</td>
				<td>${donation.quantity}</td>
	    </tr>
		</c:forEach>
	  </tbody>
	</table>


</body>
</html>