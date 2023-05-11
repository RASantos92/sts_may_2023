<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	    <h1>create a donation</h1>
    <form:form action="/donations/process/create" modelAttribute="donation" method="post">
        <div>
            <form:label path="name" > Donation Name</form:label>
            <form:input type="text" path="name"/>
            <form:errors path="name"/>
        </div>
        <div>
            <form:label path="quantity" > Quantity</form:label>
            <form:input type="text" path="quantity"/>
            <form:errors path="quantity"/>
        </div>
        <label>Select Donor</label>
        <form:select path="donor">
        	<c:forEach var="user" items="${allUsers}">
        		<form:option value="${user.id}"><c:out value="${user.userName}"/></form:option>
        	</c:forEach>
        </form:select>
        <input type="submit" value="add donation"/>
    </form:form>
</body>
</html>