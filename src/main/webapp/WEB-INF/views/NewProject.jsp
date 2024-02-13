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
<form action="/saveproject" method="post">
	
	ProjectTitle:<input type="text" name="projectTitle" ><br><br>
	Description:<input type="text" name="description" ><br><br>
	projectStatusId:<select name ="projectStatusId"">
						<option value="-1" >--Select project Status Id--</option>
						
						<c:forEach items="${prSts}" var="prStatus" >
							<option value="${prStatus.projectStatusId}" >${prStatus.status}</option>
						</c:forEach>
					</select>
	<br><br>
	DocURL:<input type="text" name="docURL" ><br><br>
	EstimatedHours:<input type="text" name="estimatedHours" ><br><br>
	TotalUtilizedHours:<input type="text" name="totalUtilizedHours" ><br><br>
	ProjectStartDate:<input type="text" name="projectStartDate" ><br><br>
	ProjectCompletionDate:<input type="text" name="projectCompletionDate" ><br><br>
	
	<input type="submit" value="submit project" >

</form>

</body>
</html>