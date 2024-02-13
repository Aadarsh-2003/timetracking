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
	<h2>New Task</h2>

	<form action="/savetask" method="post">
	moduleId:<select name="moduleId" >
			 	<option value="-1" >--Select Module--</option>
			 	<c:forEach items="${mdId}" var="moduId" >
			 		<option value="${moduId.moduleId}" >${moduId.moduleName}</option>
			 	</c:forEach>
			 </select><br><br>
	projectId:<select name="projectId" >
			 	<option value="-1" >--Select Project--</option>
			 	<c:forEach items="${prId}" var="proId" >
			 		<option value="${proId.projectId}" >${proId.projectTitle}</option>
			 	</c:forEach>
			 </select><br><br>
	status:<select name="status" >
			 	<option value="-1" >--Select Status--</option>
			 	<c:forEach items="${prStatus}" var="proSts" >
			 		<option value="${proSts.projectStatusId}" >${proSts.status}</option>
			 	</c:forEach>
			 </select><br><br>
	estimatedHours:<input type="text" name="estimatedHours" ><br><br>
	totalUtilizedHours:<input type="text" name="totalUtilizedHours" ><br><br>
	docURL:<input type="text" name="docURL" ><br><br>
	description:<input type="text" name="description" ><br><br>
	title:<input type="text" name="title" ><br><br>
	
	<input type="submit" value="Submit Task" >
	</form>
</body>
</html>