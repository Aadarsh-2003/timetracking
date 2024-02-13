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
	<h2>List Project Users</h2>

	${prusers.size()}
	
	<table border="1" align="center" >
		<tr>
			<th>userId</th>
			<th>projectId</th>
			<th>assignStatus</th>
		</tr>
		
		<c:forEach items="${prusers}" var="prur" >
			<tr>
				<th>${prur.userId}</th>
				<th>${prur.projectId}</th>
				<th>${prur.assignStatus}</th>
			</tr>
		
		</c:forEach>
	
	</table>
	
</body>
</html>