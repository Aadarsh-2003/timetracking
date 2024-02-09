<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>New Task User</h2>

	<form action="/savetaskuser" method="post">
	userId:<input type="number" name="userId" ><br><br>
	taskId:<input type="number" name="taskId" ><br><br>
	assignStatus:<input type="number" name="assignStatus" ><br><br>
	statusId:<input type="number" name="statusId" ><br><br>
	utilizedHours:<input type="number" name="utilizedHours" ><br><br>
	
	<input type="submit" value="Submit Task User" >
	
	</form>

</body>
</html>