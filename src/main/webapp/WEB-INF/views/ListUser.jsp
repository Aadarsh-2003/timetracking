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
	<h2>List User</h2>

	${ur.size()}
	<table border="1" align="center" >
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>password</th>
			<th>gender</th>
			<th>contactNumber</th>
			<th>dob</th>
			<th>address</th>
			<th>city</th>
			<th>state</th>
			<th>roleId</th>
		</tr>
		
		<c:forEach items="${ur}" var="users">
		<tr>
			<td>${users.firstName}</td>
			<td>${users.lastName}</td>
			<td>${users.email}</td>
			<td>${users.password}</td>
			<td>${users.gender}</td>
			<td>${users.contactNumber}</td>
			<td>${users.dob}</td>
			<td>${users.address}</td>
			<td>${users.city}</td>
			<td>${users.state}</td>
			<td>${users.roleId}</td>
		</tr>
		</c:forEach>
	
	</table>
	
	

</body>
</html>