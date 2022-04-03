<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save</title>
</head>
<body>
<h2>save location here\</h2>
<form action="savelocdata" method="post">
<table border= "1">
<tr>
<th>
Enter id<input type = text name = "id" >
</th>
<th>
Enter code<input type = text name = "codes">
</th>
<th>
Enter name<input type = text name = "name">
</th>
<th>
Enter type :
rural<input type = radio name = "type" value= "rural">
urban<input type = radio name = "type" value= "urban">

</th>

</tr>

</table>

<input type= submit value= save>
</form>
${msg}
</body>
</html>