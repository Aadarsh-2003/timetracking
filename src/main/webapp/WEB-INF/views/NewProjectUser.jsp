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
	<h2>New Project User</h2>

	<form action="/saveprojectuser" method="post">
	userId:
			<select name="userId" >
					<option value="-1" >--Select User--</option>
					<c:forEach items="${usrs}" var="ursrr" >
						<option value="${ursrr.userId}" >${ursrr.email}</option>
					
					</c:forEach>
				
				</select>
	<br><br>
	projectId:
				<select name="projectId" >
					<option value="-1" >--Select Project--</option>
					<c:forEach items="${prj}" var="prjct" >
						<option value="${prjct.projectId}" >${prjct.projectTitle}</option>
					
					</c:forEach>
				
				</select>
	
	<br><br>
	assignStatus:
				<select name="assignStatus" >
					<option value="-1" >--Select Status--</option>
					<option value="1" >Assign</option>
					<option value="2" >Revoke</option>
				</select>
	<br><br>
	<input type="submit" value="Submit ProjectUser" >
	
	</form>

</body>
</html>