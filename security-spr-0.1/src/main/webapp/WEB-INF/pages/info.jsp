<%--
  Created by IntelliJ IDEA.
  User: leoG
  Date: 24/01/14
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info user ${user.firstName} ${user.lastName}</title>
</head>
<body>
<ul>
    <li><spring:message code="label.login"/> : ${user.login}</li>
    <li><spring:message code="label.firstname"/>  : ${user.firstName}</li>
    <li><spring:message code="label.lastname"/> : ${user.lastName}</li>
    <li><spring:message code="label.email"/> : ${user.mail}</li>
    <li><spring:message code="label.citizenship"/> : ${user.citizenShip}</li>
    <li><spring:message code="label.spokenlanguages"/> : ${user.spokenLanguages}</li>
    <li><spring:message code="label.dateofbirth"/> : ${user.dateOfBirth}</li>
</ul>
</body>
</html>
