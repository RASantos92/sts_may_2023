<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
</body>
</html>