<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h2>Welcome To Register Page</h2></center>
<hr color="#007010">
<form action="saveRegistration">
First Name : <input type="text" name="firstName" required/><br>
Last Name : <input type="text" name="lastName" required/><br>
User Name : <input type="text" name="id" required/><br>
Email : <input type="email" name="email" required/><br>
Password : <input type="password" name="password" required/><br>
<input type="submit" value="Submit">
</form> 
</body>
</html>