<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>SignUp</h2>

<form action="saveuser" method="post">
FirstName : <input type="text" name="FirstName" placeholder="Avi" /><br><br>
LastName :<input type="text" name="LastName" /><br><br>
Email :<input type="email" name="Email" /><br><br>
Pass :<input type="password" name="Password" /><br><br>
<input type="submit" value ="Sign up" /><br><br>

</form>
<br>
<a href="login">Login</a> <!-- write accessing url in href tag -->


</body>
</html>