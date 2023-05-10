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
<a href="/donations/create">Donate</a>
<table>
	<thead>
		<tr>
			<th>Donation Name</th>
			<th>Donor</th>
			<th>Quantity</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="donation" items="${allDonations}">
			<tr>
				<td><c:out value="${donation.name}"/></td>
				<td><c:out value="${donation.donor}"/></td>
				<td><c:out value="${donation.quantity}"/></td>
				<td>
				<a class="btn btn-outline-warning" href="/donations/edit/${donation.id}">edit</a> 
				||
				<form action="/donations/delete/${donation.id}" method="post">
				    <input type="hidden" name="_method" value="delete">
				    <input class="btn btn-outline-danger" type="submit" value="Delete">
				</form>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>