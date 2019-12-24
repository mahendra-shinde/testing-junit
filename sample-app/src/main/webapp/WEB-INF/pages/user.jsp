<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/css/main.css" var="demoCSS" />
 
<link href="${demoCSS}" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Account Detail</title>
</head>
<body>
    <h3>Hi ${account.firstname} ${account.lastname}!</h3>
 
    <p>Account Id: ${account.id} Reward Point:${account.rewardPoint}</p>
 
    <h3>Transaction Detail</h3>
 
    <table>
        <tr>
            <th>Date</th>
            <th>Payee</th>
            <th>Description</th>
            <th>Amount</th>
        </tr>
        <c:forEach var="listValue" items="${account.transactions}">
            <tr>
                <td>${listValue.createdDate}</td>
                <td>${listValue.payeeName}</td>
                <td>${listValue.description}</td>
                <td>${listValue.amount}</td>
            </tr>
        </c:forEach>
    </table>
 
</body>