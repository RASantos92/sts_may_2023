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
	<h1>Donation name:  <c:out value="${donation.name}"/></h1>
	<h1>Donor name:  <c:out value="${donation.donor.userName}"/></h1>
	<h1>Quantity:  <c:out value="${donation.quantity}"/></h1>
</body>
</html>