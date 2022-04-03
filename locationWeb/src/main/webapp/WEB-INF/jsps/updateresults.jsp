<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update results here</title>
</head>
<body>
	<form action="updatevalues" method="post">
		<table border="1">
			<tr>
				<th>id<input type=text name="id" value = "${locs.id}" readonly>
				</th>
				<th>code<input type=text name="codes" value = "${locs.codes}" >
				</th>
				<th>name<input type=text name="name" value = "${locs.name}" >
				</th>
				<th>type : rural<input type=radio name="type" value="rural">
					urban<input type=radio name="type" value="urban">
				</th>
			</tr>
		</table>
		<input type=submit value=update>
	</form>
</body>
</html>