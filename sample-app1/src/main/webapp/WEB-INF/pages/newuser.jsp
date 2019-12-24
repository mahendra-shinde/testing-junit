<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New User</title>
</head>
<body>
    <h2>User ${userName} is not found in the system. Create it!</h2>
 
    <form:form action="user/save" method="post" modelAttribute="account">
        <p>
            <input type="submit" value="Save" id="save">
        </p>
        <table>
            <tr>
                <td>User Name :</td>
                <td><input type="text" name="username" id="username"
                    value="${userName}"></td>
            </tr>
            <tr>
                <td>First Name :</td>
                <td><input type="text" name="firstname" id="firstname"></td>
            </tr>
            <tr>
                <td>Last Name :</td>
                <td><input type="text" name="lasttname" id="lasttname"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>