<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>New Project User</h2>

	<form action="/saveprojectuser" method="post">
	userId:<input type="text" name="userId" ><br><br>
	taskId:<input type="text" name="taskId" ><br><br>
	assignStatus:<input type="text" name="assignStatus" ><br><br>
	<input type="submit" value="Submit ProjectUser" >
	
	</form>

</body>
</html>