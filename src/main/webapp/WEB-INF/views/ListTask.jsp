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
	<h2>List Task</h2>

	${tsk.size()}
	
	<table border="1" align="center" >
		<tr>
			<th>moduleId</th>
			<th>projectId</th>
			<th>status</th>
			<th>estimatedHours</th>
			<th>totalUtilizedHours</th>
			<th>docURL</th>
			<th>description</th>
			<th>title</th>
		</tr>
		
		<c:forEach items="${tsk}" var="tasks" >
		
		<tr>
			<td>${tasks.moduleId}</td>
			<td>${tasks.projectId}</td>
			<td>${tasks.status}</td>
			<td>${tasks.estimatedHours}</td>
			<td>${tasks.totalUtilizedHours}</td>
			<td>${tasks.docURL}</td>
			<td>${tasks.description}</td>
			<td>${tasks.title}</td>
		</tr>
		
		</c:forEach>
	
	</table>

</body>
</html>