<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/savenewuser" method="post">

	firstName:<input type="text" name="firstName"><br><br>
	lastName:<input type="text" name="lastName"><br><br>
	email:<input type="email" name="email"><br><br>
	password:<input type="password" name="password"><br><br>
	gender:<input type="text" name="gender"><br><br>
	contactNumber:<input type="number" name="contactNumber"><br><br>
	dob:<input type="text" name="dob"><br><br>
	address:<input type="text" name="address"><br><br>
	city:<input type="text" name="city"><br><br>
	state:<input type="text" name="state"><br><br>
	otp:<input type="number" name="otp"><br><br>
	roleId:<input type="text" name="roleId"><br><br>
	<input type="submit" value="Submit User" >
	</form>
</body>
</html>