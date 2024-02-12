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
	gender: Male<input type="radio" value="male" name="gender">
			Female<input type="radio" value="female" name="gender"><br><br>
	contactNumber:<input type="number" name="contactNumber"><br><br>
	dob:<input type="date" name="dob"><br><br>
	address:<textarea rows="5" cols="20" name="address" ></textarea>  <br><br>
	
	city:	<select name="city">
				<option value="-1" >Select City</option>
				<option value="ahmedabad" >Ahmedabad</option>
				<option value="mumbai" >Mumbai</option>
				<option value="pune" >Pune</option>
			</select> <br><br>
	state:<select name="state">
				<option value="-1" >Select State</option>
				<option value="gujarat" >Gujarat</option>
				<option value="maharashtra" >Maharashtra</option>
				<option value="mehsana" >Mehsana</option>
			</select><br><br>
	
	roleId:<input type="text" name="roleId"><br><br>
	<input type="submit" value="Submit User" >
	</form>
</body>
</html>