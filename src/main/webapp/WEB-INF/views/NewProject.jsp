<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/saveproject" method="post">
	
	ProjectTitle:<input type="text" name="projectTitle" ><br><br>
	Description:<input type="text" name="description" ><br><br>
	projectStatusId:<input type="number" name="projectStatusId" ><br><br>
	DocURL:<input type="text" name="docURL" ><br><br>
	EstimatedHours:<input type="text" name="estimatedHours" ><br><br>
	TotalUtilizedHours:<input type="text" name="totalUtilizedHours" ><br><br>
	ProjectStartDate:<input type="text" name="projectStartDate" ><br><br>
	ProjectCompletionDate:<input type="text" name="projectCompletionDate" ><br><br>
	
	<input type="submit" value="submit project" >

</form>

</body>
</html>