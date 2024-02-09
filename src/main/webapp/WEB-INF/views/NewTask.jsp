<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>New Task</h2>

	<form action="/savetask" method="post">
	moduleId:<input type="text" name="moduleId" ><br><br>
	projectId:<input type="text" name="projectId" ><br><br>
	status:<input type="text" name="status" ><br><br>
	estimatedHours:<input type="text" name="estimatedHours" ><br><br>
	totalUtilizedHours:<input type="text" name="totalUtilizedHours" ><br><br>
	docURL:<input type="text" name="docURL" ><br><br>
	description:<input type="text" name="description" ><br><br>
	title:<input type="text" name="title" ><br><br>
	
	<input type="submit" value="Submit Task" >
	</form>
</body>
</html>