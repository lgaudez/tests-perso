<%--
  Created by IntelliJ IDEA.
  User: leoG
  Date: 24/01/14
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info utilisateur ${user.firstName} ${user.lastName}</title>
</head>
<body>
<ul>
    <li>prénom : ${user.firstName}</li>
    <li>nom : ${user.lastName}</li>
    <li>mail : ${user.mail}</li>
    <li>nationalité : ${user.citizenShip}</li>
    <li>langues parlées : ${user.spokenLanguages}</li>
    <li>Date de naissance : ${user.dateOfBirth}</li>
</ul>
</body>
</html>
