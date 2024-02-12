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
	<h2>List Module</h2>

	${m.size()};
	
	<table border="1" align="center">
		<tr>
			<th>moduleName</th>
			<th>projectId</th>
			<th>status</th>
			<th>description</th>
			<th>docURL</th>
			<th>estimatedHours</th>
			<th>totalUtilizedHours</th>
			
		</tr>

		<c:forEach items="${m}" var="modu">
			<tr>
				<td>${modu.moduleName}</td>
				<td>${modu.projectId}</td>
				<td>${modu.status}</td>
				<td>${modu.description}</td>
				<td>${modu.docURL}</td>
				<td>${modu.estimatedHours}</td>
				<td>${modu.totalUtilizedHours}</td>
				
			</tr>
		</c:forEach>

	</table>

</body>
</html>