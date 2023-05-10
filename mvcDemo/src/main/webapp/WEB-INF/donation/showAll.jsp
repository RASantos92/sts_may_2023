<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<h1>Donate</h1>
<form:form action="/donations/process/create" method="post" modelAttribute="donation">
    <div class="form-group">
        <label>Donation Name</label>
        <form:input type="text" path="name" class="form-control" />
        <form:errors class="text-danger" path="name"/>
    </div>
    <div class="form-group">
        <label>Quantity</label>
        <form:input type="number" path="quantity" class="form-control" />
        <form:errors class="text-danger" path="quantity"/>
    </div>
    <div class="form-group">
        <label>Donor</label>
        <form:input type="text" path="donor" class="form-control" />
        <form:errors class="text-danger" path="donor"/>
    </div>
    <input type="submit" value="Add Donation" class="btn btn-primary" />
</form:form>

<form action="/donations/search">
	<input type="text" name="searchValue"/>
	<input type="submit" value="Search" class="btn btn-outline-success"/>
</form>
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
				<span class="d-flex">
				<a class="btn btn-outline-warning col" href="/donations/edit/${donation.id}">edit</a> 
				||
				<form class="col" action="/donations/delete/${donation.id}" method="post">
				    <input type="hidden" name="_method" value="delete">
				    <input class="btn btn-outline-danger" type="submit" value="Delete">
				</form>
				</span>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>