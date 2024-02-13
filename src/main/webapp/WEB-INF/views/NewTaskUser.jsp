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
<h2>New Task User</h2>

	<form action="/savetaskuser" method="post">
	userId:
			<select name="userId" >
				<option value="-1" >--Select User--</option>
				<c:forEach items="${urs}" var="user" >
					<option value="${user.userId}" >${user.email}</option>
				</c:forEach>
			
			</select>
	
	<br><br>
	taskId:
			<select name="taskId" >
				<option value="-1" >--Select Task--</option>
				<c:forEach items="${tsk}" var="task" >
					<option value="${task.taskId}" >${task.title}</option>
				</c:forEach>
			
			</select>
	
	<br><br>
	assignStatus:
				<select name="assignStatus" >
				<option value="-1" >--Select Assign Status--</option>
				<option value="1" >Assign</option>
				<option value="2" >Revoke</option>
			
			</select>
	
	<br><br>
	statusId:
				<select name="statusId" >
				<option value="-1" >--Select Status--</option>
				<c:forEach items="${prSts}" var="pjSts" >
					<option value="${pjSts.projectStatusId}" >${pjSts.status}</option>
				</c:forEach>
			
			</select>
	
	<br><br>
	utilizedHours:<input type="number" name="utilizedHours" ><br><br>
	
	<input type="submit" value="Submit Task User" >
	
	</form>

</body>
</html>