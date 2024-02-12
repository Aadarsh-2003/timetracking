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
	<h2>List Task User</h2>

	${taskUsers.size()};
	
	<table border="1" align="center" >
		<tr>
			<th>UserId</th>
			<th>TaskId</th>
			<th>AssignStatus</th>
			<th>StatusId</th>
			<th>UtilizedHours</th>
		</tr>
		
		<c:forEach items="${taskUsers}" var="tsk" >
		
		<tr>
			<td>${tsk.userId}</td>
			<td>${tsk.taskId}</td>
			<td>${tsk.assignStatus}</td>
			<td>${tsk.statusId}</td>
			<td>${tsk.utilizedHours}</td>
		</tr>
		
		
		</c:forEach>
	
	</table>

</body>
</html>