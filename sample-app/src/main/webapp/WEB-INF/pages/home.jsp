<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 
<html>
<head>
<title>home</title>
</head>
<body>
    <h1>Spring Boot Web JSP Example</h1>
    <h3>The server time is ${serverTime}.</h3>
    <form action="user" method="post">
        User Name : <input type="text" name="userName" id="username">
        <input type="submit" value="Login" id="login">
    </form>
</body>
</html>