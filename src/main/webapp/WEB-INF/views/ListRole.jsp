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
	<h2>List Role</h2>
	${r.size()}
	
	<table border="1" align="center" >
		<tr>
			<th>Role Id</th>
			<th>Role Name</th>
		</tr>
		
		<c:forEach items="${r}" var="role" >
		<tr>
			<td>${role.roleId}</td>
			<td>${role.roleName}</td>
		</tr>
		
		</c:forEach>
	
	</table>

</body>
</html>