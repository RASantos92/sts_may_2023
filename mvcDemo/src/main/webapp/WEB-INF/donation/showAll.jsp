<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
	<thead>
		<tr>
			<th>Donation Name</th>
			<th>Donor</th>
			<th>Quantity</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="donation" items="${allDonations}">
			<tr>
				<td><c:out value="${donation.name}"/></td>
				<td><c:out value="${donation.donor}"/></td>
				<td><c:out value="${donation.quantity}"/></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>