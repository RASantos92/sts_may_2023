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
	<h1>Dashboard</h1>
	<a href="/users/create">Add User</a>
	<a href="/donations/create">Donate</a>
	<h1>All Donations</h1>
	<table class="table table-dark">
	  <thead>
	    <tr>
	      <th scope="col">id</th>
	      <th scope="col">Donation name</th>
	      <th scope="col">Donor name</th>
	      <th scope="col">Quantity</th>
	      <th>Action</th>
	    </tr>
	  </thead>
	  <tbody>
	    <c:forEach items="${allDonations}" var="donation">
	    <tr>
				<td>${donation.id}</td>
				<td>${donation.name}</td>
				<td>${donation.donor.userName}</td>
				<td>${donation.quantity}</td>
				<td><a class="btn btn-outline-warning" href="/donations/edit/${donation.id}">Edit</a>
	    </tr>
		</c:forEach>
	  </tbody>
	</table>
		<h1>All Donors</h1>
	<table class="table table-dark">
	  <thead>
	    <tr>
	      <th scope="col">id</th>
	      <th scope="col">Donor name</th>
	      <th scope="col">Email</th>
	      <th scope="col">How many donations</th>
	    </tr>
	  </thead>
	  <tbody>
	    <c:forEach items="${allUsers}" var="user">
	    <tr>
				<td>${user.id}</td>
				<td><a href="/users/${user.id}">${user.userName}</a></td>
				<td>${user.email}</td>
				<td>${user.donations.size()}</td>
	    </tr>
		</c:forEach>
	  </tbody>
	</table>
</body>
</html>