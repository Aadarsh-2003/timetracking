<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	projectId:<input type="number" name="projectId" ><br><br>
	status:<input type="number" name="status" ><br><br>
	description:<input type="text" name="description" ><br><br>
	docURL:<input type="text" name="docURL" ><br><br>
	estimatedHours:<input type="number" name="estimatedHours" ><br><br>
	totalUtilizedHours:<input type="number" name="totalUtilizedHours" ><br><br>
	<input type="submit" value="Submit Module" >
	</form>

</body>
</html>