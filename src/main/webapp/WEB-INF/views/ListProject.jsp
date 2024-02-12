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
	<h2>List Project</h2>

	${pr.size() }

	<table border="1" align="center">
		<tr>
			<th>ProjectTitle</th>
			<th>Description</th>
			<th>projectStatusId</th>
			<th>DocURL</th>
			<th>EstimatedHours</th>
			<th>TotalUtilizedHours</th>
			<th>ProjectStartDate</th>
			<th>ProjectCompletionDate</th>
		</tr>

		<c:forEach items="${pr}" var="prj">
			<tr>
				<td>${prj.projectTitle}</td>
				<td>${prj.description}</td>
				<td>${prj.projectStatusId}</td>
				<td>${prj.docURL}</td>
				<td>${prj.estimatedHours}</td>
				<td>${prj.totalUtilizedHours}</td>
				<td>${prj.projectStartDate}</td>
				<td>${prj.projectCompletionDate}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>