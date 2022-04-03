<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location details</title>
</head>
<body>
	<table border=1 style = color:red>
		<tr>
			<th>ID</th>
			<th>Code</th>
			<th>Name</th>
			<th>Type</th>
			<th>Delete</th>
			<th>update</th>
		</tr>
	
			<c:forEach items="${location}" var="locations">
			<tr>
			<td><c:out value="${locations.id}"></c:out></td>
			<td><c:out value="${locations.codes}"></c:out></td>
			<td><c:out value="${locations.name}"></c:out></td>
			<td><c:out value="${locations.type}"></c:out></td>
			<td><a href ="delete?id=${locations.id}" >delete</a></td>
			<td><a href ="update?id=${locations.id}" >update</a></td>
			</tr>
		</c:forEach>
		
			
	</table>
	${msg}
</body>
</html>