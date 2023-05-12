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
	<h1>Welcome to the Dashboard : ${loggedInUser.userName }</h1>
	<a href="/users/logout">Logout</a>
	<a href="/donations/create">Donate</a>
	<h1>All Donations</h1>
	<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Donation name</th>
      <th scope="col">Donor name</th>
      <th scope="col">quantity</th>
      <th>Action</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${allDonations}" var="donation">
    <tr>
			<td>${donation.id}</td>
			<td><a href="/donations/${donation.id}">${donation.name}</a></td>
			<td>${donation.donor.userName}</td>
			<td>${donation.quantity}</td>
			<c:if test="${user_id == donation.donor.id}">
			<td><a class="btn btn-outline-warning" href="/donations/edit/${donation.id}">Edit</a> || 
				<form action="/donations/delete/${donation.id}" method="post">
					<input type="hidden" value="delete" name="_method"/>
					<input class="btn btn-outline-danger" type="submit" value="delete"/>
				</form>
			</td>
			</c:if>
    </tr>
	</c:forEach>
  </tbody>
</table>
</body>
</html>