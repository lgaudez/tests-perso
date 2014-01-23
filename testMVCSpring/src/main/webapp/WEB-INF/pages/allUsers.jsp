<%--
  Created by IntelliJ IDEA.
  User: leoG
  Date: 23/01/14
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>HI</title>
</head>
<body>
<h1>List of All Users</h1>
<ul>
    <c:forEach var="p" items="${users}">
        <li>${p.id} - ${p.firstname} - ${p.lastname} - ${p.email}</li>
    </c:forEach>
</ul>
</body>
</html>