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
	<h2>New Module</h2>

	<form action="/savemodule" method="post">
	moduleName:<input type="text" name="moduleName" ><br><br>
	projectId:<select name="projectId" >
			 	<option value="-1" >--Select Project--</option>
			 	<c:forEach items="${prId}" var="proId" >
			 		<option value="${proId.projectId}" >${proId.projectTitle}</option>
			 	</c:forEach>
			 </select>
	
	<br><br>
	status:<select name="status" >
			 	<option value="-1" >--Select Status--</option>
			 	<c:forEach items="${prStatus}" var="proSts" >
			 		<option value="${proSts.projectStatusId}" >${proSts.status}</option>
			 	</c:forEach>
			 </select><br><br>
	description:<input type="text" name="description" ><br><br>
	docURL:<input type="text" name="docURL" ><br><br>
	estimatedHours:<input type="number" name="estimatedHours" ><br><br>
	totalUtilizedHours:<input type="number" name="totalUtilizedHours" ><br><br>
	<input type="submit" value="Submit Module" >
	</form>

</body>
</html>