<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>List Technology</h2>

	${tech.size()};
	
	<table border="1" align="center" >
		<tr>
			<th>Technology</th>
		</tr>
		
		<c:forEach items="${tech}" var="itm">
		<tr>
			<td>${itm.title}</td>
		</tr>
		</c:forEach>
		
		
	
	</table>

</body>
</html>